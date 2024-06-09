
package net.mcreator.mddo.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mddo.world.inventory.FoodGUIMenu;
import net.mcreator.mddo.procedures.RemoveOutputProcedure;
import net.mcreator.mddo.block.entity.FoodWorkbenchBlockEntity;

import io.netty.buffer.Unpooled;

public class FoodWorkbenchBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FoodWorkbenchBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(3, 16, 1, 8, 17, 2), box(3, 16, 9, 8, 17, 10), box(1, 16, 3, 2, 17, 8), box(9, 16, 3, 10, 17, 8), box(5, 17, 11, 6, 18, 16), box(5, 16, 10, 6, 17, 11),
					box(2, 16, 6, 3, 17, 9), box(6, 16, 8, 8, 17, 9), box(3, 16, 7, 4, 17, 8), box(7, 16, 7, 8, 17, 8), box(7, 16, 3, 8, 17, 4), box(3, 16, 3, 4, 17, 4), box(3, 16, 8, 5, 17, 9), box(6, 16, 2, 8, 17, 3), box(3, 16, 2, 5, 17, 3),
					box(2, 16, 2, 3, 17, 5), box(13, 0, 1, 15, 9, 3), box(1, 0, 13, 3, 9, 15), box(13, 0, 13, 15, 9, 15), box(1, 0, 1, 3, 9, 3), box(8, 16, 6, 9, 17, 9), box(8, 16, 2, 9, 17, 5));
			case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(8, 16, 14, 13, 17, 15), box(8, 16, 6, 13, 17, 7), box(14, 16, 8, 15, 17, 13), box(6, 16, 8, 7, 17, 13), box(10, 17, 0, 11, 18, 5), box(10, 16, 5, 11, 17, 6),
					box(13, 16, 7, 14, 17, 10), box(8, 16, 7, 10, 17, 8), box(12, 16, 8, 13, 17, 9), box(8, 16, 8, 9, 17, 9), box(8, 16, 12, 9, 17, 13), box(12, 16, 12, 13, 17, 13), box(11, 16, 7, 13, 17, 8), box(8, 16, 13, 10, 17, 14),
					box(11, 16, 13, 13, 17, 14), box(13, 16, 11, 14, 17, 14), box(1, 0, 13, 3, 9, 15), box(13, 0, 1, 15, 9, 3), box(1, 0, 1, 3, 9, 3), box(13, 0, 13, 15, 9, 15), box(7, 16, 7, 8, 17, 10), box(7, 16, 11, 8, 17, 14));
			case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(1, 16, 8, 2, 17, 13), box(9, 16, 8, 10, 17, 13), box(3, 16, 14, 8, 17, 15), box(3, 16, 6, 8, 17, 7), box(11, 17, 10, 16, 18, 11), box(10, 16, 10, 11, 17, 11),
					box(6, 16, 13, 9, 17, 14), box(8, 16, 8, 9, 17, 10), box(7, 16, 12, 8, 17, 13), box(7, 16, 8, 8, 17, 9), box(3, 16, 8, 4, 17, 9), box(3, 16, 12, 4, 17, 13), box(8, 16, 11, 9, 17, 13), box(2, 16, 8, 3, 17, 10),
					box(2, 16, 11, 3, 17, 13), box(2, 16, 13, 5, 17, 14), box(1, 0, 1, 3, 9, 3), box(13, 0, 13, 15, 9, 15), box(13, 0, 1, 15, 9, 3), box(1, 0, 13, 3, 9, 15), box(6, 16, 7, 9, 17, 8), box(2, 16, 7, 5, 17, 8));
			case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(14, 16, 3, 15, 17, 8), box(6, 16, 3, 7, 17, 8), box(8, 16, 1, 13, 17, 2), box(8, 16, 9, 13, 17, 10), box(0, 17, 5, 5, 18, 6), box(5, 16, 5, 6, 17, 6),
					box(7, 16, 2, 10, 17, 3), box(7, 16, 6, 8, 17, 8), box(8, 16, 3, 9, 17, 4), box(8, 16, 7, 9, 17, 8), box(12, 16, 7, 13, 17, 8), box(12, 16, 3, 13, 17, 4), box(7, 16, 3, 8, 17, 5), box(13, 16, 6, 14, 17, 8),
					box(13, 16, 3, 14, 17, 5), box(11, 16, 2, 14, 17, 3), box(13, 0, 13, 15, 9, 15), box(1, 0, 1, 3, 9, 3), box(1, 0, 13, 3, 9, 15), box(13, 0, 1, 15, 9, 3), box(7, 16, 8, 10, 17, 9), box(11, 16, 8, 14, 17, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		RemoveOutputProcedure.execute(entity);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Food workbench");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new FoodGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new FoodWorkbenchBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof FoodWorkbenchBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof FoodWorkbenchBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}

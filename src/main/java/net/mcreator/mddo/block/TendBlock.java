
package net.mcreator.mddo.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mddo.procedures.TendPlacedProcedure;
import net.mcreator.mddo.procedures.TendDestroyedByPlayerProcedure;
import net.mcreator.mddo.procedures.SleepProcedure;

public class TendBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TendBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(15, 1, 0, 16, 3, 16), box(14, 3, 0, 15, 5, 16), box(13, 5, 0, 14, 7, 16), box(12, 7, 0, 13, 9, 16), box(11, 9, 0, 12, 11, 16), box(10, 11, 0, 11, 13, 16), box(1, 3, 0, 2, 5, 16),
					box(2, 5, 0, 3, 7, 16), box(3, 7, 0, 4, 9, 16), box(4, 9, 0, 5, 11, 16), box(5, 11, 0, 6, 13, 16), box(6, 13, 0, 7, 15, 16), box(7, 15, 0, 8, 16, 16), box(9, 13, 0, 10, 15, 16), box(8, 15, 0, 9, 16, 16), box(0, 1, 0, 1, 3, 16),
					box(13, 1, 14, 15, 2, 15), box(11, 2, 14, 15, 3, 15), box(10, 3, 14, 14, 4, 15), box(9, 4, 14, 14, 5, 15), box(7, 6, 14, 13, 7, 15), box(8, 5, 14, 13, 6, 15), box(6, 7, 14, 12, 8, 15), box(5, 8, 14, 12, 9, 15),
					box(5, 9, 14, 11, 11, 15), box(6, 11, 14, 10, 13, 15), box(7, 13, 14, 9, 15, 15));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 1, 3, 16), box(1, 3, 0, 2, 5, 16), box(2, 5, 0, 3, 7, 16), box(3, 7, 0, 4, 9, 16), box(4, 9, 0, 5, 11, 16), box(5, 11, 0, 6, 13, 16), box(14, 3, 0, 15, 5, 16),
					box(13, 5, 0, 14, 7, 16), box(12, 7, 0, 13, 9, 16), box(11, 9, 0, 12, 11, 16), box(10, 11, 0, 11, 13, 16), box(9, 13, 0, 10, 15, 16), box(8, 15, 0, 9, 16, 16), box(6, 13, 0, 7, 15, 16), box(7, 15, 0, 8, 16, 16),
					box(15, 1, 0, 16, 3, 16), box(1, 1, 1, 3, 2, 2), box(1, 2, 1, 5, 3, 2), box(2, 3, 1, 6, 4, 2), box(2, 4, 1, 7, 5, 2), box(3, 6, 1, 9, 7, 2), box(3, 5, 1, 8, 6, 2), box(4, 7, 1, 10, 8, 2), box(4, 8, 1, 11, 9, 2),
					box(5, 9, 1, 11, 11, 2), box(6, 11, 1, 10, 13, 2), box(7, 13, 1, 9, 15, 2));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 16, 3, 1), box(0, 3, 1, 16, 5, 2), box(0, 5, 2, 16, 7, 3), box(0, 7, 3, 16, 9, 4), box(0, 9, 4, 16, 11, 5), box(0, 11, 5, 16, 13, 6), box(0, 3, 14, 16, 5, 15),
					box(0, 5, 13, 16, 7, 14), box(0, 7, 12, 16, 9, 13), box(0, 9, 11, 16, 11, 12), box(0, 11, 10, 16, 13, 11), box(0, 13, 9, 16, 15, 10), box(0, 15, 8, 16, 16, 9), box(0, 13, 6, 16, 15, 7), box(0, 15, 7, 16, 16, 8),
					box(0, 1, 15, 16, 3, 16), box(14, 1, 1, 15, 2, 3), box(14, 2, 1, 15, 3, 5), box(14, 3, 2, 15, 4, 6), box(14, 4, 2, 15, 5, 7), box(14, 6, 3, 15, 7, 9), box(14, 5, 3, 15, 6, 8), box(14, 7, 4, 15, 8, 10), box(14, 8, 4, 15, 9, 11),
					box(14, 9, 5, 15, 11, 11), box(14, 11, 6, 15, 13, 10), box(14, 13, 7, 15, 15, 9));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 15, 16, 3, 16), box(0, 3, 14, 16, 5, 15), box(0, 5, 13, 16, 7, 14), box(0, 7, 12, 16, 9, 13), box(0, 9, 11, 16, 11, 12), box(0, 11, 10, 16, 13, 11), box(0, 3, 1, 16, 5, 2),
					box(0, 5, 2, 16, 7, 3), box(0, 7, 3, 16, 9, 4), box(0, 9, 4, 16, 11, 5), box(0, 11, 5, 16, 13, 6), box(0, 13, 6, 16, 15, 7), box(0, 15, 7, 16, 16, 8), box(0, 13, 9, 16, 15, 10), box(0, 15, 8, 16, 16, 9), box(0, 1, 0, 16, 3, 1),
					box(1, 1, 13, 2, 2, 15), box(1, 2, 11, 2, 3, 15), box(1, 3, 10, 2, 4, 14), box(1, 4, 9, 2, 5, 14), box(1, 6, 7, 2, 7, 13), box(1, 5, 8, 2, 6, 13), box(1, 7, 6, 2, 8, 12), box(1, 8, 5, 2, 9, 12), box(1, 9, 5, 2, 11, 11),
					box(1, 11, 6, 2, 13, 10), box(1, 13, 7, 2, 15, 9));
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
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		TendPlacedProcedure.execute(world, x, y, z, blockstate);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		TendDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		SleepProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}

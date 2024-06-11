
package net.mcreator.mddo.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CookingStandWorkBenchBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CookingStandWorkBenchBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 0, 1, 15, 8, 9), box(0, 8, 1, 16, 10, 10), box(1, 10, 1, 15, 12, 10), box(3, 13, 1, 13, 14, 10), box(2, 12, 1, 14, 13, 10), box(4, 14, 1, 12, 15, 10), box(6, 15, 1, 10, 16, 14), box(15, 1, 15, 16, 8, 16),
					box(15, 1, 0, 16, 8, 1), box(0, 1, 15, 1, 8, 16), box(0, 1, 0, 1, 8, 1), box(0, 0, 0, 16, 1, 16), box(1, 7, 10, 15, 8, 15), box(1, 7, 15, 15, 8, 16), box(1, 7, 0, 15, 8, 1), box(15, 7, 1, 16, 8, 15), box(0, 7, 1, 1, 8, 15),
					box(15, 8, 10, 16, 10, 15), box(12, 13, 10, 13, 14, 15), box(3, 13, 10, 4, 14, 15), box(13, 12, 10, 14, 13, 15), box(2, 12, 10, 3, 13, 15), box(4, 14, 10, 6, 15, 15), box(10, 14, 10, 12, 15, 15), box(6, 15, 14, 10, 16, 15),
					box(0, 8, 10, 1, 10, 15), box(14, 10, 10, 15, 12, 15), box(1, 10, 10, 2, 12, 15));
			case NORTH -> Shapes.or(box(1, 0, 7, 15, 8, 15), box(0, 8, 6, 16, 10, 15), box(1, 10, 6, 15, 12, 15), box(3, 13, 6, 13, 14, 15), box(2, 12, 6, 14, 13, 15), box(4, 14, 6, 12, 15, 15), box(6, 15, 2, 10, 16, 15), box(0, 1, 0, 1, 8, 1),
					box(0, 1, 15, 1, 8, 16), box(15, 1, 0, 16, 8, 1), box(15, 1, 15, 16, 8, 16), box(0, 0, 0, 16, 1, 16), box(1, 7, 1, 15, 8, 6), box(1, 7, 0, 15, 8, 1), box(1, 7, 15, 15, 8, 16), box(0, 7, 1, 1, 8, 15), box(15, 7, 1, 16, 8, 15),
					box(0, 8, 1, 1, 10, 6), box(3, 13, 1, 4, 14, 6), box(12, 13, 1, 13, 14, 6), box(2, 12, 1, 3, 13, 6), box(13, 12, 1, 14, 13, 6), box(10, 14, 1, 12, 15, 6), box(4, 14, 1, 6, 15, 6), box(6, 15, 1, 10, 16, 2),
					box(15, 8, 1, 16, 10, 6), box(1, 10, 1, 2, 12, 6), box(14, 10, 1, 15, 12, 6));
			case EAST -> Shapes.or(box(1, 0, 1, 9, 8, 15), box(1, 8, 0, 10, 10, 16), box(1, 10, 1, 10, 12, 15), box(1, 13, 3, 10, 14, 13), box(1, 12, 2, 10, 13, 14), box(1, 14, 4, 10, 15, 12), box(1, 15, 6, 14, 16, 10), box(15, 1, 0, 16, 8, 1),
					box(0, 1, 0, 1, 8, 1), box(15, 1, 15, 16, 8, 16), box(0, 1, 15, 1, 8, 16), box(0, 0, 0, 16, 1, 16), box(10, 7, 1, 15, 8, 15), box(15, 7, 1, 16, 8, 15), box(0, 7, 1, 1, 8, 15), box(1, 7, 0, 15, 8, 1), box(1, 7, 15, 15, 8, 16),
					box(10, 8, 0, 15, 10, 1), box(10, 13, 3, 15, 14, 4), box(10, 13, 12, 15, 14, 13), box(10, 12, 2, 15, 13, 3), box(10, 12, 13, 15, 13, 14), box(10, 14, 10, 15, 15, 12), box(10, 14, 4, 15, 15, 6), box(14, 15, 6, 15, 16, 10),
					box(10, 8, 15, 15, 10, 16), box(10, 10, 1, 15, 12, 2), box(10, 10, 14, 15, 12, 15));
			case WEST -> Shapes.or(box(7, 0, 1, 15, 8, 15), box(6, 8, 0, 15, 10, 16), box(6, 10, 1, 15, 12, 15), box(6, 13, 3, 15, 14, 13), box(6, 12, 2, 15, 13, 14), box(6, 14, 4, 15, 15, 12), box(2, 15, 6, 15, 16, 10), box(0, 1, 15, 1, 8, 16),
					box(15, 1, 15, 16, 8, 16), box(0, 1, 0, 1, 8, 1), box(15, 1, 0, 16, 8, 1), box(0, 0, 0, 16, 1, 16), box(1, 7, 1, 6, 8, 15), box(0, 7, 1, 1, 8, 15), box(15, 7, 1, 16, 8, 15), box(1, 7, 15, 15, 8, 16), box(1, 7, 0, 15, 8, 1),
					box(1, 8, 15, 6, 10, 16), box(1, 13, 12, 6, 14, 13), box(1, 13, 3, 6, 14, 4), box(1, 12, 13, 6, 13, 14), box(1, 12, 2, 6, 13, 3), box(1, 14, 4, 6, 15, 6), box(1, 14, 10, 6, 15, 12), box(1, 15, 6, 2, 16, 10),
					box(1, 8, 0, 6, 10, 1), box(1, 10, 14, 6, 12, 15), box(1, 10, 1, 6, 12, 2));
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
					return Component.literal("Brick oven");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new CookingStandMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
		return new CookingStandWorkBenchBlockEntity(pos, state);
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
			if (blockEntity instanceof CookingStandWorkBenchBlockEntity be) {
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
		if (tileentity instanceof CookingStandWorkBenchBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
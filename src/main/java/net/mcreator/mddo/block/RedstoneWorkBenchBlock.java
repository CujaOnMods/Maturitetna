
package net.mcreator.mddo.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RedstoneWorkBenchBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public RedstoneWorkBenchBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
			default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(6, 16, 3, 7, 18, 4), box(3, 16, 10, 4, 19, 11), box(2, 16, 10, 4, 17, 11), box(11, 16, 2, 14, 19, 5), box(8, 16, 3, 9, 18, 4), box(13, 0, 1, 15, 9, 3),
					box(1, 0, 13, 3, 9, 15), box(13, 0, 13, 15, 9, 15), box(1, 0, 1, 3, 9, 3));
			case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(9, 16, 12, 10, 18, 13), box(12, 16, 5, 13, 19, 6), box(12, 16, 5, 14, 17, 6), box(2, 16, 11, 5, 19, 14), box(7, 16, 12, 8, 18, 13), box(1, 0, 13, 3, 9, 15),
					box(13, 0, 1, 15, 9, 3), box(1, 0, 1, 3, 9, 3), box(13, 0, 13, 15, 9, 15));
			case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(3, 16, 9, 4, 18, 10), box(10, 16, 12, 11, 19, 13), box(10, 16, 12, 11, 17, 14), box(2, 16, 2, 5, 19, 5), box(3, 16, 7, 4, 18, 8), box(1, 0, 1, 3, 9, 3),
					box(13, 0, 13, 15, 9, 15), box(13, 0, 1, 15, 9, 3), box(1, 0, 13, 3, 9, 15));
			case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(12, 16, 6, 13, 18, 7), box(5, 16, 3, 6, 19, 4), box(5, 16, 2, 6, 17, 4), box(11, 16, 11, 14, 19, 14), box(12, 16, 8, 13, 18, 9), box(13, 0, 13, 15, 9, 15),
					box(1, 0, 1, 3, 9, 3), box(1, 0, 13, 3, 9, 15), box(13, 0, 1, 15, 9, 3));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
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
					return Component.literal("Redstone Work Bench");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new RedstoneWorkBenchGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
		return new RedstoneWorkBenchBlockEntity(pos, state);
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
			if (blockEntity instanceof RedstoneWorkBenchBlockEntity be) {
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
		if (tileentity instanceof RedstoneWorkBenchBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}

package net.mcreator.mddo.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StoneworkingBenchBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public StoneworkingBenchBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(10, 18, 3, 14, 19, 5), box(10, 16, 2, 15, 18, 6), box(12, 17.61732, 5.49033, 14, 18.61732, 11.49033), box(6, 16, 9, 7, 17, 13), box(7, 16, 2, 10, 18, 5),
					box(13, 0, 1, 15, 9, 3), box(1, 0, 13, 3, 9, 15), box(13, 0, 13, 15, 9, 15), box(1, 0, 1, 3, 9, 3));
			case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(2, 18, 11, 6, 19, 13), box(1, 16, 10, 6, 18, 14), box(2, 17.61732, 4.50967, 4, 18.61732, 10.50967), box(9, 16, 3, 10, 17, 7), box(6, 16, 11, 9, 18, 14),
					box(1, 0, 13, 3, 9, 15), box(13, 0, 1, 15, 9, 3), box(1, 0, 1, 3, 9, 3), box(13, 0, 13, 15, 9, 15));
			case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(3, 18, 2, 5, 19, 6), box(2, 16, 1, 6, 18, 6), box(5.49033, 17.61732, 2, 11.49033, 18.61732, 4), box(9, 16, 9, 13, 17, 10), box(2, 16, 6, 5, 18, 9),
					box(1, 0, 1, 3, 9, 3), box(13, 0, 13, 15, 9, 15), box(13, 0, 1, 15, 9, 3), box(1, 0, 13, 3, 9, 15));
			case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 9, 1, 15, 14, 15), box(11, 18, 10, 13, 19, 14), box(10, 16, 10, 14, 18, 15), box(4.50967, 17.61732, 12, 10.50967, 18.61732, 14), box(3, 16, 6, 7, 17, 7), box(11, 16, 7, 14, 18, 10),
					box(13, 0, 13, 15, 9, 15), box(1, 0, 1, 3, 9, 3), box(1, 0, 13, 3, 9, 15), box(13, 0, 1, 15, 9, 3));
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
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		RemoveOutputProcedure.execute(entity);
		return retval;
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
					return Component.literal("Stoneworking Bench");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new StoneworkingGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
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
		return new StoneworkingBenchBlockEntity(pos, state);
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
			if (blockEntity instanceof StoneworkingBenchBlockEntity be) {
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
		if (tileentity instanceof StoneworkingBenchBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
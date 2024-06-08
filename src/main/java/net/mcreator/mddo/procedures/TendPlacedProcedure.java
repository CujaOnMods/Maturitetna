package net.mcreator.mddo.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mddo.init.MddoModBlocks;

public class TendPlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y, z + 1), MddoModBlocks.TENT_2.get().defaultBlockState(), 3);
				{
					Direction _dir = (new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							else if (_bs.hasProperty(BlockStateProperties.AXIS))
								return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
							else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
								return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(BlockPos.containing(x, y, z)));
					BlockPos _pos = BlockPos.containing(x, y, z + 1);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			} else if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == MddoModBlocks.TENT_2.get())) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else {
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.SOUTH) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z - 1), MddoModBlocks.TENT_2.get().defaultBlockState(), 3);
					{
						Direction _dir = (new Object() {
							public Direction getDirection(BlockPos pos) {
								BlockState _bs = world.getBlockState(pos);
								Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (property != null && _bs.getValue(property) instanceof Direction _dir)
									return _dir;
								else if (_bs.hasProperty(BlockStateProperties.AXIS))
									return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
								else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
									return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
								return Direction.NORTH;
							}
						}.getDirection(BlockPos.containing(x, y, z)));
						BlockPos _pos = BlockPos.containing(x, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == MddoModBlocks.TENT_2.get())) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
			} else {
				if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection(blockstate)) == Direction.WEST) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x + 1, y, z), MddoModBlocks.TENT_2.get().defaultBlockState(), 3);
						{
							Direction _dir = (new Object() {
								public Direction getDirection(BlockPos pos) {
									BlockState _bs = world.getBlockState(pos);
									Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (property != null && _bs.getValue(property) instanceof Direction _dir)
										return _dir;
									else if (_bs.hasProperty(BlockStateProperties.AXIS))
										return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
									else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
										return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
									return Direction.NORTH;
								}
							}.getDirection(BlockPos.containing(x, y, z)));
							BlockPos _pos = BlockPos.containing(x + 1, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == MddoModBlocks.TENT_2.get())) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				} else {
					if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate)) == Direction.EAST) {
						if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x - 1, y, z), MddoModBlocks.TENT_2.get().defaultBlockState(), 3);
							{
								Direction _dir = (new Object() {
									public Direction getDirection(BlockPos pos) {
										BlockState _bs = world.getBlockState(pos);
										Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (property != null && _bs.getValue(property) instanceof Direction _dir)
											return _dir;
										else if (_bs.hasProperty(BlockStateProperties.AXIS))
											return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
										else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
											return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
										return Direction.NORTH;
									}
								}.getDirection(BlockPos.containing(x, y, z)));
								BlockPos _pos = BlockPos.containing(x - 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else {
									_property = _bs.getBlock().getStateDefinition().getProperty("axis");
									if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
										world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						} else if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == MddoModBlocks.TENT_2.get())) {
							{
								BlockPos _pos = BlockPos.containing(x, y, z);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
								world.destroyBlock(_pos, false);
							}
						}
					}
				}
			}
		}
	}
}

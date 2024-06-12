package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;

import net.mcreator.mddo.network.EpicraftModVariables;

public class GoldenChorusFruitRightClickProcedure {
	public static void execute(LevelAccessor world) {
		Direction nx = Direction.NORTH;
		Direction nz = Direction.NORTH;
		EpicraftModVariables.MapVariables.get(world).GoldenChorusCharges = EpicraftModVariables.MapVariables.get(world).GoldenChorusCharges + 1;
		EpicraftModVariables.MapVariables.get(world).syncData(world);
	}
}

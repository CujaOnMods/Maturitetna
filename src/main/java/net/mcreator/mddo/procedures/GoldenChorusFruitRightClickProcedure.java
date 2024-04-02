package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;

import net.mcreator.mddo.network.MddoModVariables;

public class GoldenChorusFruitRightClickProcedure {
	public static void execute(LevelAccessor world) {
		Direction nx = Direction.NORTH;
		Direction nz = Direction.NORTH;
		MddoModVariables.MapVariables.get(world).GoldenChorusCharges = MddoModVariables.MapVariables.get(world).GoldenChorusCharges + 1;
		MddoModVariables.MapVariables.get(world).syncData(world);
	}
}

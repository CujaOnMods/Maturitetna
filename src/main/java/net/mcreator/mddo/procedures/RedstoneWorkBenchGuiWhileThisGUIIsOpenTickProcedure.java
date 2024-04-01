package net.mcreator.mddo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RedstoneWorkBenchGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		RedstoneRedstoneBlockProcedure.execute(world, entity);
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstonePistonProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstoneRedstonerepeaterProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstoneRedstoneComparatorProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstoneTargetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstoneRailProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			RedstonePoweredRailProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
	}
}

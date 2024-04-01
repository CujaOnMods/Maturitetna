package net.mcreator.mddo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FoodGuiOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodNotchAppleProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodGoldenCarrotProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodBreadProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodBeatrootSoupProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodCakeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodCookiesProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			FoodHayBaleProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
	}
}

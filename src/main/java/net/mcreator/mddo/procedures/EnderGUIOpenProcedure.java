package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.MddoModVariables;

public class EnderGUIOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EnderShulkerBoxProcedure.execute(world, entity);
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			EnderEnderChestProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			EnderPurpurSlabProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			EnderPurpurStairProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			EnderGoldenChorusFruitProcedure.execute(world, entity);
		}
	}
}

package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.MddoModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class WeaponarmorOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		WeaponArmorLetherHelmetProcedure.execute(world, entity);
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorLeatherChestplateProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorLeatherLeggingsProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorLeatherFeetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponAromrIronHelmetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronChestplateProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronLeggingsProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronFeetProcedure.execute(world, entity);
		}
	}
}

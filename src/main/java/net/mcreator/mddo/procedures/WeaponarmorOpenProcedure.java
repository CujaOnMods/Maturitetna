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
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondHelmetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondChestplateProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondLeggingsProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondFeetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorWoodPickProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorStonePickProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronPickProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondPickProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorWoodAxeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldAxeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGOldHelmetProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldChestplateProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldLeggingsProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldFeetProcedure.execute();
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldPickProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorStoneAxeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronAxeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondAxeProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorWoodSwordProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorStoneSwordProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronSwordProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGoldSwordProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondSwordProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorWoodShovelProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorStoneShovelProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorIronShovelProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorGOldShovelProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorDiamondShovelProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorShieldProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorBowProcedure.execute(world, entity);
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
			WeaponArmorCrossBowProcedure.execute(world, entity);
		}
	}
}

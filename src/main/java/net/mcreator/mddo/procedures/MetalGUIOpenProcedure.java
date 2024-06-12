package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.EpicraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class MetalGUIOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		M3talAnvilProcedure.execute(world, entity);
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			MetalIronBarsProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			MetalLanternProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			MetalbucketProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			MetalCauldronProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			MetalMinecartProcedure.execute(world, entity);
		}
	}
}

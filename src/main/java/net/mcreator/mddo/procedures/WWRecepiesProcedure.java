package net.mcreator.mddo.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class WWRecepiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		WwOakSlabProcedure.execute(entity);
		WWSpruceSlabProcedure.execute(entity);
		WWBirchSlabProcedure.execute(entity);
		WWJungleSlabProcedure.execute(entity);
		WWAcaciaSlabProcedure.execute(entity);
		WwDarkOakSlabProcedure.execute(entity);
		WwMangroveSlabProcedure.execute(entity);
		WWCherrySlabProcedure.execute(entity);
		WwCrimsonSlabProcedure.execute(entity);
		WwWarpedSlabProcedure.execute(entity);
	}
}

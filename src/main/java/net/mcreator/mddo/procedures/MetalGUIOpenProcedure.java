package net.mcreator.mddo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MetalGUIOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
		if (MddoModVariables.MapVariables.get(world).nadaljuj) {
		}
	}
}

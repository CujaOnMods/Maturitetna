package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.EpicraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class StoneGuiOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		StoneFurnacE1Procedure.execute(world, entity);
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			StoneSmokerProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			StoneBlastFurnaceProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			StoneBrewingStandProcedure.execute(world, entity);
		}
		if (EpicraftModVariables.MapVariables.get(world).nadaljuj) {
			StoneStoneCuterProcedure.execute(world, entity);
		}
	}
}

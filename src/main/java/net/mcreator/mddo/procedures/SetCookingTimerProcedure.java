package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.MddoModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class SetCookingTimerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) MddoModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (MddoModVariables.MapVariables.get(world).whichSlot == 1) {
				MddoModVariables.MapVariables.get(world).CookingTimer1 = 300;
				MddoModVariables.MapVariables.get(world).syncData(world);
			}
			if (MddoModVariables.MapVariables.get(world).whichSlot == 2) {
				MddoModVariables.MapVariables.get(world).CookingTimer2 = 300;
				MddoModVariables.MapVariables.get(world).syncData(world);
			}
			if (MddoModVariables.MapVariables.get(world).whichSlot == 3) {
				MddoModVariables.MapVariables.get(world).CookingNumber3 = 300;
				MddoModVariables.MapVariables.get(world).syncData(world);
			}
			if (MddoModVariables.MapVariables.get(world).whichSlot == 4) {
				MddoModVariables.MapVariables.get(world).CookingNumber4 = 300;
				MddoModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}

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

public class CookingStandSteakProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		double fireHeight = 0;
		double previousRecipe = 0;
		boolean condition = false;
		MddoModVariables.MapVariables.get(world).CookingTimer = 300;
		MddoModVariables.MapVariables.get(world).syncData(world);
		while (MddoModVariables.MapVariables.get(world).CookingValue >= 1) {
			if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
				MddoModVariables.MapVariables.get(world).CookingValue = MddoModVariables.MapVariables.get(world).CookingValue - 1;
				MddoModVariables.MapVariables.get(world).syncData(world);
				for (int index1 = 0; index1 < 300; index1++) {
					MddoModVariables.MapVariables.get(world).CookingTimer = MddoModVariables.MapVariables.get(world).CookingTimer - 1;
					MddoModVariables.MapVariables.get(world).syncData(world);
				}
				if (MddoModVariables.MapVariables.get(world).CookingTimer == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				MddoModVariables.MapVariables.get(world).nadaljuj = false;
				MddoModVariables.MapVariables.get(world).syncData(world);
				return MddoModVariables.MapVariables.get(world).nadaljuj;
			}
			if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
				MddoModVariables.MapVariables.get(world).CookingValue = MddoModVariables.MapVariables.get(world).CookingValue - 1;
				MddoModVariables.MapVariables.get(world).syncData(world);
				for (int index2 = 0; index2 < 300; index2++) {
					MddoModVariables.MapVariables.get(world).CookingTimer = MddoModVariables.MapVariables.get(world).CookingTimer - 1;
					MddoModVariables.MapVariables.get(world).syncData(world);
				}
				if (MddoModVariables.MapVariables.get(world).CookingTimer == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
						_setstack.setCount(1);
						((Slot) _slots.get(4)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				MddoModVariables.MapVariables.get(world).nadaljuj = false;
				MddoModVariables.MapVariables.get(world).syncData(world);
				return MddoModVariables.MapVariables.get(world).nadaljuj;
			}
			if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem()) {
				MddoModVariables.MapVariables.get(world).CookingValue = MddoModVariables.MapVariables.get(world).CookingValue - 1;
				MddoModVariables.MapVariables.get(world).syncData(world);
				for (int index3 = 0; index3 < 300; index3++) {
					MddoModVariables.MapVariables.get(world).CookingTimer = MddoModVariables.MapVariables.get(world).CookingTimer - 1;
					MddoModVariables.MapVariables.get(world).syncData(world);
				}
				if (MddoModVariables.MapVariables.get(world).CookingTimer == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
						_setstack.setCount(1);
						((Slot) _slots.get(6)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				MddoModVariables.MapVariables.get(world).nadaljuj = false;
				MddoModVariables.MapVariables.get(world).syncData(world);
				return MddoModVariables.MapVariables.get(world).nadaljuj;
			}
			if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem()) {
				MddoModVariables.MapVariables.get(world).CookingValue = MddoModVariables.MapVariables.get(world).CookingValue - 1;
				MddoModVariables.MapVariables.get(world).syncData(world);
				for (int index4 = 0; index4 < 300; index4++) {
					MddoModVariables.MapVariables.get(world).CookingTimer = MddoModVariables.MapVariables.get(world).CookingTimer - 1;
					MddoModVariables.MapVariables.get(world).syncData(world);
				}
				if (MddoModVariables.MapVariables.get(world).CookingTimer == 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
						_setstack.setCount(1);
						((Slot) _slots.get(8)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				MddoModVariables.MapVariables.get(world).nadaljuj = false;
				MddoModVariables.MapVariables.get(world).syncData(world);
				return MddoModVariables.MapVariables.get(world).nadaljuj;
			}
		}
		MddoModVariables.MapVariables.get(world).nadaljuj = true;
		MddoModVariables.MapVariables.get(world).syncData(world);
		return MddoModVariables.MapVariables.get(world).nadaljuj;
	}
}

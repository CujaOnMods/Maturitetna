package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.EpicraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class SetCookingTimerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.PORKCHOP == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.COD == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.SALMON == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.CHICKEN == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.RABBIT == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.POTATO == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (Items.MUTTON == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 1) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer1 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 2) {
				EpicraftModVariables.MapVariables.get(world).CookingTimer2 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 3) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber3 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
			if (EpicraftModVariables.MapVariables.get(world).whichSlot == 4) {
				EpicraftModVariables.MapVariables.get(world).CookingNumber4 = 300;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}

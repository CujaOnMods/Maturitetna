package net.mcreator.mddo.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.MddoModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class MetalLanternProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
				if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
					if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
						if (Blocks.TORCH.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem()) {
							if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem()) {
								if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
										.getItem()) {
									if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
											.getItem()) {
										if (Items.IRON_NUGGET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
												.getItem()) {
											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(Blocks.LANTERN);
												_setstack.setCount(1);
												((Slot) _slots.get(10)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
										}
										MddoModVariables.MapVariables.get(world).nadaljuj = false;
										MddoModVariables.MapVariables.get(world).syncData(world);
										return MddoModVariables.MapVariables.get(world).nadaljuj;
									}
								}
							}
						}
					}
				}
			}
		}
		MddoModVariables.MapVariables.get(world).nadaljuj = true;
		MddoModVariables.MapVariables.get(world).syncData(world);
		return MddoModVariables.MapVariables.get(world).nadaljuj;
	}
}

package net.mcreator.mddo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FoodCakeProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (Items.MILK_BUCKET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			if (Items.MILK_BUCKET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
				if (Items.MILK_BUCKET == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
					if (Items.SUGAR == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
						if (Items.EGG == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem()) {
							if (Items.SUGAR == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem()) {
								if (Items.WHEAT == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem()) {
									if (Items.WHEAT == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem()) {
										if (Items.WHEAT == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
												.getItem()) {
											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(Items.CAKE);
												_setstack.setCount(2);
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

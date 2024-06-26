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

public class CookingStandSteakProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_BEEF).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.PORKCHOP == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_PORKCHOP).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.CHICKEN == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_CHICKEN).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.RABBIT == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_RABBIT).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.MUTTON == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_MUTTON).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.POTATO == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.BAKED_POTATO).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.COD == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_COD).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (Items.SALMON == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).getItem()
				: ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COOKED_SALMON).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1)) + 1));
				((Slot) _slots.get((int) (EpicraftModVariables.MapVariables.get(world).whichSlot + 1))).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) EpicraftModVariables.MapVariables.get(world).whichSlot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}

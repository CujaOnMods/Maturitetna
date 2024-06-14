package net.mcreator.mddo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.network.EpicraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class CookingstandOpenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double repeat = 0;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(2) < 64) {
				if (EpicraftModVariables.MapVariables.get(world).Fuel >= 0.01) {
					if (EpicraftModVariables.MapVariables.get(world).CookingTimer1 > 1) {
						EpicraftModVariables.MapVariables.get(world).CookingTimer1 = EpicraftModVariables.MapVariables.get(world).CookingTimer1 - 1;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
						EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (EpicraftModVariables.MapVariables.get(world).CookingTimer1 == 1) {
							EpicraftModVariables.MapVariables.get(world).CookingTimer1 = EpicraftModVariables.MapVariables.get(world).CookingTimer1 - 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).whichSlot = 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							CookingStandSteakProcedure.execute(world, entity);
						} else {
							EpicraftModVariables.MapVariables.get(world).whichSlot = 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							SetCookingTimerProcedure.execute(world, entity);
						}
					}
				}
			}
		}
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(3) >= 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(4) < 64) {
				if (EpicraftModVariables.MapVariables.get(world).Fuel >= 0.01) {
					if (EpicraftModVariables.MapVariables.get(world).CookingTimer2 > 1) {
						EpicraftModVariables.MapVariables.get(world).CookingTimer2 = EpicraftModVariables.MapVariables.get(world).CookingTimer2 - 1;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
						EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (EpicraftModVariables.MapVariables.get(world).CookingTimer2 == 1) {
							EpicraftModVariables.MapVariables.get(world).CookingTimer2 = EpicraftModVariables.MapVariables.get(world).CookingTimer2 - 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).whichSlot = 3;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							CookingStandSteakProcedure.execute(world, entity);
						} else {
							EpicraftModVariables.MapVariables.get(world).whichSlot = 3;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							SetCookingTimerProcedure.execute(world, entity);
						}
					}
				}
			}
		}
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(5) >= 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(6) < 64) {
				if (EpicraftModVariables.MapVariables.get(world).Fuel >= 0.01) {
					if (EpicraftModVariables.MapVariables.get(world).CookingNumber3 > 1) {
						EpicraftModVariables.MapVariables.get(world).CookingNumber3 = EpicraftModVariables.MapVariables.get(world).CookingNumber3 - 1;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
						EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (EpicraftModVariables.MapVariables.get(world).CookingNumber3 == 1) {
							EpicraftModVariables.MapVariables.get(world).CookingNumber3 = EpicraftModVariables.MapVariables.get(world).CookingNumber3 - 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).whichSlot = 5;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							CookingStandSteakProcedure.execute(world, entity);
						} else {
							EpicraftModVariables.MapVariables.get(world).whichSlot = 5;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							SetCookingTimerProcedure.execute(world, entity);
						}
					}
				}
			}
		}
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(7) >= 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(8) < 64) {
				if (EpicraftModVariables.MapVariables.get(world).Fuel >= 0.01) {
					if (EpicraftModVariables.MapVariables.get(world).CookingNumber4 > 1) {
						EpicraftModVariables.MapVariables.get(world).CookingNumber4 = EpicraftModVariables.MapVariables.get(world).CookingNumber4 - 1;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
						EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (EpicraftModVariables.MapVariables.get(world).CookingNumber4 == 1) {
							EpicraftModVariables.MapVariables.get(world).CookingNumber4 = EpicraftModVariables.MapVariables.get(world).CookingNumber4 - 1;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).Fuel = EpicraftModVariables.MapVariables.get(world).Fuel - 0.01;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							EpicraftModVariables.MapVariables.get(world).whichSlot = 7;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							CookingStandSteakProcedure.execute(world, entity);
						} else {
							EpicraftModVariables.MapVariables.get(world).whichSlot = 7;
							EpicraftModVariables.MapVariables.get(world).syncData(world);
							SetCookingTimerProcedure.execute(world, entity);
						}
					}
				}
			}
		}
	}
}

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

public class CookingStandSteakProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double fireHeight = 0;
		double previousRecipe = 0;
		boolean condition = false;
		if (MddoModVariables.MapVariables.get(world).CookingValue > 0) {
			if (MddoModVariables.MapVariables.get(world).CookingTimer >= 1) {
				if (MddoModVariables.MapVariables.get(world).CookingTimer2 >= 1) {
					if (MddoModVariables.MapVariables.get(world).CookingNumber3 >= 1) {
						if (MddoModVariables.MapVariables.get(world).CookingNumber4 >= 1) {
							if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
								if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
									if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem()) {
										if (Items.BEEF == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
												.getItem()) {
											MddoModVariables.MapVariables.get(world).CookingTimer = MddoModVariables.MapVariables.get(world).CookingTimer - 1;
											MddoModVariables.MapVariables.get(world).syncData(world);
											MddoModVariables.MapVariables.get(world).CookingTimer2 = MddoModVariables.MapVariables.get(world).CookingTimer2 - 1;
											MddoModVariables.MapVariables.get(world).syncData(world);
											MddoModVariables.MapVariables.get(world).CookingNumber3 = MddoModVariables.MapVariables.get(world).CookingNumber3 - 1;
											MddoModVariables.MapVariables.get(world).syncData(world);
											MddoModVariables.MapVariables.get(world).CookingNumber4 = MddoModVariables.MapVariables.get(world).CookingNumber4 - 1;
											MddoModVariables.MapVariables.get(world).syncData(world);
											if (MddoModVariables.MapVariables.get(world).CookingTimer == 0) {
												if (MddoModVariables.MapVariables.get(world).CookingTimer2 == 0) {
													if (MddoModVariables.MapVariables.get(world).CookingNumber3 == 0) {
														if (MddoModVariables.MapVariables.get(world).CookingNumber4 == 0) {
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
																_setstack.setCount(1);
																((Slot) _slots.get(2)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
																_setstack.setCount(1);
																((Slot) _slots.get(4)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
																_setstack.setCount(1);
																((Slot) _slots.get(6)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Blocks.BEDROCK);
																_setstack.setCount(1);
																((Slot) _slots.get(8)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															MddoModVariables.MapVariables.get(world).CookingValue = MddoModVariables.MapVariables.get(world).CookingValue - 1;
															MddoModVariables.MapVariables.get(world).syncData(world);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

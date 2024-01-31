
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mddo.world.inventory.WWBCMenu;
import net.mcreator.mddo.MddoMod;

public class MddoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MddoMod.MODID);
	public static final RegistryObject<MenuType<WWBCMenu>> WWBC = REGISTRY.register("wwbc", () -> IForgeMenuType.create(WWBCMenu::new));
}

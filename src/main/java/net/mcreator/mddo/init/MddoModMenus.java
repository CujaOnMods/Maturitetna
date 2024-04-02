
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mddo.world.inventory.WeaponArmorGUIMenu;
import net.mcreator.mddo.world.inventory.WWBCMenu;
import net.mcreator.mddo.world.inventory.StoneworkingGuiMenu;
import net.mcreator.mddo.world.inventory.RedstoneWorkBenchGuiMenu;
import net.mcreator.mddo.world.inventory.MetalWorkbenchMenu;
import net.mcreator.mddo.world.inventory.FoodGUIMenu;
import net.mcreator.mddo.world.inventory.EnderGUIMenu;
import net.mcreator.mddo.world.inventory.CookingStandMenu;
import net.mcreator.mddo.MddoMod;

public class MddoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MddoMod.MODID);
	public static final RegistryObject<MenuType<WWBCMenu>> WWBC = REGISTRY.register("wwbc", () -> IForgeMenuType.create(WWBCMenu::new));
	public static final RegistryObject<MenuType<StoneworkingGuiMenu>> STONEWORKING_GUI = REGISTRY.register("stoneworking_gui", () -> IForgeMenuType.create(StoneworkingGuiMenu::new));
	public static final RegistryObject<MenuType<MetalWorkbenchMenu>> METAL_WORKBENCH = REGISTRY.register("metal_workbench", () -> IForgeMenuType.create(MetalWorkbenchMenu::new));
	public static final RegistryObject<MenuType<WeaponArmorGUIMenu>> WEAPON_ARMOR_GUI = REGISTRY.register("weapon_armor_gui", () -> IForgeMenuType.create(WeaponArmorGUIMenu::new));
	public static final RegistryObject<MenuType<FoodGUIMenu>> FOOD_GUI = REGISTRY.register("food_gui", () -> IForgeMenuType.create(FoodGUIMenu::new));
	public static final RegistryObject<MenuType<RedstoneWorkBenchGuiMenu>> REDSTONE_WORK_BENCH_GUI = REGISTRY.register("redstone_work_bench_gui", () -> IForgeMenuType.create(RedstoneWorkBenchGuiMenu::new));
	public static final RegistryObject<MenuType<EnderGUIMenu>> ENDER_GUI = REGISTRY.register("ender_gui", () -> IForgeMenuType.create(EnderGUIMenu::new));
	public static final RegistryObject<MenuType<CookingStandMenu>> COOKING_STAND = REGISTRY.register("cooking_stand", () -> IForgeMenuType.create(CookingStandMenu::new));
}

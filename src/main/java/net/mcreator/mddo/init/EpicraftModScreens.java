
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mddo.client.gui.WeaponArmorGUIScreen;
import net.mcreator.mddo.client.gui.WWBCScreen;
import net.mcreator.mddo.client.gui.StoneworkingGuiScreen;
import net.mcreator.mddo.client.gui.RedstoneWorkBenchGuiScreen;
import net.mcreator.mddo.client.gui.MetalWorkbenchScreen;
import net.mcreator.mddo.client.gui.FoodGUIScreen;
import net.mcreator.mddo.client.gui.EnderGUIScreen;
import net.mcreator.mddo.client.gui.CookingStandScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EpicraftModMenus.WWBC.get(), WWBCScreen::new);
			MenuScreens.register(EpicraftModMenus.STONEWORKING_GUI.get(), StoneworkingGuiScreen::new);
			MenuScreens.register(EpicraftModMenus.METAL_WORKBENCH.get(), MetalWorkbenchScreen::new);
			MenuScreens.register(EpicraftModMenus.WEAPON_ARMOR_GUI.get(), WeaponArmorGUIScreen::new);
			MenuScreens.register(EpicraftModMenus.FOOD_GUI.get(), FoodGUIScreen::new);
			MenuScreens.register(EpicraftModMenus.REDSTONE_WORK_BENCH_GUI.get(), RedstoneWorkBenchGuiScreen::new);
			MenuScreens.register(EpicraftModMenus.ENDER_GUI.get(), EnderGUIScreen::new);
			MenuScreens.register(EpicraftModMenus.COOKING_STAND.get(), CookingStandScreen::new);
		});
	}
}

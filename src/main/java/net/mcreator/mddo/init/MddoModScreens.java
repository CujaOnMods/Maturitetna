
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
import net.mcreator.mddo.client.gui.MetalWorkbenchScreen;
import net.mcreator.mddo.client.gui.FoodWOrkBenchGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MddoModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MddoModMenus.WWBC.get(), WWBCScreen::new);
			MenuScreens.register(MddoModMenus.STONEWORKING_GUI.get(), StoneworkingGuiScreen::new);
			MenuScreens.register(MddoModMenus.METAL_WORKBENCH.get(), MetalWorkbenchScreen::new);
			MenuScreens.register(MddoModMenus.WEAPON_ARMOR_GUI.get(), WeaponArmorGUIScreen::new);
			MenuScreens.register(MddoModMenus.FOOD_W_ORK_BENCH_GUI.get(), FoodWOrkBenchGuiScreen::new);
		});
	}
}

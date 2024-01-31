
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mddo.MddoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MddoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MddoMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MddoModItems.BETTER_SKELETON_SPAWN_EGG.get());
			tabData.accept(MddoModItems.BETTERZOMBIE_SPAWN_EGG.get());
			tabData.accept(MddoModItems.BETTER_SPIDER_SPAWN_EGG.get());
		}
	}
}

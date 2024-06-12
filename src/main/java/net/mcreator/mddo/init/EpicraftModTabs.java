
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mddo.EpicraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPI_CRAFT = REGISTRY.register("epi_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.epicraft.epi_craft")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(EpicraftModBlocks.WWWB.get().asItem());
				tabData.accept(EpicraftModBlocks.STONEWORKING_BENCH.get().asItem());
				tabData.accept(EpicraftModBlocks.METAL_WORKING_BENCH.get().asItem());
				tabData.accept(EpicraftModBlocks.WEAPON_ARMOR_WORK_BENCH.get().asItem());
				tabData.accept(EpicraftModBlocks.FOOD_WORKBENCH.get().asItem());
				tabData.accept(EpicraftModBlocks.REDSTONE_WORK_BENCH.get().asItem());
				tabData.accept(EpicraftModItems.GOLDEN_CHORUS.get());
				tabData.accept(EpicraftModBlocks.ENDER_WORK_BENCH.get().asItem());
				tabData.accept(EpicraftModBlocks.COOKING_STAND_WORK_BENCH.get().asItem());
				tabData.accept(EpicraftModItems.COAL_DUST.get());
				tabData.accept(EpicraftModItems.COPPER_DUST.get());
				tabData.accept(EpicraftModItems.IRON_DUST.get());
				tabData.accept(EpicraftModItems.LAPIS_DUST.get());
				tabData.accept(EpicraftModItems.EMERALD_DUST.get());
				tabData.accept(EpicraftModItems.GOLD_DUST.get());
				tabData.accept(EpicraftModItems.DIAMOND_DUST.get());
				tabData.accept(EpicraftModItems.QUARTZ_DUST.get());
				tabData.accept(EpicraftModBlocks.TEND.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EpicraftModItems.BETTER_SKELETON_SPAWN_EGG.get());
			tabData.accept(EpicraftModItems.BETTERZOMBIE_SPAWN_EGG.get());
			tabData.accept(EpicraftModItems.BETTER_SPIDER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EpicraftModItems.WOODEN_HAMMER.get());
		}
	}
}

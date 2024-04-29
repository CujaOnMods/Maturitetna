
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

import net.mcreator.mddo.MddoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MddoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MddoMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPI_CRAFT = REGISTRY.register("epi_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mddo.epi_craft")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(MddoModBlocks.WWWB.get().asItem());
				tabData.accept(MddoModBlocks.STONEWORKING_BENCH.get().asItem());
				tabData.accept(MddoModBlocks.METAL_WORKING_BENCH.get().asItem());
				tabData.accept(MddoModBlocks.WEAPON_ARMOR_WORK_BENCH.get().asItem());
				tabData.accept(MddoModBlocks.FOOD_WORKBENCH.get().asItem());
				tabData.accept(MddoModBlocks.REDSTONE_WORK_BENCH.get().asItem());
				tabData.accept(MddoModItems.GOLDEN_CHORUS.get());
				tabData.accept(MddoModBlocks.ENDER_WORK_BENCH.get().asItem());
				tabData.accept(MddoModBlocks.COOKING_STAND_WORK_BENCH.get().asItem());
				tabData.accept(MddoModItems.COAL_DUST.get());
				tabData.accept(MddoModItems.COPPER_DUST.get());
				tabData.accept(MddoModItems.IRON_DUST.get());
				tabData.accept(MddoModItems.LAPIS_DUST.get());
				tabData.accept(MddoModItems.EMERALD_DUST.get());
				tabData.accept(MddoModItems.GOLD_DUST.get());
				tabData.accept(MddoModItems.DIAMOND_DUST.get());
				tabData.accept(MddoModItems.QUARTZ_DUST.get());
				tabData.accept(MddoModBlocks.TENT.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MddoModItems.BETTER_SKELETON_SPAWN_EGG.get());
			tabData.accept(MddoModItems.BETTERZOMBIE_SPAWN_EGG.get());
			tabData.accept(MddoModItems.BETTER_SPIDER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MddoModItems.WOODEN_HAMMER.get());
		}
	}
}

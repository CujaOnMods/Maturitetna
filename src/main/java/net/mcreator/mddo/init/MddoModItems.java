
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mddo.item.WoodenHammerItem;
import net.mcreator.mddo.item.QuartzDustItem;
import net.mcreator.mddo.item.LapisDustItem;
import net.mcreator.mddo.item.IronDustItem;
import net.mcreator.mddo.item.GoldenChorusItem;
import net.mcreator.mddo.item.GoldDustItem;
import net.mcreator.mddo.item.EmeraldDustItem;
import net.mcreator.mddo.item.DiamondDustItem;
import net.mcreator.mddo.item.CopperDustItem;
import net.mcreator.mddo.item.CoalDustItem;
import net.mcreator.mddo.MddoMod;

public class MddoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MddoMod.MODID);
	public static final RegistryObject<Item> BETTER_SKELETON_SPAWN_EGG = REGISTRY.register("better_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(MddoModEntities.BETTER_SKELETON, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BETTERZOMBIE_SPAWN_EGG = REGISTRY.register("betterzombie_spawn_egg", () -> new ForgeSpawnEggItem(MddoModEntities.BETTERZOMBIE, -16751104, -13421569, new Item.Properties()));
	public static final RegistryObject<Item> BETTER_SPIDER_SPAWN_EGG = REGISTRY.register("better_spider_spawn_egg", () -> new ForgeSpawnEggItem(MddoModEntities.BETTER_SPIDER, -13421773, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_HAMMER = REGISTRY.register("wooden_hammer", () -> new WoodenHammerItem());
	public static final RegistryObject<Item> WWWB = block(MddoModBlocks.WWWB);
	public static final RegistryObject<Item> STONEWORKING_BENCH = block(MddoModBlocks.STONEWORKING_BENCH);
	public static final RegistryObject<Item> METAL_WORKING_BENCH = block(MddoModBlocks.METAL_WORKING_BENCH);
	public static final RegistryObject<Item> WEAPON_ARMOR_WORK_BENCH = block(MddoModBlocks.WEAPON_ARMOR_WORK_BENCH);
	public static final RegistryObject<Item> FOOD_WORKBENCH = block(MddoModBlocks.FOOD_WORKBENCH);
	public static final RegistryObject<Item> REDSTONE_WORK_BENCH = block(MddoModBlocks.REDSTONE_WORK_BENCH);
	public static final RegistryObject<Item> GOLDEN_CHORUS = REGISTRY.register("golden_chorus", () -> new GoldenChorusItem());
	public static final RegistryObject<Item> ENDER_WORK_BENCH = block(MddoModBlocks.ENDER_WORK_BENCH);
	public static final RegistryObject<Item> COOKING_STAND_WORK_BENCH = block(MddoModBlocks.COOKING_STAND_WORK_BENCH);
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalDustItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> LAPIS_DUST = REGISTRY.register("lapis_dust", () -> new LapisDustItem());
	public static final RegistryObject<Item> EMERALD_DUST = REGISTRY.register("emerald_dust", () -> new EmeraldDustItem());
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> DIAMOND_DUST = REGISTRY.register("diamond_dust", () -> new DiamondDustItem());
	public static final RegistryObject<Item> QUARTZ_DUST = REGISTRY.register("quartz_dust", () -> new QuartzDustItem());
	public static final RegistryObject<Item> TEND = block(MddoModBlocks.TEND);
	public static final RegistryObject<Item> TENT_2 = block(MddoModBlocks.TENT_2);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

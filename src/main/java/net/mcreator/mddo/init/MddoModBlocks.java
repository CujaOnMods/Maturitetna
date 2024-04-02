
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mddo.block.WeaponArmorWorkBenchBlock;
import net.mcreator.mddo.block.WWWBBlock;
import net.mcreator.mddo.block.StoneworkingBenchBlock;
import net.mcreator.mddo.block.RedstoneWorkBenchBlock;
import net.mcreator.mddo.block.MetalWorkingBenchBlock;
import net.mcreator.mddo.block.FoodWorkbenchBlock;
import net.mcreator.mddo.block.EnderWorkBenchBlock;
import net.mcreator.mddo.block.CookingStandWorkBenchBlock;
import net.mcreator.mddo.MddoMod;

public class MddoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MddoMod.MODID);
	public static final RegistryObject<Block> WWWB = REGISTRY.register("wwwb", () -> new WWWBBlock());
	public static final RegistryObject<Block> STONEWORKING_BENCH = REGISTRY.register("stoneworking_bench", () -> new StoneworkingBenchBlock());
	public static final RegistryObject<Block> METAL_WORKING_BENCH = REGISTRY.register("metal_working_bench", () -> new MetalWorkingBenchBlock());
	public static final RegistryObject<Block> WEAPON_ARMOR_WORK_BENCH = REGISTRY.register("weapon_armor_work_bench", () -> new WeaponArmorWorkBenchBlock());
	public static final RegistryObject<Block> FOOD_WORKBENCH = REGISTRY.register("food_workbench", () -> new FoodWorkbenchBlock());
	public static final RegistryObject<Block> REDSTONE_WORK_BENCH = REGISTRY.register("redstone_work_bench", () -> new RedstoneWorkBenchBlock());
	public static final RegistryObject<Block> ENDER_WORK_BENCH = REGISTRY.register("ender_work_bench", () -> new EnderWorkBenchBlock());
	public static final RegistryObject<Block> COOKING_STAND_WORK_BENCH = REGISTRY.register("cooking_stand_work_bench", () -> new CookingStandWorkBenchBlock());
}

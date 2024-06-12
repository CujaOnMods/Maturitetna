
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mddo.block.entity.WeaponArmorWorkBenchBlockEntity;
import net.mcreator.mddo.block.entity.WWWBBlockEntity;
import net.mcreator.mddo.block.entity.StoneworkingBenchBlockEntity;
import net.mcreator.mddo.block.entity.RedstoneWorkBenchBlockEntity;
import net.mcreator.mddo.block.entity.MetalWorkingBenchBlockEntity;
import net.mcreator.mddo.block.entity.FoodWorkbenchBlockEntity;
import net.mcreator.mddo.block.entity.EnderWorkBenchBlockEntity;
import net.mcreator.mddo.block.entity.CookingStandWorkBenchBlockEntity;
import net.mcreator.mddo.EpicraftMod;

public class EpicraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EpicraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WWWB = register("wwwb", EpicraftModBlocks.WWWB, WWWBBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONEWORKING_BENCH = register("stoneworking_bench", EpicraftModBlocks.STONEWORKING_BENCH, StoneworkingBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_WORKING_BENCH = register("metal_working_bench", EpicraftModBlocks.METAL_WORKING_BENCH, MetalWorkingBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEAPON_ARMOR_WORK_BENCH = register("weapon_armor_work_bench", EpicraftModBlocks.WEAPON_ARMOR_WORK_BENCH, WeaponArmorWorkBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FOOD_WORKBENCH = register("food_workbench", EpicraftModBlocks.FOOD_WORKBENCH, FoodWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_WORK_BENCH = register("redstone_work_bench", EpicraftModBlocks.REDSTONE_WORK_BENCH, RedstoneWorkBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDER_WORK_BENCH = register("ender_work_bench", EpicraftModBlocks.ENDER_WORK_BENCH, EnderWorkBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COOKING_STAND_WORK_BENCH = register("cooking_stand_work_bench", EpicraftModBlocks.COOKING_STAND_WORK_BENCH, CookingStandWorkBenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

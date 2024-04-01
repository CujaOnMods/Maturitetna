
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
import net.mcreator.mddo.MddoMod;

public class MddoModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MddoMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WWWB = register("wwwb", MddoModBlocks.WWWB, WWWBBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONEWORKING_BENCH = register("stoneworking_bench", MddoModBlocks.STONEWORKING_BENCH, StoneworkingBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_WORKING_BENCH = register("metal_working_bench", MddoModBlocks.METAL_WORKING_BENCH, MetalWorkingBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEAPON_ARMOR_WORK_BENCH = register("weapon_armor_work_bench", MddoModBlocks.WEAPON_ARMOR_WORK_BENCH, WeaponArmorWorkBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FOOD_WORKBENCH = register("food_workbench", MddoModBlocks.FOOD_WORKBENCH, FoodWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_WORK_BENCH = register("redstone_work_bench", MddoModBlocks.REDSTONE_WORK_BENCH, RedstoneWorkBenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

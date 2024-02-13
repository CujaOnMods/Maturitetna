
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mddo.block.WWWBBlock;
import net.mcreator.mddo.MddoMod;

public class MddoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MddoMod.MODID);
	public static final RegistryObject<Block> WWWB = REGISTRY.register("wwwb", () -> new WWWBBlock());
}

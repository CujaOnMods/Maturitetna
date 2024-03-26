
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.mddo.fluid.types.SaltWaterFluidType;
import net.mcreator.mddo.MddoMod;

public class MddoModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MddoMod.MODID);
	public static final RegistryObject<FluidType> SALT_WATER_TYPE = REGISTRY.register("salt_water", () -> new SaltWaterFluidType());
}

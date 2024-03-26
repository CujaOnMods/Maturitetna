
package net.mcreator.mddo.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.mddo.init.MddoModItems;
import net.mcreator.mddo.init.MddoModFluids;
import net.mcreator.mddo.init.MddoModFluidTypes;
import net.mcreator.mddo.init.MddoModBlocks;

public abstract class SaltWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MddoModFluidTypes.SALT_WATER_TYPE.get(), () -> MddoModFluids.SALT_WATER.get(), () -> MddoModFluids.FLOWING_SALT_WATER.get())
			.explosionResistance(100f).bucket(() -> MddoModItems.SALT_WATER_BUCKET.get()).block(() -> (LiquidBlock) MddoModBlocks.SALT_WATER.get());

	private SaltWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE;
	}

	public static class Source extends SaltWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SaltWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

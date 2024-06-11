
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mddo.entity.BetterzombieEntity;
import net.mcreator.mddo.entity.BetterSpiderEntity;
import net.mcreator.mddo.entity.BetterSkeletonEntityProjectile;
import net.mcreator.mddo.entity.BetterSkeletonEntity;
import net.mcreator.mddo.MddoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MddoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MddoMod.MODID);
	public static final RegistryObject<EntityType<BetterzombieEntity>> BETTERZOMBIE = register("betterzombie",
			EntityType.Builder.<BetterzombieEntity>of(BetterzombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BetterzombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BetterSkeletonEntity>> BETTER_SKELETON = register("better_skeleton",
			EntityType.Builder.<BetterSkeletonEntity>of(BetterSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BetterSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BetterSkeletonEntityProjectile>> BETTER_SKELETON_PROJECTILE = register("projectile_better_skeleton",
			EntityType.Builder.<BetterSkeletonEntityProjectile>of(BetterSkeletonEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(BetterSkeletonEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BetterSpiderEntity>> BETTER_SPIDER = register("better_spider",
			EntityType.Builder.<BetterSpiderEntity>of(BetterSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BetterSpiderEntity::new)

					.sized(1.4f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BetterzombieEntity.init();
			BetterSkeletonEntity.init();
			BetterSpiderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BETTERZOMBIE.get(), BetterzombieEntity.createAttributes().build());
		event.put(BETTER_SKELETON.get(), BetterSkeletonEntity.createAttributes().build());
		event.put(BETTER_SPIDER.get(), BetterSpiderEntity.createAttributes().build());
	}
}

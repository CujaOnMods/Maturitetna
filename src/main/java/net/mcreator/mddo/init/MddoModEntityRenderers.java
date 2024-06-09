
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mddo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mddo.client.renderer.BetterzombieRenderer;
import net.mcreator.mddo.client.renderer.BetterSpiderRenderer;
import net.mcreator.mddo.client.renderer.BetterSkeletonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MddoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MddoModEntities.BETTERZOMBIE.get(), BetterzombieRenderer::new);
		event.registerEntityRenderer(MddoModEntities.BETTER_SKELETON.get(), BetterSkeletonRenderer::new);
		event.registerEntityRenderer(MddoModEntities.BETTER_SKELETON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MddoModEntities.BETTER_SPIDER.get(), BetterSpiderRenderer::new);
	}
}

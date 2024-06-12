
package net.mcreator.mddo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.mddo.entity.BetterSpiderEntity;

public class BetterSpiderRenderer extends MobRenderer<BetterSpiderEntity, SpiderModel<BetterSpiderEntity>> {
	public BetterSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BetterSpiderEntity entity) {
		return new ResourceLocation("epicraft:textures/entities/spajda.png");
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yourlocalgamedev.whisperingspirits.init;

import net.yourlocalgamedev.whisperingspirits.client.renderer.WhisperingSpiritRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WhisperingSpiritsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WhisperingSpiritsModEntities.WHISPERING_SPIRIT.get(), WhisperingSpiritRenderer::new);
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yourlocalgamedev.whisperingspirits.init;

import net.yourlocalgamedev.whisperingspirits.WhisperingSpiritsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class WhisperingSpiritsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WhisperingSpiritsMod.MODID);
	public static final RegistryObject<SoundEvent> SPRITS_WHISPERING = REGISTRY.register("sprits_whispering", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("whispering_spirits", "sprits_whispering")));
}

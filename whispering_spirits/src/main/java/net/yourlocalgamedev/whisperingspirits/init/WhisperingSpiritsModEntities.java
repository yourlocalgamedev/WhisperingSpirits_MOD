
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yourlocalgamedev.whisperingspirits.init;

import net.yourlocalgamedev.whisperingspirits.entity.WhisperingSpiritEntity;
import net.yourlocalgamedev.whisperingspirits.WhisperingSpiritsMod;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WhisperingSpiritsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WhisperingSpiritsMod.MODID);
	public static final RegistryObject<EntityType<WhisperingSpiritEntity>> WHISPERING_SPIRIT = register("whispering_spirit",
			EntityType.Builder.<WhisperingSpiritEntity>of(WhisperingSpiritEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(WhisperingSpiritEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WhisperingSpiritEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WHISPERING_SPIRIT.get(), WhisperingSpiritEntity.createAttributes().build());
	}
}

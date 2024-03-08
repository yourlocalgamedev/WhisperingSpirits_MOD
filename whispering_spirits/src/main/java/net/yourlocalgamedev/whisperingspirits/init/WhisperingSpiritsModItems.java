
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yourlocalgamedev.whisperingspirits.init;

import net.yourlocalgamedev.whisperingspirits.WhisperingSpiritsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class WhisperingSpiritsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WhisperingSpiritsMod.MODID);
	public static final RegistryObject<Item> WHISPERING_SPIRIT_SPAWN_EGG = REGISTRY.register("whispering_spirit_spawn_egg", () -> new ForgeSpawnEggItem(WhisperingSpiritsModEntities.WHISPERING_SPIRIT, -16777216, -1, new Item.Properties()));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alasgorsinferno.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.alasgorsinferno.item.EmpoweredGlowstoneDustItem;
import net.mcreator.alasgorsinferno.item.BlueNetherWartItem;
import net.mcreator.alasgorsinferno.AlasgorsInfernoMod;

public class AlasgorsInfernoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlasgorsInfernoMod.MODID);
	public static final RegistryObject<Item> EMPOWERED_GLOWSTONE_DUST = REGISTRY.register("empowered_glowstone_dust",
			() -> new EmpoweredGlowstoneDustItem());
	public static final RegistryObject<Item> BLUE_NETHER_WART = REGISTRY.register("blue_nether_wart", () -> new BlueNetherWartItem());
}

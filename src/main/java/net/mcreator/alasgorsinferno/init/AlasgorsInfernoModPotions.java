
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alasgorsinferno.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.alasgorsinferno.AlasgorsInfernoMod;

public class AlasgorsInfernoModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AlasgorsInfernoMod.MODID);
	public static final RegistryObject<Potion> POTIONOF_STRENGTH = REGISTRY.register("potionof_strength",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTIONOF_STRENGTH_2 = REGISTRY.register("potionof_strength_2",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 3, false, true)));
	public static final RegistryObject<Potion> POTIONOF_STRENGTH_3 = REGISTRY.register("potionof_strength_3",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 4, false, true)));
}

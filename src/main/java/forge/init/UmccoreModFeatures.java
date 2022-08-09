
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import forge.world.features.ores.HeaveniteOreFeature;
import forge.world.features.ores.DisceriteOreFeature;
import forge.world.features.MahoganyAncientHouseNetherFeature;
import forge.world.features.MahoganyAncientHouseFeature;

import forge.UmccoreMod;

@Mod.EventBusSubscriber
public class UmccoreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, UmccoreMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DISCERITE_ORE = register("discerite_ore", DisceriteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DisceriteOreFeature.GENERATE_BIOMES, DisceriteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HEAVENITE_ORE = register("heavenite_ore", HeaveniteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, HeaveniteOreFeature.GENERATE_BIOMES, HeaveniteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAHOGANY_ANCIENT_HOUSE = register("mahogany_ancient_house", MahoganyAncientHouseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MahoganyAncientHouseFeature.GENERATE_BIOMES,
					MahoganyAncientHouseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAHOGANY_ANCIENT_HOUSE_NETHER = register("mahogany_ancient_house_nether",
			MahoganyAncientHouseNetherFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					MahoganyAncientHouseNetherFeature.GENERATE_BIOMES, MahoganyAncientHouseNetherFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}

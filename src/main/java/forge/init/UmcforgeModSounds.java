
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmcforgeModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("umcforge", "breadordead"), new SoundEvent(new ResourceLocation("umcforge", "breadordead")));
		REGISTRY.put(new ResourceLocation("umcforge", "firsthour"), new SoundEvent(new ResourceLocation("umcforge", "firsthour")));
		REGISTRY.put(new ResourceLocation("umcforge", "spaceyvibe"), new SoundEvent(new ResourceLocation("umcforge", "spaceyvibe")));
		REGISTRY.put(new ResourceLocation("umcforge", "oceanfish"), new SoundEvent(new ResourceLocation("umcforge", "oceanfish")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}

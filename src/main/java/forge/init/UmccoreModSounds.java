
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
public class UmccoreModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("umccore", "breadordead"), new SoundEvent(new ResourceLocation("umccore", "breadordead")));
		REGISTRY.put(new ResourceLocation("umccore", "firsthour"), new SoundEvent(new ResourceLocation("umccore", "firsthour")));
		REGISTRY.put(new ResourceLocation("umccore", "spaceyvibe"), new SoundEvent(new ResourceLocation("umccore", "spaceyvibe")));
		REGISTRY.put(new ResourceLocation("umccore", "oceanfish"), new SoundEvent(new ResourceLocation("umccore", "oceanfish")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}

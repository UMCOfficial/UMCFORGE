
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import forge.client.gui.WBGUIScreen;
import forge.client.gui.EssenceGUIScreen;
import forge.client.gui.BenchScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UmcforgeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UmcforgeModMenus.BENCH, BenchScreen::new);
			MenuScreens.register(UmcforgeModMenus.ESSENCE_GUI, EssenceGUIScreen::new);
			MenuScreens.register(UmcforgeModMenus.WBGUI, WBGUIScreen::new);
		});
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import forge.world.inventory.WBGUIMenu;
import forge.world.inventory.EssenceGUIMenu;
import forge.world.inventory.BenchMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmcforgeModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BenchMenu> BENCH = register("bench", (id, inv, extraData) -> new BenchMenu(id, inv, extraData));
	public static final MenuType<EssenceGUIMenu> ESSENCE_GUI = register("essence_gui",
			(id, inv, extraData) -> new EssenceGUIMenu(id, inv, extraData));
	public static final MenuType<WBGUIMenu> WBGUI = register("wbgui", (id, inv, extraData) -> new WBGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

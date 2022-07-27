
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UmcforgeModTabs {
	public static CreativeModeTab TAB_UMC_DISCS;
	public static CreativeModeTab TAB_UMC_FRAGMENTS;
	public static CreativeModeTab TAB_UMC_ESSENCES;
	public static CreativeModeTab TAB_UMC_SPECIAL;
	public static CreativeModeTab TAB_UMC_BIOMES;

	public static void load() {
		TAB_UMC_DISCS = new CreativeModeTab("tabumc_discs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmcforgeModItems.FIRST_HOUR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMC_FRAGMENTS = new CreativeModeTab("tabumc_fragments") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmcforgeModItems.FIRST_FRAGMENT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMC_ESSENCES = new CreativeModeTab("tabumc_essences") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmcforgeModItems.BLANK_ESSENCE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_UMC_SPECIAL = new CreativeModeTab("tabumc_special") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmcforgeModItems.DISCERITE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMC_BIOMES = new CreativeModeTab("tabumc_biomes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmcforgeModItems.UNAVAILABLE_1.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}

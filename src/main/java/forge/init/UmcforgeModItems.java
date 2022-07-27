
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import forge.item.Unavailable1Item;
import forge.item.SpaceyVibeItem;
import forge.item.SpaceyEssenceItem;
import forge.item.SpaceFragmentItem;
import forge.item.FirstHourItem;
import forge.item.FirstFragmentItem;
import forge.item.FirstEssenceItem;
import forge.item.EssencorOnAStickItem;
import forge.item.DisceriteItem;
import forge.item.DiscCoreItem;
import forge.item.DiscBenchOnAStickItem;
import forge.item.BreadOrDeadItem;
import forge.item.BlankEssenceItem;

import forge.UmcforgeMod;

public class UmcforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UmcforgeMod.MODID);
	public static final RegistryObject<Item> BREAD_OR_DEAD = REGISTRY.register("bread_or_dead", () -> new BreadOrDeadItem());
	public static final RegistryObject<Item> FIRST_HOUR = REGISTRY.register("first_hour", () -> new FirstHourItem());
	public static final RegistryObject<Item> SPACEY_VIBE = REGISTRY.register("spacey_vibe", () -> new SpaceyVibeItem());
	public static final RegistryObject<Item> DISC_CORE = REGISTRY.register("disc_core", () -> new DiscCoreItem());
	public static final RegistryObject<Item> DISC_BENCH = block(UmcforgeModBlocks.DISC_BENCH, UmcforgeModTabs.TAB_UMC_SPECIAL);
	public static final RegistryObject<Item> DISC_BENCH_ON_A_STICK = REGISTRY.register("disc_bench_on_a_stick", () -> new DiscBenchOnAStickItem());
	public static final RegistryObject<Item> ESSENCEOR = block(UmcforgeModBlocks.ESSENCEOR, UmcforgeModTabs.TAB_UMC_SPECIAL);
	public static final RegistryObject<Item> ESSENCOR_ON_A_STICK = REGISTRY.register("essencor_on_a_stick", () -> new EssencorOnAStickItem());
	public static final RegistryObject<Item> DISCERITE = REGISTRY.register("discerite", () -> new DisceriteItem());
	public static final RegistryObject<Item> MAHOGANY_WOOD = block(UmcforgeModBlocks.MAHOGANY_WOOD, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_LOG = block(UmcforgeModBlocks.MAHOGANY_LOG, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_PLANKS = block(UmcforgeModBlocks.MAHOGANY_PLANKS, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_STAIRS = block(UmcforgeModBlocks.MAHOGANY_STAIRS, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_SLAB = block(UmcforgeModBlocks.MAHOGANY_SLAB, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_BUTTON = block(UmcforgeModBlocks.MAHOGANY_BUTTON, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_LEAVES = block(UmcforgeModBlocks.MAHOGANY_LEAVES, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_FENCE = block(UmcforgeModBlocks.MAHOGANY_FENCE, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_FENCE_GATE = block(UmcforgeModBlocks.MAHOGANY_FENCE_GATE, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_PRESSURE_PLATE = block(UmcforgeModBlocks.MAHOGANY_PRESSURE_PLATE,
			UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> FIRST_FRAGMENT = REGISTRY.register("first_fragment", () -> new FirstFragmentItem());
	public static final RegistryObject<Item> SPACE_FRAGMENT = REGISTRY.register("space_fragment", () -> new SpaceFragmentItem());
	public static final RegistryObject<Item> DISCERITE_ORE = block(UmcforgeModBlocks.DISCERITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLANK_ESSENCE = REGISTRY.register("blank_essence", () -> new BlankEssenceItem());
	public static final RegistryObject<Item> FIRST_ESSENCE = REGISTRY.register("first_essence", () -> new FirstEssenceItem());
	public static final RegistryObject<Item> UNAVAILABLE_1 = REGISTRY.register("unavailable_1", () -> new Unavailable1Item());
	public static final RegistryObject<Item> ANCIENT_HOUSE_IN_A_BOX = block(UmcforgeModBlocks.ANCIENT_HOUSE_IN_A_BOX, UmcforgeModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> SPACEY_ESSENCE = REGISTRY.register("spacey_essence", () -> new SpaceyEssenceItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

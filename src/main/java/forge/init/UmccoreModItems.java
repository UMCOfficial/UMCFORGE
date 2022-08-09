
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

import forge.item.Unavailable2Item;
import forge.item.Unavailable1Item;
import forge.item.SpaceyVibeItem;
import forge.item.SpaceyEssenceItem;
import forge.item.SpaceFragmentItem;
import forge.item.MahoganySwordItem;
import forge.item.MahoganyShovelItem;
import forge.item.MahoganyPickaxeItem;
import forge.item.MahoganyHoeItem;
import forge.item.MahoganyAxeItem;
import forge.item.HeaveniteSwordItem;
import forge.item.HeaveniteShovelItem;
import forge.item.HeavenitePickaxeItem;
import forge.item.HeaveniteItem;
import forge.item.HeaveniteHoeItem;
import forge.item.HeaveniteAxeItem;
import forge.item.HeaveniteArmorItem;
import forge.item.FirstHourItem;
import forge.item.FirstFragmentItem;
import forge.item.FirstEssenceItem;
import forge.item.EssencorOnAStickItem;
import forge.item.DisceriteItem;
import forge.item.DiscCoreItem;
import forge.item.DiscBenchOnAStickItem;
import forge.item.BreadOrDeadItem;
import forge.item.BreadFragmentItem;
import forge.item.BreadEssenceItem;
import forge.item.BlankEssenceItem;

import forge.UmccoreMod;

public class UmccoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UmccoreMod.MODID);
	public static final RegistryObject<Item> FIRST_HOUR = REGISTRY.register("first_hour", () -> new FirstHourItem());
	public static final RegistryObject<Item> SPACEY_VIBE = REGISTRY.register("spacey_vibe", () -> new SpaceyVibeItem());
	public static final RegistryObject<Item> BREAD_OR_DEAD = REGISTRY.register("bread_or_dead", () -> new BreadOrDeadItem());
	public static final RegistryObject<Item> DISC_CORE = REGISTRY.register("disc_core", () -> new DiscCoreItem());
	public static final RegistryObject<Item> DISC_BENCH = block(UmccoreModBlocks.DISC_BENCH, UmccoreModTabs.TAB_UMC_SPECIAL);
	public static final RegistryObject<Item> DISC_BENCH_ON_A_STICK = REGISTRY.register("disc_bench_on_a_stick", () -> new DiscBenchOnAStickItem());
	public static final RegistryObject<Item> ESSENCEOR = block(UmccoreModBlocks.ESSENCEOR, UmccoreModTabs.TAB_UMC_SPECIAL);
	public static final RegistryObject<Item> ESSENCOR_ON_A_STICK = REGISTRY.register("essencor_on_a_stick", () -> new EssencorOnAStickItem());
	public static final RegistryObject<Item> DISCERITE = REGISTRY.register("discerite", () -> new DisceriteItem());
	public static final RegistryObject<Item> WORKBENCH = block(UmccoreModBlocks.WORKBENCH, UmccoreModTabs.TAB_UMC_SPECIAL);
	public static final RegistryObject<Item> MAHOGANY_WOOD = block(UmccoreModBlocks.MAHOGANY_WOOD, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_LOG = block(UmccoreModBlocks.MAHOGANY_LOG, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_PLANKS = block(UmccoreModBlocks.MAHOGANY_PLANKS, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_STAIRS = block(UmccoreModBlocks.MAHOGANY_STAIRS, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_SLAB = block(UmccoreModBlocks.MAHOGANY_SLAB, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_BUTTON = block(UmccoreModBlocks.MAHOGANY_BUTTON, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_LEAVES = block(UmccoreModBlocks.MAHOGANY_LEAVES, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_FENCE = block(UmccoreModBlocks.MAHOGANY_FENCE, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_FENCE_GATE = block(UmccoreModBlocks.MAHOGANY_FENCE_GATE, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> MAHOGANY_PRESSURE_PLATE = block(UmccoreModBlocks.MAHOGANY_PRESSURE_PLATE, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> ANCIENT_HOUSE_IN_A_BOX = block(UmccoreModBlocks.ANCIENT_HOUSE_IN_A_BOX, UmccoreModTabs.TAB_UMC_BIOMES);
	public static final RegistryObject<Item> FIRST_FRAGMENT = REGISTRY.register("first_fragment", () -> new FirstFragmentItem());
	public static final RegistryObject<Item> SPACE_FRAGMENT = REGISTRY.register("space_fragment", () -> new SpaceFragmentItem());
	public static final RegistryObject<Item> BREAD_FRAGMENT = REGISTRY.register("bread_fragment", () -> new BreadFragmentItem());
	public static final RegistryObject<Item> DISCERITE_ORE = block(UmccoreModBlocks.DISCERITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HEAVENITE_ORE = block(UmccoreModBlocks.HEAVENITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HEAVENITE_BLOCK = block(UmccoreModBlocks.HEAVENITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLANK_ESSENCE = REGISTRY.register("blank_essence", () -> new BlankEssenceItem());
	public static final RegistryObject<Item> FIRST_ESSENCE = REGISTRY.register("first_essence", () -> new FirstEssenceItem());
	public static final RegistryObject<Item> SPACEY_ESSENCE = REGISTRY.register("spacey_essence", () -> new SpaceyEssenceItem());
	public static final RegistryObject<Item> BREAD_ESSENCE = REGISTRY.register("bread_essence", () -> new BreadEssenceItem());
	public static final RegistryObject<Item> MAHOGANY_PICKAXE = REGISTRY.register("mahogany_pickaxe", () -> new MahoganyPickaxeItem());
	public static final RegistryObject<Item> MAHOGANY_AXE = REGISTRY.register("mahogany_axe", () -> new MahoganyAxeItem());
	public static final RegistryObject<Item> MAHOGANY_SHOVEL = REGISTRY.register("mahogany_shovel", () -> new MahoganyShovelItem());
	public static final RegistryObject<Item> MAHOGANY_HOE = REGISTRY.register("mahogany_hoe", () -> new MahoganyHoeItem());
	public static final RegistryObject<Item> HEAVENITE_PICKAXE = REGISTRY.register("heavenite_pickaxe", () -> new HeavenitePickaxeItem());
	public static final RegistryObject<Item> HEAVENITE_AXE = REGISTRY.register("heavenite_axe", () -> new HeaveniteAxeItem());
	public static final RegistryObject<Item> HEAVENITE_SHOVEL = REGISTRY.register("heavenite_shovel", () -> new HeaveniteShovelItem());
	public static final RegistryObject<Item> HEAVENITE_HOE = REGISTRY.register("heavenite_hoe", () -> new HeaveniteHoeItem());
	public static final RegistryObject<Item> MAHOGANY_SWORD = REGISTRY.register("mahogany_sword", () -> new MahoganySwordItem());
	public static final RegistryObject<Item> HEAVENITE_SWORD = REGISTRY.register("heavenite_sword", () -> new HeaveniteSwordItem());
	public static final RegistryObject<Item> HEAVENITE_ARMOR_HELMET = REGISTRY.register("heavenite_armor_helmet",
			() -> new HeaveniteArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVENITE_ARMOR_CHESTPLATE = REGISTRY.register("heavenite_armor_chestplate",
			() -> new HeaveniteArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVENITE_ARMOR_LEGGINGS = REGISTRY.register("heavenite_armor_leggings",
			() -> new HeaveniteArmorItem.Leggings());
	public static final RegistryObject<Item> HEAVENITE_ARMOR_BOOTS = REGISTRY.register("heavenite_armor_boots", () -> new HeaveniteArmorItem.Boots());
	public static final RegistryObject<Item> UNAVAILABLE_2 = REGISTRY.register("unavailable_2", () -> new Unavailable2Item());
	public static final RegistryObject<Item> HEAVENITE = REGISTRY.register("heavenite", () -> new HeaveniteItem());
	public static final RegistryObject<Item> UNAVAILABLE_1 = REGISTRY.register("unavailable_1", () -> new Unavailable1Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import forge.block.WorkbenchBlock;
import forge.block.MahoganyWoodBlock;
import forge.block.MahoganyStairsBlock;
import forge.block.MahoganySlabBlock;
import forge.block.MahoganyPressurePlateBlock;
import forge.block.MahoganyPlanksBlock;
import forge.block.MahoganyLogBlock;
import forge.block.MahoganyLeavesBlock;
import forge.block.MahoganyFenceGateBlock;
import forge.block.MahoganyFenceBlock;
import forge.block.MahoganyButtonBlock;
import forge.block.HeaveniteOreBlock;
import forge.block.HeaveniteBlockBlock;
import forge.block.EssenceorBlock;
import forge.block.DisceriteOreBlock;
import forge.block.DiscBenchBlock;
import forge.block.AncientHouseInABoxBlock;

import forge.UmcforgeMod;

public class UmcforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UmcforgeMod.MODID);
	public static final RegistryObject<Block> DISC_BENCH = REGISTRY.register("disc_bench", () -> new DiscBenchBlock());
	public static final RegistryObject<Block> ESSENCEOR = REGISTRY.register("essenceor", () -> new EssenceorBlock());
	public static final RegistryObject<Block> WORKBENCH = REGISTRY.register("workbench", () -> new WorkbenchBlock());
	public static final RegistryObject<Block> MAHOGANY_WOOD = REGISTRY.register("mahogany_wood", () -> new MahoganyWoodBlock());
	public static final RegistryObject<Block> MAHOGANY_LOG = REGISTRY.register("mahogany_log", () -> new MahoganyLogBlock());
	public static final RegistryObject<Block> MAHOGANY_PLANKS = REGISTRY.register("mahogany_planks", () -> new MahoganyPlanksBlock());
	public static final RegistryObject<Block> MAHOGANY_STAIRS = REGISTRY.register("mahogany_stairs", () -> new MahoganyStairsBlock());
	public static final RegistryObject<Block> MAHOGANY_SLAB = REGISTRY.register("mahogany_slab", () -> new MahoganySlabBlock());
	public static final RegistryObject<Block> MAHOGANY_BUTTON = REGISTRY.register("mahogany_button", () -> new MahoganyButtonBlock());
	public static final RegistryObject<Block> MAHOGANY_LEAVES = REGISTRY.register("mahogany_leaves", () -> new MahoganyLeavesBlock());
	public static final RegistryObject<Block> MAHOGANY_FENCE = REGISTRY.register("mahogany_fence", () -> new MahoganyFenceBlock());
	public static final RegistryObject<Block> MAHOGANY_FENCE_GATE = REGISTRY.register("mahogany_fence_gate", () -> new MahoganyFenceGateBlock());
	public static final RegistryObject<Block> MAHOGANY_PRESSURE_PLATE = REGISTRY.register("mahogany_pressure_plate",
			() -> new MahoganyPressurePlateBlock());
	public static final RegistryObject<Block> ANCIENT_HOUSE_IN_A_BOX = REGISTRY.register("ancient_house_in_a_box",
			() -> new AncientHouseInABoxBlock());
	public static final RegistryObject<Block> DISCERITE_ORE = REGISTRY.register("discerite_ore", () -> new DisceriteOreBlock());
	public static final RegistryObject<Block> HEAVENITE_ORE = REGISTRY.register("heavenite_ore", () -> new HeaveniteOreBlock());
	public static final RegistryObject<Block> HEAVENITE_BLOCK = REGISTRY.register("heavenite_block", () -> new HeaveniteBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DiscBenchBlock.registerRenderLayer();
			EssenceorBlock.registerRenderLayer();
		}
	}
}

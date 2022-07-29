
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import forge.block.entity.WorkbenchBlockEntity;
import forge.block.entity.EssenceorBlockEntity;
import forge.block.entity.DiscBenchBlockEntity;

import forge.UmcforgeMod;

public class UmcforgeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, UmcforgeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DISC_BENCH = register("disc_bench", UmcforgeModBlocks.DISC_BENCH,
			DiscBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ESSENCEOR = register("essenceor", UmcforgeModBlocks.ESSENCEOR, EssenceorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WORKBENCH = register("workbench", UmcforgeModBlocks.WORKBENCH, WorkbenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

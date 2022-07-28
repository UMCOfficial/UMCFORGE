package forge.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AncientHouseInABoxBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos(x, y, z), false);
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("umcforge", "mahoganyancienthouse"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
	}
}

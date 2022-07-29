
package forge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import forge.world.inventory.WBGUIMenu;

import forge.procedures.WBGUIPProcedure;

import forge.UmcforgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WBGUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public WBGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public WBGUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(WBGUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(WBGUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = WBGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 0 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 1 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 2 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 3 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 4 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 5 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 6 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 7 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
		if (slotID == 8 && changeType == 0) {

			WBGUIPProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		UmcforgeMod.addNetworkMessage(WBGUISlotMessage.class, WBGUISlotMessage::buffer, WBGUISlotMessage::new, WBGUISlotMessage::handler);
	}
}


package forge.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import forge.world.inventory.EssenceGUIMenu;

import forge.network.EssenceGUIButtonMessage;

import forge.UmccoreMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EssenceGUIScreen extends AbstractContainerScreen<EssenceGUIMenu> {
	private final static HashMap<String, Object> guistate = EssenceGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EssenceGUIScreen(EssenceGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umccore:textures/essence_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umccore:textures/arrowup.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 26, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umccore:textures/arrowright.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 7, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umccore:textures/arrowright.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 7, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umccore:textures/arrowright.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 7, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umccore:textures/arrowdown.png"));
		this.blit(ms, this.leftPos + 143, this.topPos + 27, 0, 0, 32, 32, 32, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 56, this.topPos + 58, 61, 20, new TextComponent("Convert"), e -> {
			if (true) {
				UmccoreMod.PACKET_HANDLER.sendToServer(new EssenceGUIButtonMessage(0, x, y, z));
				EssenceGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}

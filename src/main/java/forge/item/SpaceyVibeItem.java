
package forge.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import forge.procedures.SpaceyVibeLivingEntityIsHitWithItemProcedure;

import forge.init.UmccoreModTabs;
import forge.init.UmccoreModSounds;

public class SpaceyVibeItem extends RecordItem {
	public SpaceyVibeItem() {
		super(0, UmccoreModSounds.REGISTRY.get(new ResourceLocation("umccore:spaceyvibe")),
				new Item.Properties().tab(UmccoreModTabs.TAB_UMC_DISCS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Send People To Space"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SpaceyVibeLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}

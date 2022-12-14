
package forge.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import forge.init.UmccoreModTabs;
import forge.init.UmccoreModSounds;

public class BreadOrDeadItem extends RecordItem {
	public BreadOrDeadItem() {
		super(0, UmccoreModSounds.REGISTRY.get(new ResourceLocation("umccore:breadordead")),
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
		list.add(new TextComponent("Have A Bready Day!"));
	}
}


package forge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import forge.init.UmccoreModItems;

public class HeaveniteAxeItem extends AxeItem {
	public HeaveniteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1864;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 59;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmccoreModItems.HEAVENITE.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}

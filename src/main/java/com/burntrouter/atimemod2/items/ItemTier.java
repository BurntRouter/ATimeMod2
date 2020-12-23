package com.burntrouter.atimemod2.items;

import java.util.function.Supplier;

import com.burntrouter.atimemod2.init.ModItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTier implements IItemTier {
	CRYSTAL(3, 768, 8.0F, 2.5F, 25, () -> {
		return Ingredient.fromItems(ModItems.CRYSTAL_GEM);
	}),
	
	DEMONIC(4, 3458, 6.5F, 4F, 20, () -> {
		return Ingredient.fromItems(ModItems.DEMONIC_INGOT);
	
	});

	   private final int harvestLevel;
	   private final int maxUses;
	   private final float efficiency;
	   private final float attackDamage;
	   private final int enchantability;
	   private final LazyValue<Ingredient> repairMaterial;

	   private ItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
	      this.harvestLevel = harvestLevelIn;
	      this.maxUses = maxUsesIn;
	      this.efficiency = efficiencyIn;
	      this.attackDamage = attackDamageIn;
	      this.enchantability = enchantabilityIn;
	      this.repairMaterial = new LazyValue<>(repairMaterialIn);
	   }

	   public int getMaxUses() {
	      return this.maxUses;
	   }

	   public float getEfficiency() {
	      return this.efficiency;
	   }

	   public float getAttackDamage() {
	      return this.attackDamage;
	   }

	   public int getHarvestLevel() {
	      return this.harvestLevel;
	   }

	   public int getEnchantability() {
	      return this.enchantability;
	   }

	   public Ingredient getRepairMaterial() {
	      return this.repairMaterial.getValue();
	   }

}

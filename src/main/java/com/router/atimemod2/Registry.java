package com.router.atimemod2;

import com.router.atimemod2.blocks.ATimeBlocks;
import com.router.atimemod2.items.ATimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry {
	
	public static void initRecipes() {
		GameRegistry.addSmelting(ATimeBlocks.crystal_ore, new ItemStack(ATimeItems.crystal_gem, 1), 0.4F);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(ATimeItems.candy, 1), 0.1F);
		GameRegistry.addSmelting(ATimeItems.steel_base, new ItemStack(ATimeItems.steel_ingot), 0.2F);
		GameRegistry.addSmelting(Items.NETHER_WART, new ItemStack(ATimeItems.demon_blood), 0.3F);
	}
}
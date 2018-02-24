package com.router1011.atimemod2;

import com.router1011.atimemod2.blocks.ATimeBlocks;
import com.router1011.atimemod2.items.ATimeItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry {
	
	public static void initRecipes() {
		GameRegistry.addSmelting(ATimeBlocks.steel_ore, new ItemStack(ATimeItems.steel_ingot, 1), 0.4F);
		GameRegistry.addSmelting(ATimeBlocks.demonic_ore, new ItemStack(ATimeItems.demon_blood, 3), 0.6F);
		GameRegistry.addSmelting(ATimeBlocks.crystal_ore, new ItemStack(ATimeItems.crystal_gem, 1), 0.4F);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(ATimeItems.candy, 1), 0.1F);
	}
	
	public static void initOreGen() {
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
	}
}
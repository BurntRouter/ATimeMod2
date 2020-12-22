package com.burntrouter.atimemod2.init;

import com.burntrouter.atimemod2.ATimeMod2;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	//BlockItems
	public static final Item CRYSTAL_BLOCK = new BlockItem(ModBlocks.CRYSTAL_BLOCK, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_block");
	
	//Foods
	public static final Item APPLE_PIE = new Item(new Item.Properties().food(new Food.Builder().hunger(6).saturation(2.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("apple_pie");
	public static final Item BACON = new Item(new Item.Properties().food(new Food.Builder().hunger(2).saturation(0.3F).meat().fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bacon");
	public static final Item BACON_PANCAKE = new Item(new Item.Properties().food(new Food.Builder().hunger(3).saturation(0.6F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bacon_pancake");
	public static final Item bubblegum = new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1F).fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bubblegum");
	public static final Item candy = new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1F).fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy");
	public static final Item cotton_candy = new Item(new Item.Properties().food(new Food.Builder().hunger(3).saturation(0.6F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("cotton_candy");
	
	//Items
	public static final Item CRYSTAL_GEM = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_gem");
	
	//Tools
	public static final Item bass_axe = new Item(new Item.Properties().addToolType(ToolType.AXE, 3).maxStackSize(1).isImmuneToFire().group(ATimeMod2.ITEM_GROUP)).setRegistryName("bass_axe");
	public static final Item billy_gauntlet = new Item(new Item.Properties().maxStackSize(1).isImmuneToFire().group(ATimeMod2.ITEM_GROUP)).setRegistryName("billy_gauntlet");

	
	//Register Items
	public static void register(IForgeRegistry<Item> forgeRegistry) {
		//Register Items
		forgeRegistry.registerAll(BACON, CRYSTAL_GEM);
		
		//Register BlocksItem
		forgeRegistry.register(CRYSTAL_BLOCK);
	}
}

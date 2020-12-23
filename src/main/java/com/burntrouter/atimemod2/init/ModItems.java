package com.burntrouter.atimemod2.init;

import com.burntrouter.atimemod2.ATimeMod2;
import com.burntrouter.atimemod2.items.ItemTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	//BlockItems
	public static final Item BANANA_YELLOW = new BlockItem(ModBlocks.BANANA_YELLOW, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("banana_yellow");
	public static final Item BERRY_BLUE = new BlockItem(ModBlocks.BERRY_BLUE, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("berry_blue");
	public static final Item CANDY_DIRT = new BlockItem(ModBlocks.CANDY_DIRT, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy_dirt");
	public static final Item CANDY_GRASS = new BlockItem(ModBlocks.CANDY_GRASS, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy_grass");
	public static final Item CANDY_LEAVES = new BlockItem(ModBlocks.CANDY_LEAVES, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy_leaves");
	public static final Item CANDY_LOG = new BlockItem(ModBlocks.CANDY_LOG, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy_log");
	public static final Item CANDY_SAPLING = new BlockItem(ModBlocks.CANDY_SAPLING, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy_sapling");
	public static final Item CHERRY_RED = new BlockItem(ModBlocks.CHERRY_RED, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("cherry_red");
	public static final Item CHOCOLATE_BROWN = new BlockItem(ModBlocks.CHOCOLATE_BROWN, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("chocolate_brown");
	public static final Item CREAM_WHITE = new BlockItem(ModBlocks.CREAM_WHITE, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("cream_white");
	public static final Item CRYSTAL_BLOCK = new BlockItem(ModBlocks.CRYSTAL_BLOCK, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_block");
	public static final Item CRYSTAL_ORE = new BlockItem(ModBlocks.CRYSTAL_ORE, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_ore");
	public static final Item GRAPE_PURPLE = new BlockItem(ModBlocks.GRAPE_PURPLE, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("grape_purple");
	public static final Item JUICE = new BlockItem(ModBlocks.JUICE, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("juice");
	public static final Item WATERMELON_PINK = new BlockItem(ModBlocks.WATERMELON_PINK, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("watermelon_pink");
	
	//Foods
//	public static final Item APPLE_PIE = new Item(new Item.Properties().food(new Food.Builder().hunger(6).saturation(2.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("apple_pie");
	public static final Item BACON = new Item(new Item.Properties().food(new Food.Builder().hunger(2).saturation(0.3F).meat().fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bacon");
	public static final Item BACON_PANCAKE = new Item(new Item.Properties().food(new Food.Builder().hunger(6).saturation(2.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bacon_pancake");
	public static final Item BUBBLEGUM = new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1F).fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("bubblegum");
	public static final Item CANDY = new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1F).fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("candy");
	public static final Item COTTON_CANDY = new Item(new Item.Properties().food(new Food.Builder().hunger(3).saturation(0.6F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("cotton_candy");
	public static final Item CRYSTAL_GEM_APPLE = new Item(new Item.Properties().food(new Food.Builder().hunger(4).saturation(0.6F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_gem_apple");
	public static final Item DONUT = new Item(new Item.Properties().food(new Food.Builder().hunger(4).saturation(1.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("donut");
	public static final Item EVERYTHING_BURRITO = new Item(new Item.Properties().food(new Food.Builder().hunger(8).saturation(2.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("everything_burrito");
	public static final Item LOLLIPOP = new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(0.1F).fastToEat().build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("lollipop");
	public static final Item PANCAKE = new Item(new Item.Properties().food(new Food.Builder().hunger(3).saturation(1.0F).build()).group(ATimeMod2.ITEM_GROUP)).setRegistryName("pancake");
	
	//Items
	public static final Item CRYSTAL_GEM = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_gem");
	public static final Item DEMON_BLOOD = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("demon_blood");
	public static final Item DEMONIC_INGOT = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("demonic_ingot");
	public static final Item ENCHIRIDION = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("enchiridion");
	public static final Item FLOUR = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("flour");
	public static final Item STEEL_INGOT = new Item(new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("steel_ingot");
	
	//Tools
	public static final Item BASS_AXE = new Item(new Item.Properties().addToolType(ToolType.AXE, 3).maxStackSize(1).isImmuneToFire().group(ATimeMod2.ITEM_GROUP)).setRegistryName("bass_axe");
	public static final Item BILLY_GAUNTLET = new Item(new Item.Properties().maxStackSize(1).isImmuneToFire().group(ATimeMod2.ITEM_GROUP)).setRegistryName("billy_gauntlet");
	public static final Item CRYSTAL_AXE = new AxeItem(ItemTier.CRYSTAL, 8F, 0.1F, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_axe");
	public static final Item CRYSTAL_HOE = new HoeItem(ItemTier.CRYSTAL, 0, 0, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_hoe");
	public static final Item CRYSTAL_PICKAXE = new PickaxeItem(ItemTier.CRYSTAL, 0, 0, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_pickaxe");
	public static final Item CRYSTAL_SHOVEL = new ShovelItem(ItemTier.CRYSTAL, 0, 0, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_shovel");
	public static final Item CRYSTAL_SWORD = new SwordItem(ItemTier.CRYSTAL, 6, 0.4F, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("crystal_sword");
	public static final Item DEMONIC_SWORD = new SwordItem(ItemTier.DEMONIC, 6, 0.6F, new Item.Properties().group(ATimeMod2.ITEM_GROUP)).setRegistryName("demonic_sword");
	public static final Item FOURD_SWORD = new SwordItem(null, 0, 0, new Item.Properties().group(null).setNoRepair()).setRegistryName("fourd_sword");
	public static final Item GRASS_SWORD = new SwordItem(null, 0, 0, new Item.Properties().group(null).setNoRepair()).setRegistryName("grass_sword");
	public static final Item PAPER_SWORD = new SwordItem(null, 0, 0, new Item.Properties().group(null).setNoRepair()).setRegistryName("paper_sword");
	public static final Item ROOT_SWORD = new SwordItem(null, 0, 0, new Item.Properties().group(null).setNoRepair()).setRegistryName("root_sword");
	public static final Item SCARLET = new SwordItem(null, 0, 0, new Item.Properties().group(null).setNoRepair()).setRegistryName("scarlet");
	
	//Register Items
	public static void register(IForgeRegistry<Item> forgeRegistry) {
		//Register BlocksItem
		forgeRegistry.registerAll(BANANA_YELLOW, BERRY_BLUE, CANDY_DIRT, CANDY_GRASS, CANDY_LEAVES, CANDY_LOG, CANDY_SAPLING, CHERRY_RED, CHOCOLATE_BROWN, CREAM_WHITE, CRYSTAL_BLOCK, GRAPE_PURPLE, JUICE, WATERMELON_PINK);
		
		//Register Foods
		forgeRegistry.registerAll(BACON, BACON_PANCAKE, BUBBLEGUM, CANDY, COTTON_CANDY);
		
		//Register Items
		forgeRegistry.registerAll(CRYSTAL_GEM);
		
		//Register Tools
		forgeRegistry.registerAll(BASS_AXE, BILLY_GAUNTLET, CRYSTAL_AXE, CRYSTAL_HOE, CRYSTAL_PICKAXE, CRYSTAL_SHOVEL, CRYSTAL_SWORD);
		

	}
}

package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ATimeItems {

	public static ItemBase billy_gauntlet = new ItemBase("billy_gauntlet");
	public static ItemBase crystal_gem = new ItemBase("crystal_gem");
	public static ItemBase demon_blood = new ItemBase("demon_blood");
	public static ItemBase demon_ingot = new ItemBase("demon_ingot");
	public static ItemBase enchiridion_item = new ItemEnchiridion("enchiridion_item");
	public static ItemBase flour = new ItemBase("flour");
	public static ItemBase ice_shard = new ItemBase("ice_shard");
	public static ItemBase steel_ingot = new ItemBase("steel_ingot");

	public static ArmorBase JakeBoots, JakeChest, JakeHead, JakeLegs;
	
	public static ShovelBase CrystalShovel;

	public static AxeBase CrystalAxe;
	
	public static HoeBase CrystalHoe;
	
	public static PickaxeBase CrystalPickaxe;

	public static FoodBase Bacon, BaconPancake, BubbleGum, Candy, CottonCandy, Donut, EverythingBurrito, GemApple, Lollipop, Pancake;

	public static SwordBase CrystalSword, DemonSword, FourDSword, GrassSword, JakeSword, Scarlet, PaperSword, RootSword;

	public static void registerItems(IForgeRegistry<Item> registry) {
		registry.registerAll(
				billy_gauntlet, 
				crystal_gem, 
				demon_blood, 
				demon_ingot, 
				enchiridion_item, 
				flour, 
				ice_shard, 
				steel_ingot
		);
	}
	
	public static void registerItemModels() {
		billy_gauntlet.registerItemModel();
		crystal_gem.registerItemModel();
		demon_blood.registerItemModel();
		demon_ingot.registerItemModel();
		enchiridion_item.registerItemModel();
		flour.registerItemModel();
		ice_shard.registerItemModel();
		steel_ingot.registerItemModel();
	};

}
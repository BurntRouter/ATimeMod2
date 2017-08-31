package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item;
import zdoctor.lazymodder.easy.items.EasyArmor;
import zdoctor.lazymodder.easy.items.EasyItemTool;
import zdoctor.lazymodder.easy.items.EasyItemTool.*;

public class ATimeItems {
	public static ItemBase BassAxe, BillyGauntlet, CrystalGem, DemonBlood, DemonIngot, Enchiridion, Flour, IceShard, SteelIngot;

	public static ArmorBase JakeBoots, JakeChest, JakeHead, JakeLegs;
	
	public static ShovelBase CrystalShovel;

	public static AxeBase CrystalAxe;
	
	public static HoeBase CrystalHoe;
	
	public static PickaxeBase CrystalPickaxe;

	public static FoodBase Bacon, BaconPancake, BubbleGum, Candy, CottonCandy, Donut, EverythingBurrito, GemApple, Lollipop, Pancake;

	public static SwordBase CrystalSword, DemonSword, FourDSword, GrassSword, JakeSword, Scarlet, PaperSword, RootSword;

	public static void initItems() {

		// ApplePie = new ItemBase("ApplePie");
		Bacon = new FoodBase("Bacon", 6, 6F, true);
		BaconPancake = new FoodBase("BaconPancake", 16, 7F, false);
		BassAxe = new ItemBase("BassAxe");
		BillyGauntlet = new ItemBase("BillyGauntlet");
		BubbleGum = new FoodBase("BubbleGum", 1, 1F, false);
		Candy = new FoodBase("Candy", 2, 2F, false);
		CottonCandy = new FoodBase("CottonCandy", 2, 2F, false);
		CrystalAxe = new AxeBase("CrystalAxe", ATimeMod.CRYSTAL);
		CrystalGem = new ItemBase("CrystalGem");
		CrystalHoe = new HoeBase("CrystalHoe", ATimeMod.CRYSTAL);
		CrystalPickaxe = new PickaxeBase("CrystalPickaxe", ATimeMod.CRYSTAL);
		CrystalShovel = new ShovelBase("CrystalShovel", ATimeMod.CRYSTAL);
		CrystalSword = new SwordBase("CrystalSword", ATimeMod.CRYSTAL);
		DemonBlood = new ItemBase("DemonBlood");
		DemonIngot = new ItemBase("DemonIngot");
		//You can't pass a null tool material >.>
		//Wanna bet?
		DemonSword = new SwordBase("DemonSword", Item.ToolMaterial.IRON);
		Donut = new FoodBase("Donut", 4, 6F, false);
		Enchiridion = new ItemEnchiridion("Enchiridion");
		EverythingBurrito = new FoodBase("EverythingBurrito", 16, 8F, false);
		Flour = new ItemBase("Flour");
		FourDSword = new SwordBase("FourDSword", ATimeMod.FOURD);
		GemApple = new FoodBase("GemApple", 20, 20F, false);
		GrassSword = new SwordBase("GrassSword", ATimeMod.GRASS);
		IceShard = new ItemBase("IceShard");
//		JakeBoots = new ArmorBase("JakeBoots", null, 0, null);
//		JakeChest = new ArmorBase("JakeChest", null, 0, null);
//		JakeHead = new ArmorBase("JakeHead", null, 0, null);
//		JakeLegs = new ArmorBase("JakeLegs", null, 0, null);
		JakeSword = new SwordBase("JakeSword", ATimeMod.SCARLET);
		Lollipop = new FoodBase("Lollipop", 1, 1F, false);
		Pancake = new FoodBase("Pancake", 14, 7F, false);
		// These too. Why were they null?
		PaperSword = new SwordBase("PaperSword", Item.ToolMaterial.IRON);
		RootSword = new SwordBase("RootSword", Item.ToolMaterial.IRON);
		Scarlet = new SwordBase("Scarlet", ATimeMod.SCARLET);
		SteelIngot = new ItemBase("SteelIngot");
	};

}
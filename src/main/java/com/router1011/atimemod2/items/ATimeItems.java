package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

public class ATimeItems {
	public static ItemBase BassAxe, BillyGauntlet, CrystalAxe, CrystalGem, CrystalHoe, CrystalPickaxe, CrystalShovel,
	CrystalSword, DemonBlood, DemonIngot, DemonSword, Enchiridion, Flour, GrassSword, IceShard, JakeBoots, JakeChest, 
	JakeHead, JakeLegs, JakeSword, PaperSword, RootSword, SteelIngot;

	public static FoodBase Bacon, BaconPancake, BubbleGum, Candy, CottonCandy, Donut, EverythingBurrito, GemApple, Lollipop, Pancake;

	public static SwordBase FourDSword, Scarlet;

	public static void initItems() {

		// ApplePie = new ItemBase("ApplePie");
		Bacon = new FoodBase("Bacon", 6, 6F, false);
		BaconPancake = new FoodBase("BaconPancake", 16, 7F, false);
		BassAxe = new ItemBase("BassAxe");
		BillyGauntlet = new ItemBase("BillyGauntlet");
		BubbleGum = new FoodBase("BubbleGum", 1, 1F, false);
		Candy = new FoodBase("Candy", 2, 2F, false);
		CottonCandy = new FoodBase("CottonCandy", 2, 2F, false);
		CrystalAxe = new ItemBase("CrystalAxe");
		CrystalGem = new ItemBase("CrystalGem");
		CrystalHoe = new ItemBase("CrystalHoe");
		CrystalPickaxe = new ItemBase("CrystalPickaxe");
		CrystalShovel = new ItemBase("CrystalShovel");
		CrystalSword = new ItemBase("CrystalSword");
		DemonBlood = new ItemBase("DemonBlood");
		DemonIngot = new ItemBase("DemonIngot");
		DemonSword = new ItemBase("DemonSword");
		Donut = new FoodBase("Donut", 4, 6F, false);
		Enchiridion = new ItemEnchiridion("Enchiridion");
		EverythingBurrito = new FoodBase("EverythingBurrito", 16, 8F, false);
		Flour = new ItemBase("Flour");
		FourDSword = new SwordBase("FourDSword", ATimeMod.FourD);
		GemApple = new FoodBase("GemApple", 20, 20F, false);
		GrassSword = new ItemBase("GrassSword");
		IceShard = new ItemBase("IceShard");
		JakeBoots = new ItemBase("JakeBoots");
		JakeChest = new ItemBase("JakeChest");
		JakeHead = new ItemBase("JakeHead");
		JakeLegs = new ItemBase("JakeLegs");
		JakeSword = new ItemBase("JakeSword");
		Lollipop = new FoodBase("Lollipop", 1, 1F, false);
		Pancake = new FoodBase("Pancake", 14, 7F, false);
		PaperSword = new ItemBase("PaperSword");
		RootSword = new ItemBase("RootSword");
		Scarlet = new SwordBase("Scarlet", ATimeMod.SCARLET);
		SteelIngot = new ItemBase("SteelIngot");
	};

}
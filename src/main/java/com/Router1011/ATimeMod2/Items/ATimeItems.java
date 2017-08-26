package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ATimeItems {
	public static ItemBase Bacon, BaconPancake, BassAxe, BillyGauntlet, BubbleGum, Candy, CottonCandy, CrystalAxe,
			CrystalGem, CrystalHoe, CrystalPickaxe, CrystalShovel, CrystalSword, DemonBlood, DemonIngot, DemonSword,
			Donut, Enchiridion, EverythingBurrito, Flour, GemApple, GrassSword, IceShard, JakeBoots, JakeChest,
			JakeHead, JakeLegs, JakeSword, Lollipop, Pancake, PaperSword, RootSword, SteelIngot;

	public static ATimeSword FourDSword, Scarlet;

	public static void initItems() {

		// ApplePie = new ItemBase("ApplePie");
		Bacon = new ItemBase("Bacon");
		BaconPancake = new ItemBase("BaconPancake");
		BassAxe = new ItemBase("BassAxe");
		BillyGauntlet = new ItemBase("BillyGauntlet");
		BubbleGum = new ItemBase("BubbleGum");
		Candy = new ItemBase("Candy");
		CottonCandy = new ItemBase("CottonCandy");
		CrystalAxe = new ItemBase("CrystalAxe");
		CrystalGem = new ItemBase("CrystalGem");
		CrystalHoe = new ItemBase("CrystalHoe");
		CrystalPickaxe = new ItemBase("CrystalPickaxe");
		CrystalShovel = new ItemBase("CrystalShovel");
		CrystalSword = new ItemBase("CrystalSword");
		DemonBlood = new ItemBase("DemonBlood");
		DemonIngot = new ItemBase("DemonIngot");
		DemonSword = new ItemBase("DemonSword");
		Donut = new ItemBase("Donut");
		Enchiridion = new ItemEnchiridion("Enchiridion");
		EverythingBurrito = new ItemBase("EverythingBurrito");
		Flour = new ItemBase("Flour");
		FourDSword = new ATimeSword("FourDSword", ATimeMod.FourD);
		GemApple = new ItemBase("GemApple");
		GrassSword = new ItemBase("GrassSword");
		IceShard = new ItemBase("IceShard");
		JakeBoots = new ItemBase("JakeBoots");
		JakeChest = new ItemBase("JakeChest");
		JakeHead = new ItemBase("JakeHead");
		JakeLegs = new ItemBase("JakeLegs");
		JakeSword = new ItemBase("JakeSword");
		Lollipop = new ItemBase("Lollipop");
		Pancake = new ItemBase("Pancake");
		PaperSword = new ItemBase("PaperSword");
		RootSword = new ItemBase("RootSword");
		Scarlet = new ATimeSword("Scarlet", ATimeMod.SCARLET);
		SteelIngot = new ItemBase("SteelIngot");
	};

}
package com.Router1011.ATimeMod2.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ATimeItems {
	public static ItemBase ApplePie, Bacon, BaconPancake, BassAxe, BillyGauntlet, BubbleGum,
	Candy, CottonCandy, CrystalAxe, CrystalGem, CrystalHoe, CrystalPickaxe, CrystalShovel, CrystalSword,
	DemonBlood, DemonIngot, DemonSword, Donut, Enchiridion, EverythingBurrito, Flour, FourDSword, GemApple,
	GrassSword, IceShard, JakeBoots, JakeChest, JakeHead, JakeLegs, JakeSword, Lollipop, Pancake, PaperSword,
	RootSword, Scarlet, SteelIngot;
	 
	 public static void init() {
		 
	ApplePie = register(new ItemBase("ApplePie"));
	Bacon = register(new ItemBase("Bacon"));
	BaconPancake = register(new ItemBase("BaconPancake"));
	BassAxe = register(new ItemBase("BassAxe"));
	BillyGauntlet = register(new ItemBase("BillyGauntlet"));
	BubbleGum = register(new ItemBase("BubbleGum"));
	Candy = register(new ItemBase("Candy"));
	CottonCandy = register(new ItemBase("CottonCandy"));
	CrystalAxe = register(new ItemBase("CrystalAxe"));
	CrystalGem = register(new ItemBase("CrystalGem"));
	CrystalHoe = register(new ItemBase("CrystalHoe"));
	CrystalPickaxe = register(new ItemBase("CrystalPickaxe"));
	CrystalShovel = register(new ItemBase("CrystalShovel"));
	CrystalSword = register(new ItemBase("CrystalSword"));
	DemonBlood = register(new ItemBase("DemonBlood"));
	DemonIngot = register(new ItemBase("DemonIngot"));
	DemonSword = register(new ItemBase("DemonSword"));
	Donut = register(new ItemBase("Donut"));
	Enchiridion = register(new ItemBase("Enchiridion"));
	EverythingBurrito = register(new ItemBase("EverythingBurrito"));
	Flour = register(new ItemBase("Flour"));
	GemApple = register(new ItemBase("GemApple"));
	GrassSword = register(new ItemBase("GrassSword"));
	IceShard = register(new ItemBase("IceShard"));
	JakeBoots = register(new ItemBase("JakeBoots"));
	JakeChest = register(new ItemBase("JakeChest"));
	JakeHead = register(new ItemBase("JakeHead"));
	JakeLegs = register(new ItemBase("JakeLegs"));
	JakeSword = register(new ItemBase("JakeSword"));
	Lollipop = register(new ItemBase("Lollipop"));
	Pancake = register(new ItemBase("Pancake"));
	PaperSword = register(new ItemBase("PaperSword"));
	RootSword = register(new ItemBase("RootSword"));
	Scarlet = register(new ItemBase("Scarlet"));
	SteelIngot = register(new ItemBase("SteelIngot"));	
	 };

	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
		 
}
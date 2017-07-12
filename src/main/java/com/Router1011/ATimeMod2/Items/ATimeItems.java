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
		 
	ApplePie = register(new ItemBase("ApplePie").setCreativeTab(CreativeTabs.MATERIALS));
	Bacon = register(new ItemBase("Bacon").setCreativeTab(CreativeTabs.MATERIALS));
	BaconPancake = register(new ItemBase("BaconPancake").setCreativeTab(CreativeTabs.MATERIALS));
	BassAxe = register(new ItemBase("BassAxe").setCreativeTab(CreativeTabs.MATERIALS));
	BillyGauntlet = register(new ItemBase("BillyGauntlet").setCreativeTab(CreativeTabs.MATERIALS));
	BubbleGum = register(new ItemBase("BubbleGum").setCreativeTab(CreativeTabs.MATERIALS));
	Candy = register(new ItemBase("Candy").setCreativeTab(CreativeTabs.MATERIALS));
	CottonCandy = register(new ItemBase("CottonCandy").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalAxe = register(new ItemBase("CrystalAxe").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalGem = register(new ItemBase("CrystalGem").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalHoe = register(new ItemBase("CrystalHoe").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalPickaxe = register(new ItemBase("CrystalPickaxe").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalShovel = register(new ItemBase("CrystalShovel").setCreativeTab(CreativeTabs.MATERIALS));
	CrystalSword = register(new ItemBase("CrystalSword").setCreativeTab(CreativeTabs.MATERIALS));
	DemonBlood = register(new ItemBase("DemonBlood").setCreativeTab(CreativeTabs.MATERIALS));
	DemonIngot = register(new ItemBase("DemonIngot").setCreativeTab(CreativeTabs.MATERIALS));
	DemonSword = register(new ItemBase("DemonSword").setCreativeTab(CreativeTabs.MATERIALS));
	Donut = register(new ItemBase("Donut").setCreativeTab(CreativeTabs.MATERIALS));
	Enchiridion = register(new ItemBase("Enchiridion").setCreativeTab(CreativeTabs.MATERIALS));
	EverythingBurrito = register(new ItemBase("EverythingBurrito").setCreativeTab(CreativeTabs.MATERIALS));
	Flour = register(new ItemBase("Flour").setCreativeTab(CreativeTabs.MATERIALS));
	GemApple = register(new ItemBase("GemApple").setCreativeTab(CreativeTabs.MATERIALS));
	GrassSword = register(new ItemBase("GrassSword").setCreativeTab(CreativeTabs.MATERIALS));
	IceShard = register(new ItemBase("IceShard").setCreativeTab(CreativeTabs.MATERIALS));
	JakeBoots = register(new ItemBase("JakeBoots").setCreativeTab(CreativeTabs.MATERIALS));
	JakeChest = register(new ItemBase("JakeChest").setCreativeTab(CreativeTabs.MATERIALS));
	JakeHead = register(new ItemBase("JakeHead").setCreativeTab(CreativeTabs.MATERIALS));
	JakeLegs = register(new ItemBase("JakeLegs").setCreativeTab(CreativeTabs.MATERIALS));
	JakeSword = register(new ItemBase("JakeSword").setCreativeTab(CreativeTabs.MATERIALS));
	Lollipop = register(new ItemBase("Lollipop").setCreativeTab(CreativeTabs.MATERIALS));
	Pancake = register(new ItemBase("Pancake").setCreativeTab(CreativeTabs.MATERIALS));
	PaperSword = register(new ItemBase("PaperSword").setCreativeTab(CreativeTabs.MATERIALS));
	RootSword = register(new ItemBase("RootSword").setCreativeTab(CreativeTabs.MATERIALS));
	Scarlet = register(new ItemBase("Scarlet").setCreativeTab(CreativeTabs.MATERIALS));
	SteelIngot = register(new ItemBase("SteelIngot").setCreativeTab(CreativeTabs.MATERIALS));	
	 };

	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
		 
}
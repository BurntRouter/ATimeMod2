package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ATimeFood extends ItemFood implements ItemModelProvider{
	
	protected String name;

	public ATimeFood(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		 this.name = name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(ATimeMod.creativeTab);
	}
	
	 public void registerItemModel(Item item) {
	 ATimeMod.proxy.registerItemRenderer(this, 0, name);
	 }
	 
	 @Override
	 public ATimeFood setCreativeTab(CreativeTabs tab) {
	 super.setCreativeTab(tab);
	 return this;
	 }

}

package com.router.atimemod2.items;

import com.router.atimemod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

	protected String name;

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		setCreativeTab(ATimeMod.creativeTab);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		ATimeMod.proxy.registerItemRenderer(this, 0, name);
	}

}

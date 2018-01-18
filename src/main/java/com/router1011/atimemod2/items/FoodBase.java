package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyFood;

import net.minecraft.creativetab.CreativeTabs;

public class FoodBase extends EasyFood {

	protected String name;

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		setCreativeTab(ATimeMod.creativeTab);
	}

	@Override
	public FoodBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

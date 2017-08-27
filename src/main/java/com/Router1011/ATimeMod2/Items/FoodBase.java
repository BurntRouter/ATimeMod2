package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazymodder.easy.items.EasyFood;

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

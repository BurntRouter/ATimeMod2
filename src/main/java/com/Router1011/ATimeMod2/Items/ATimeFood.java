package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazymodder.easy.items.EasyFood;

public class ATimeFood extends EasyFood {

	protected String name;

	public ATimeFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		setCreativeTab(ATimeMod.creativeTab);
	}

	@Override
	public ATimeFood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

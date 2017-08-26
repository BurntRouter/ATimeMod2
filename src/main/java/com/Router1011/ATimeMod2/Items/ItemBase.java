package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazymodder.easy.items.EasyItem;

public class ItemBase extends EasyItem {

	public ItemBase(String name) {
		super(name);
		setCreativeTab(ATimeMod.creativeTab);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
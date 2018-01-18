package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyItem;

import net.minecraft.creativetab.CreativeTabs;

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
package com.router.atimemod2.items;

import com.router.atimemod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ATimeMod.creativeTab);
	}
	
	public void registerItemModel() {
		ATimeMod.proxy.registerItemRenderer(this, 0, name);
	}
}
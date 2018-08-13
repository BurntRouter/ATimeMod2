package com.router.atimemod2.items;

import net.minecraft.item.Item.ToolMaterial;

import com.router.atimemod2.ATimeMod;

import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe{

	protected String name;

	public HoeBase(String name, ToolMaterial material) {
		super(material);
		this.name = name;
		setCreativeTab(ATimeMod.creativeTab);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		ATimeMod.proxy.registerItemRenderer(this, 0, name);
	}

}
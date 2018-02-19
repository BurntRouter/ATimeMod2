package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe{

	protected String name;

	public HoeBase(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(ATimeMod.creativeTab);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		ATimeMod.proxy.registerItemRenderer(this, 0, name);
	}

}

package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe{

	public HoeBase(String toolName, ToolMaterial material) {
		super(material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

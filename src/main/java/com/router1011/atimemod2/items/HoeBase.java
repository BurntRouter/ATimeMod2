package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import zdoctor.lazymodder.easy.items.EasyItemHoe;

public class HoeBase extends EasyItemHoe{

	public HoeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

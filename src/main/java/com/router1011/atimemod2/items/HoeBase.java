package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import zdoctor.lazymodder.easy.items.EasyTools.EasyHoe;

public class HoeBase extends EasyHoe{

	public HoeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

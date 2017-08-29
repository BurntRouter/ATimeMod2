package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import zdoctor.lazymodder.easy.items.EasyTools.EasyAxe;;

public class AxeBase extends EasyAxe {

	public AxeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

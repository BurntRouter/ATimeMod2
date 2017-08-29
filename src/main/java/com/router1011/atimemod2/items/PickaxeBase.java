package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazymodder.easy.items.EasyTools.EasyPickaxe;

public class PickaxeBase extends EasyPickaxe {

	public PickaxeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}


}

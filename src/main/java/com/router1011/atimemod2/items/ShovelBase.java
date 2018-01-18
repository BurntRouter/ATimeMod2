package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyItemSpade;

import net.minecraft.item.Item.ToolMaterial;

public class ShovelBase extends EasyItemSpade{

	public ShovelBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

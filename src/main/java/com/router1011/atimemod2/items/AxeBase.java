package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyItemAxe;

import net.minecraft.item.Item.ToolMaterial;

public class AxeBase extends EasyItemAxe {

	public AxeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}
	
}

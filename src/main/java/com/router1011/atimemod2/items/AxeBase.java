package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class AxeBase extends ItemAxe{

	public AxeBase(String toolName, ToolMaterial material) {
		super(material);
		setCreativeTab(ATimeMod.creativeTab);
	}
	
}

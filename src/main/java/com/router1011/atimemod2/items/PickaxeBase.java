package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyItemPickaxe;

import net.minecraft.item.Item.ToolMaterial;

public class PickaxeBase extends EasyItemPickaxe {

	public PickaxeBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}


}

package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBase extends ItemPickaxe{

	public PickaxeBase(String toolName, ToolMaterial material) {
		super(material);
		setCreativeTab(ATimeMod.creativeTab);
	}


}

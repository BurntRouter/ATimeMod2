package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.item.Item.ToolMaterial;
import zdoctor.lazymodder.easy.items.EasyItemSpade;;

public class ShovelBase extends EasyItemSpade{

	public ShovelBase(String toolName, ToolMaterial material) {
		super(toolName, material);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

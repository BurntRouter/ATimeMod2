package com.Router1011.ATimeMod2.Blocks;

import com.Router1011.ATimeMod2.ATimeMod;
import com.Router1011.ATimeMod2.Items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import zdoctor.lazymodder.easy.blocks.EasyBlock;

public class BlockBase extends EasyBlock {

	public BlockBase(String name, Material materialIn) {
		super(name, materialIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}
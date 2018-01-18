package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;

import net.minecraft.block.material.Material;

public class BlockBase extends EasyBlock {

	public BlockBase(String name, Material materialIn) {
		super(name, materialIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}
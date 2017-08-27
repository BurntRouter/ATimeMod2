package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.block.material.Material;
import zdoctor.lazymodder.easy.blocks.EasyBlock;

public class BlockBase extends EasyBlock {

	public BlockBase(String name, Material materialIn) {
		super(name, materialIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}
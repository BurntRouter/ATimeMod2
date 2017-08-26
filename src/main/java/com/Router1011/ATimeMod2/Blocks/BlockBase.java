package com.Router1011.ATimeMod2.Blocks;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.block.material.Material;
import zdoctor.lazymodder.easy.blocks.EasyBlock;

public class BlockBase extends EasyBlock {

	public BlockBase(String name, Material materialIn) {
		super(name, materialIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}
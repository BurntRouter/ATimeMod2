package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

	public BlockBase(String name, Material materialIn) {
		super(materialIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}
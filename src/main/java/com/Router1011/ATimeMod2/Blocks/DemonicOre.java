package com.Router1011.ATimeMod2.Blocks;

import net.minecraft.block.material.Material;

public class DemonicOre extends BlockBase {

	public DemonicOre(String blockName, Material material) {
		super(blockName, material);
		this.setHarvestLevel("pickaxe", 3);
	}

}

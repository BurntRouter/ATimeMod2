package com.router1011.atimemod2.blocks;

import net.minecraft.block.material.Material;

public class DemonicOre extends BlockBase {

	public DemonicOre(String blockName, Material material) {
		super(material, blockName);
		this.setHarvestLevel("pickaxe", 3);
	}

}

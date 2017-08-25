package com.Router1011.ATimeMod2.Blocks;

import net.minecraft.block.material.Material;

public class DemonicOre extends BlockBase {

	public DemonicOre(Material material, String blockName) {
		super(material, blockName);
		this.setHarvestLevel("pickaxe", 3);
	}

}

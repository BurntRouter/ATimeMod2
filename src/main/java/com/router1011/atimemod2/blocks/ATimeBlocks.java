package com.router1011.atimemod2.blocks;

import net.minecraft.block.material.Material;

public class ATimeBlocks {

	public static BlockBase CrystalBlock, CrystalOre, DemonicOre, SteelOre;

	public static void initBlocks() {
		CrystalBlock = new BlockBase("CrystalBlock", Material.GLASS);
		CrystalOre = new CrystalOre("CrystalOre", Material.GLASS);
		DemonicOre = new DemonicOre("DemonicOre", Material.GLASS);
		SteelOre = new SteelOre("SteelOre", Material.GLASS);

	}
}
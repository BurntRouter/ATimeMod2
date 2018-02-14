package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ATimeBlocks {

	public static Block CrystalBlock;
	public static EasyBlock CrystalOre, DemonicOre, SteelOre;

	public static void initBlocks() {
		CrystalBlock = new Block(Material.GLASS).setCreativeTab(ATimeMod.creativeTab).setUnlocalizedName("CrystalBlock").setRegistryName("CrystalBlock");
		CrystalOre = new EasyBlock("CrystalOre", Material.GLASS);
		DemonicOre = new EasyBlock("DemonicOre", Material.GLASS);
		SteelOre = new EasyBlock("SteelOre", Material.GLASS);

	}
}
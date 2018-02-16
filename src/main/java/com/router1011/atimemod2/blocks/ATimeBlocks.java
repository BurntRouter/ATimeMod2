package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ATimeBlocks {

	public static Block CrystalBlock, CrystalOre, DemonicOre, SteelOre;
		
		public static void initBlock() {
		CrystalBlock = new Block(Material.GLASS).setUnlocalizedName(ATimeMod.MODID + ".CrystalBlock").setRegistryName("CrystalBlock");
		CrystalOre = new Block(Material.ROCK).setUnlocalizedName(ATimeMod.MODID + ".CrystalOre").setRegistryName("CrystalOre");
		DemonicOre = new Block(Material.ROCK).setUnlocalizedName(ATimeMod.MODID + ".DemonicOre").setRegistryName("DemonicOre");
		SteelOre = new Block(Material.IRON).setUnlocalizedName(ATimeMod.MODID + ".SteelOre").setRegistryName("SteelOre");
	}
}
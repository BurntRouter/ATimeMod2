package com.router1011.atimemod2.blocks;

import java.util.Random;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.items.ATimeItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CrystalOre extends Block {

	public CrystalOre() {
		super(Material.ROCK);
		setHarvestLevel("pickaxe", 3);
		setUnlocalizedName(ATimeMod.MODID + ".CrystalOre");
		setRegistryName("CrystalOre");
		
	}

	public Item getItemDropped(int metadata, Random random, int fortune) {
		return ATimeItems.CrystalGem;
	}

}

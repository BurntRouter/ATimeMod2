package com.router1011.atimemod2.blocks;

import java.util.Random;

import com.router1011.atimemod2.items.ATimeItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CrystalOre extends BlockBase {

	public CrystalOre(String blockName, Material material) {
		super(blockName, material);
		this.setHarvestLevel("pickaxe", 3);
	}

	public Item getItemDropped(int metadata, Random random, int fortune) {
		return ATimeItems.CrystalGem;
	}

}

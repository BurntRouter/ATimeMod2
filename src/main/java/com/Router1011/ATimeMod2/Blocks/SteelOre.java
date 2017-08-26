package com.Router1011.ATimeMod2.Blocks;

import java.util.Random;

import com.Router1011.ATimeMod2.Items.ATimeItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class SteelOre extends BlockBase {

	public SteelOre(String blockName, Material material) {
		super(blockName, material);
		this.setHarvestLevel("pickaxe", 3);
	}

}

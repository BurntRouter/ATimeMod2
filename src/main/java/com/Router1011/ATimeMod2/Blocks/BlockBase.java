package com.Router1011.ATimeMod2.Blocks;

import com.Router1011.ATimeMod2.ATimeMod;
import com.Router1011.ATimeMod2.Items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockBase extends Block {

	protected String name;
	
	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ATimeMod.creativeTab);
	}
	
	public void registerItemModel(Item itemBlock) {
		ATimeMod.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
}
package com.router.atimemod2.blocks;

import com.router.atimemod2.ATimeMod;

import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CandyLog extends BlockLog
{
	protected String name;
	
    public CandyLog(Material material, String name, Float hardness, String toolClass, int level, SoundType soundType, Float resistance) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ATimeMod.creativeTab);
		setHardness(hardness);
		setHarvestLevel(toolClass, level);
		setResistance(resistance);
		setSoundType(soundType);
	}
    
	public void registerItemModel(Item itemBlock) {
		ATimeMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}

}
package com.router1011.atimemod2.lazymodder.blocks;

import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.item.EasyItemBlock;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EasyBlock extends Block implements IEasyRegister {
	protected ItemBlock itemBlock;
	protected int subCount;

	public EasyBlock(String name) {
		this(name, Material.ROCK);
	}

	public EasyBlock(String name, int subBlockCount) {
		this(name, subBlockCount, Material.ROCK);
	}

	public EasyBlock(String name, Material materialIn) {
		this(name, 1, materialIn);
	}

	/**
	 * if the block has multiple states, set the default state in constructor
	 * 
	 * @param name
	 * @param subBlockCount
	 * @param materialIn
	 */
	public EasyBlock(String name, int subCount, Material materialIn) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.subCount = subCount;
		setCreativeTab(CreativeTabs.DECORATIONS);

		EasyRegistry.register(this);
		itemBlock = createItem();
	}

	public ItemBlock createItem() {
		return new EasyItemBlock(this, getSubCount());
	}
	
	public ItemBlock getItemBlock() {
		return itemBlock;
	}
	
	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public String getRegistryNameForMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public int getSubCount() {
		return subCount;
	}

	@Override
	public void getSubBlocks(CreativeTabs tabIn, NonNullList<ItemStack> items) {
		if (tabIn == CreativeTabs.SEARCH || tabIn == getCreativeTabToDisplayOn())
			for (int i = 0; i < this.getSubCount(); i++)
				items.add(new ItemStack(this, 1, i));
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(state));
	}

}

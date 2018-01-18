package com.router1011.atimemod2.lazymodder.item;

import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;

/**
 * 
 * @author Z_Doctor
 */
public class EasyItemSword extends ItemSword implements IEasyRegister {
	protected int subCount;
	
	public EasyItemSword(String name, Item.ToolMaterial material) {
		this(name, 1, material);
	}

	public EasyItemSword(String name, int subCount, Item.ToolMaterial material) {
		super(material);
		this.subCount = subCount;
		setUnlocalizedName(name);
		setRegistryName(name);
		EasyRegistry.register(this);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
		if (isInCreativeTab(tab))
			for (int i = 0; i < this.getSubCount(); i++)
				subItems.add(new ItemStack(this, 1, i));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return "item." + this.getNameFromMeta(itemStack.getMetadata()).toLowerCase();
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

}

package com.router1011.atimemod2.lazymodder.item;

import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class EasyItemBlock extends ItemBlock implements IEasyRegister {
	private int subCount;

	public EasyItemBlock(Block block) {
		this(block, 1);
	}

	public EasyItemBlock(Block block, int subCount) {
		super(block);
		this.setUnlocalizedName(block.getRegistryName().toString());
		this.setRegistryName(block.getRegistryName());
		this.subCount = subCount;
		this.setHasSubtypes(subCount > 1);

		this.addPropertyOverride(new ResourceLocation("meta"), ItemProperties.META_GETTER);

		EasyRegistry.register(this);
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public int getSubCount() {
		return subCount;
	}

	@Override
	public String getRegistryNameForMeta(int meta) {
		return getNameFromMeta(meta);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
		if (isInCreativeTab(tab))
			for (int i = 0; i < this.getSubCount(); i++)
				subItems.add(new ItemStack(this, 1, i));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		if(this.block instanceof EasyBlock)
			return "tile." + ((EasyBlock)this.block).getNameFromMeta(itemStack.getMetadata()).toLowerCase();
		return "tile." + this.getNameFromMeta(itemStack.getMetadata()).toLowerCase();
	}
}

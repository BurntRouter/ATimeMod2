package com.router1011.atimemod2.lazymodder.item;

import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class EasyItemBlockTileEntity extends ItemBlock implements IEasyRegister {
	private int subCount;

	public EasyItemBlockTileEntity(Block block) {
		this(block, 1);
	}

	public EasyItemBlockTileEntity(Block block, int subCount) {
		super(block);
		this.setUnlocalizedName(block.getRegistryName().toString());
		this.setRegistryName(block.getRegistryName());
		this.subCount = subCount;
		this.setHasSubtypes(subCount > 1);

		EasyRegistry.register(this);
	}
	
	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public int getSubCount() {
		return 1;
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getRegistryNameForMeta(int meta) {
		return getNameFromMeta(meta);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		if(this.block instanceof EasyBlock)
			return "tile." + ((EasyBlock)this.block).getNameFromMeta(itemStack.getMetadata());
		return "tile." + this.getNameFromMeta(itemStack.getMetadata());
	}
}
package com.router1011.atimemod2.lazymodder.blocks.properties;

import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MetaProperty extends PropertyInteger implements IEasyProperty<Integer> {
	protected MetaProperty(String name, int min, int max) {
		super(name, min, max);
	}
	
	public static MetaProperty create(String name, int min, int max) {
		return new MetaProperty(name, min, max);
	}
	
	@Override
	public Comparable getValue(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		return stack.getMetadata();
	}
	@Override
	public Comparable getValueFromMeta(int meta) {
		return meta;
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(this);
	}
}

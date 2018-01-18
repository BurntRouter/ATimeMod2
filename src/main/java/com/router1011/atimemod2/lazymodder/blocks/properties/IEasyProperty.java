package com.router1011.atimemod2.lazymodder.blocks.properties;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IEasyProperty<T extends Comparable<T>> extends IProperty<T>{

	Comparable<T> getValue(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack);

	Comparable<T> getValueFromMeta(int meta);

	int getMetaFromState(IBlockState state);

}

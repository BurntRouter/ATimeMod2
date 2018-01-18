package com.router1011.atimemod2.lazymodder.item.properties;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MetaGetter implements IItemPropertyGetter {
	@Override
	public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
		return stack.getMetadata();
	}
}

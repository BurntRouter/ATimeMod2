package com.router.atimemod2.items;

import com.router.atimemod2.ATimeMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEnchiridion {

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.openGui(ATimeMod.instance, 0, world, 0, 0, 0);
		return itemstack;
	}
}
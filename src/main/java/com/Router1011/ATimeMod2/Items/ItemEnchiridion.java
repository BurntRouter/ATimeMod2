package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEnchiridion extends ItemBase {
	public ItemEnchiridion(String name) {
		super(name);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.openGui(ATimeMod.instance, 0, world, 0, 0, 0);
		return itemstack;
	}
}
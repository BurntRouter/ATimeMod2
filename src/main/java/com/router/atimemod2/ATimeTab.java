package com.router.atimemod2;

import com.router.atimemod2.items.ATimeItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ATimeTab extends CreativeTabs {

	public ATimeTab() {
		super(ATimeMod.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ATimeItems.scarlet);
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}

}
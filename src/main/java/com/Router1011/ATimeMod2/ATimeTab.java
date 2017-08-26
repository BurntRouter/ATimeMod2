package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Items.ATimeItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ATimeTab extends CreativeTabs {

	public ATimeTab() {
		super(ATimeMod.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
//		return new ItemStack(ATimeItems.Scarlet);
		return new ItemStack(Items.DIAMOND);
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}

}
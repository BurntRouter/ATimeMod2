package com.Router1011.ATimeMod2;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.Router1011.ATimeMod2.Items.ATimeItems;

public class ATimeTab extends CreativeTabs{

	public ATimeTab() {
		super(ATimeMod.modId);
	}

	@Override
	public Item getTabIconItem() {
		return ATimeItems.Scarlet;
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return true;
	 }

}
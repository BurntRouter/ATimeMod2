package com.burntrouter.atimemod2;

import com.burntrouter.atimemod2.init.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGroupATimeMod2 extends ItemGroup {

	public ItemGroupATimeMod2() {
		super(ATimeMod2.MODID);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.CRYSTAL_GEM.get());
	}

}

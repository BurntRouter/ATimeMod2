package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyItemSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;

public class SwordBase extends EasyItemSword {

	protected String name;

	public SwordBase(String name, ToolMaterial material) {
		super(name, material);
		setCreativeTab(ATimeMod.creativeTab);

	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if (this.name == "FourDSword") {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20 * 30));
		}
		return true;
	}

	@Override
	public SwordBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

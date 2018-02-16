package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;

public class SwordBase extends ItemSword {

	protected String name;

	public SwordBase(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(ATimeMod.creativeTab);

	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if (this.name == "FourDSword") {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20 * 30));
		}
		return true;
	}
}

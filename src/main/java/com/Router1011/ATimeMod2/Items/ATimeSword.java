package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import zdoctor.lazymodder.easy.items.EasyTools.EasyWeapon;

public class ATimeSword extends EasyWeapon {

	protected String name;

	public ATimeSword(String name, ToolMaterial material) {
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
	public ATimeSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

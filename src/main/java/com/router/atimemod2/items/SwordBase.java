package com.router.atimemod2.items;

import com.router.atimemod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;

public class SwordBase extends ItemSword {

	protected String name;

	public SwordBase(String name, ToolMaterial material) {
		super(material);
		this.name = name;
		setCreativeTab(ATimeMod.creativeTab);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
	}
	
	public void registerItemModel() {
		ATimeMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if (this.name == "FourDSword") {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20 * 30));
		}
		return true;
	}
}

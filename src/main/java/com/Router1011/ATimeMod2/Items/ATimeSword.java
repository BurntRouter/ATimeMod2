package com.Router1011.ATimeMod2.Items;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ATimeSword extends ItemSword implements ItemModelProvider {
	
	protected String name;

	public ATimeSword(String name, ToolMaterial material) {
		super(material);
		 this.name = name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(ATimeMod.creativeTab);
		
	}
	
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
    	if (this.name == "FourDSword")
    		{
    		target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20 * 30));
    		}
    	return true;
    }

	 public void registerItemModel(Item item) {
	 ATimeMod.proxy.registerItemRenderer(this, 0, name);
	 }
	 
	 @Override
	 public ATimeSword setCreativeTab(CreativeTabs tab) {
	 super.setCreativeTab(tab);
	 return this;
	 }

}

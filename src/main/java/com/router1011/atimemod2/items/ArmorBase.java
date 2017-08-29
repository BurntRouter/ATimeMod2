package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import zdoctor.lazymodder.easy.items.EasyArmor;

public class ArmorBase extends EasyArmor {

	public ArmorBase(String armorName, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn) {
		super(armorName, materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

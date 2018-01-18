package com.router1011.atimemod2.items;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.lazymodder.item.EasyArmor;

import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorBase extends EasyArmor {

	public ArmorBase(String armorName, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn) {
		super(armorName, materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(ATimeMod.creativeTab);
	}

}

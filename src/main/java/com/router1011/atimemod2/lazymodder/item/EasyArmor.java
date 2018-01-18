package com.router1011.atimemod2.lazymodder.item;

import java.util.HashMap;
import java.util.Map;

import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class EasyArmor extends ItemArmor implements IEasyRegister {
	public EasyArmor(String armorName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(armorName);
		this.setRegistryName(armorName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		EasyRegistry.register(this);
	}
	
	public static Map<EntityEquipmentSlot, ItemArmor> createArmorSet(String armorName, ArmorMaterial materialIn) {
		Map<EntityEquipmentSlot, ItemArmor> armorSet = new HashMap<>();
		armorSet.put(EntityEquipmentSlot.HEAD, new EasyArmor(armorName + "_helmet", materialIn, 1, EntityEquipmentSlot.HEAD));
		armorSet.put(EntityEquipmentSlot.CHEST, new EasyArmor(armorName + "_chestplate", materialIn, 1, EntityEquipmentSlot.CHEST));
		armorSet.put(EntityEquipmentSlot.LEGS, new EasyArmor(armorName + "_leggings", materialIn, 2, EntityEquipmentSlot.LEGS));
		armorSet.put(EntityEquipmentSlot.FEET, new EasyArmor(armorName + "_boots", materialIn, 1, EntityEquipmentSlot.FEET));
		for (ItemArmor item : armorSet.values()) {
			EasyRegistry.register(item);
		}
		return armorSet;
	}

	public static ArmorMaterial addMaterial(String materialName, String textureName, int durability,
			int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness) {

		return EnumHelper.addArmorMaterial(materialName, textureName, durability, reductionAmounts, enchantability,
				soundOnEquip, toughness);
	}

	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public int getSubCount() {
		return 1;
	}
	
	@Override
	public String getRegistryNameForMeta(int meta) {
		return getNameFromMeta(meta);
	}
}

package com.router1011.atimemod2.lazymodder.item;

import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

/**
 * @author Z_Doctor
 * 
 *         Base class for items to be put into the game by the library. Extend
 *         this class for added control of the item.
 *
 */
public class EasyItem extends Item implements IEasyRegister {
	private int subCount;

	public EasyItem(String name) {
		this(name, 1);
	}

	public EasyItem(String name, int subCount) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		this.subCount = subCount;
		this.addPropertyOverride(new ResourceLocation("meta"), ItemProperties.META_GETTER);

		EasyRegistry.register(this);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
		if (isInCreativeTab(tab))
			for (int i = 0; i < this.getSubCount(); i++)
				subItems.add(new ItemStack(this, 1, i));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return "item." + this.getNameFromMeta(itemStack.getMetadata()).toLowerCase();
	}

	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public String getRegistryNameForMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public int getSubCount() {
		return subCount;
	}

	public static class ContainerItem extends EasyItem {
		public static final int UNBREAKING = Short.MIN_VALUE;

		public ContainerItem(String name, Item container, int uses) {
			super(name);
			if (uses == UNBREAKING)
				this.setContainerItem(container);
			else
				this.setMaxDamage(uses);
		}

		@Override
		public boolean hasContainerItem(ItemStack stack) {
			return true;
		}

	}

}

package com.router.atimemod2.client;

import com.router.atimemod2.init.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ATTab extends ItemGroup {

    public ATTab() {
        super("atimemod");
        this.setBackgroundImageName("items.png");
    }

    @Override
    public ItemStack createIcon() {
        ItemStack stack = new ItemStack(ModItems.bacon);
        stack.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
        return stack;
    }
}

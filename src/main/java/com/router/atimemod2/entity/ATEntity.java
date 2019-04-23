package com.router.atimemod2.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ATEntity extends EntityCreature {

    private final InventoryBasic myInventory = new InventoryBasic(new TextComponentString("Items"), 8);

    public ATEntity(EntityType<?> type, World worldIn) {
        super(type, worldIn);
    }

    protected void registerData() {
        super.registerData();
    }

    public void writeAdditional(NBTTagCompound compound) {
        super.writeAdditional(compound);

        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.myInventory.getSizeInventory(); ++i) {
            ItemStack itemstack = this.myInventory.getStackInSlot(i);
            if (!itemstack.isEmpty()) {
                nbttaglist.add((INBTBase) itemstack.write(new NBTTagCompound()));
            }
        }
        compound.setTag("Inventory", nbttaglist);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readAdditional(NBTTagCompound compound) {
        super.readAdditional(compound);

        NBTTagList nbttaglist = compound.getList("Inventory", 10);

        for (int i = 0; i < nbttaglist.size(); ++i) {
            ItemStack itemstack = ItemStack.read(nbttaglist.getCompound(i));
            if (!itemstack.isEmpty()) {
                this.myInventory.addItem(itemstack);
            }
        }

    }

    public InventoryBasic getInventory() {
        return this.myInventory;
    }
}

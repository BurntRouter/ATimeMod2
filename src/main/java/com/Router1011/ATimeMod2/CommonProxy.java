package com.Router1011.ATimeMod2;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
 public void registerItemRenderer(Item item, int meta, String id) {
 
 }
 
 public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
 {
	 TileEntity tileEntity = world.getTileEntity(null);
	 return tileEntity;
 }
}
package com.Router1011.ATimeMod2.Blocks;

import com.Router1011.ATimeMod2.ATimeMod;
import com.Router1011.ATimeMod2.Items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

public class ATimeBlocks {
	
	public static BlockBase CrystalBlock, CrystalOre, SteelOre, DemonicOre;
	
	 public static void initBlocks() 
	 {
		 CrystalBlock = register(new BlockBase(Material.GLASS, "CrystalBlock"));
		 CrystalOre = register(new CrystalOre(Material.GLASS, "CrystalOre"));
		 SteelOre = register(new SteelOre(Material.GLASS, "SteelOre"));
		 DemonicOre = register(new DemonicOre(Material.GLASS, "DemonicOre"));
	 }
	 
	 private static <T extends Block> T register (T block, ItemBlock itemBlock) {
		 
		 GameRegistry.register(block);
		 if(itemBlock != null) {
		 GameRegistry.register(itemBlock);
		 }
		 
		 if(block instanceof ItemModelProvider) {
		 ((ItemModelProvider)block).registerItemModel(itemBlock);
		 }
		 
		 return block;
		 }
		 
		 private static <T extends Block> T register(T block) {
		 ItemBlock itemBlock = new ItemBlock(block);
		 itemBlock.setRegistryName(block.getRegistryName());
		 return register(block, itemBlock);
		 }
}
package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Blocks.ATimeBlocks;
import com.Router1011.ATimeMod2.Entity.ATimeLivingEntities;
import com.Router1011.ATimeMod2.GUI.ATimeGuis;
import com.Router1011.ATimeMod2.Items.ATimeItems;
import com.Router1011.ATimeMod2.Recipes.ATimeRecipes;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ATimeBlocks.initBlocks();
		ATimeItems.initItems();
		ATimeGuis.initGuis();
		OreDictionary.registerOre("ingotSteel", ATimeItems.SteelIngot);

		ATimeLivingEntities.initLivingEntites();
		ATimeRecipes.preInit();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

}
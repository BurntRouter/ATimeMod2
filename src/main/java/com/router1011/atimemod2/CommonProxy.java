package com.router1011.atimemod2;

import com.router1011.atimemod2.blocks.ATimeBlocks;
import com.router1011.atimemod2.entity.ATimeLivingEntities;
import com.router1011.atimemod2.gui.ATimeGuis;
import com.router1011.atimemod2.items.ATimeItems;
import com.router1011.atimemod2.recipes.ATimeRecipes;

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
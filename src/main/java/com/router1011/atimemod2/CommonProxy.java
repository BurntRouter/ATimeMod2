package com.router1011.atimemod2;

import com.router1011.atimemod2.blocks.ATimeBlocks;
import com.router1011.atimemod2.entity.ATimeLivingEntities;
import com.router1011.atimemod2.gui.ATimeGuis;
import com.router1011.atimemod2.items.ATimeItems;
import com.router1011.atimemod2.recipes.ATimeRecipes;
import com.router1011.atimemod2.world.WorldOreGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
//		ATimeGuis.initGuis();
//		ATimeLivingEntities.initLivingEntites();
		ATimeBlocks.initBlocks();
		ATimeItems.initItems();
		ATimeRegistry.regBlocks();
		ATimeRegistry.regItems();
	}

	public void init(FMLInitializationEvent e) {

//		GameRegistry.registerWorldGenerator(new WorldOreGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent e) {
		OreDictionary.registerOre("ingotSteel", ATimeItems.SteelIngot);

	}

}
package com.router1011.atimemod2;

import com.router1011.atimemod2.blocks.ATimeBlocks;
import com.router1011.atimemod2.blocks.CrystalOre;
import com.router1011.atimemod2.entity.ATimeLivingEntities;
import com.router1011.atimemod2.gui.ATimeGuis;
import com.router1011.atimemod2.items.ATimeItems;
import com.router1011.atimemod2.world.WorldOreGen;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	@SubscribeEvent
	public void preInit(FMLPreInitializationEvent e) {
		ATimeLivingEntities.initEntity();
	}

	@SubscribeEvent
	public static void regBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new CrystalOre());
	}

	public void init(FMLInitializationEvent e) {

//		GameRegistry.registerWorldGenerator(new WorldOreGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent e) {
	//	OreDictionary.registerOre("ingotSteel", ATimeItems.SteelIngot);

	}

}
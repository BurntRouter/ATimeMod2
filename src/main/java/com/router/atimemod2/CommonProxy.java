package com.router.atimemod2;

import com.router.atimemod2.blocks.ATimeBlocks;
import com.router.atimemod2.blocks.CrystalOre;
import com.router.atimemod2.entity.ATimeLivingEntities;
import com.router.atimemod2.gui.ATimeGuis;
import com.router.atimemod2.items.ATimeItems;
import com.router.atimemod2.world.WorldOreGen;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.item.Item;
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
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new WorldOreGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent e) {
		OreDictionary.registerOre("ingotSteel", ATimeItems.steel_ingot);
	}

}
package com.router1011.atimemod2;

import org.apache.logging.log4j.Logger;

import com.router1011.atimemod2.blocks.ATimeBlocks;
import com.router1011.atimemod2.items.ATimeItems;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ATimeMod.MODID, name = ATimeMod.NAME, acceptedMinecraftVersions = "[1.12.2]", useMetadata = true, version = ATimeMod.VERSION)
public class ATimeMod {

	@SidedProxy(clientSide = "com.router1011.atimemod2.ClientProxy", serverSide = "com.router1011.atimemod2.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "atimemod2";
	public static final String NAME = "AdventureTime Mod 2";
	public static final String VERSION = "2.0.8";

	public static final ATimeTab creativeTab = new ATimeTab();
	public static final Item.ToolMaterial FOURD = EnumHelper.addToolMaterial("FOURD", 0, 333, 10.0F, 16.0F, 0);
	public static final Item.ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 3, 2626, 12.0F, 5.0F, 25);
	public static final Item.ToolMaterial SCARLET = EnumHelper.addToolMaterial("SCARLET", 0, 3000, 10.0F, 10.0F, 25);
	public static final Item.ToolMaterial GRASS = EnumHelper.addToolMaterial("GRASS", 0, 58, 10.0F, 4.0F, 0);

	@Mod.Instance(MODID)
	public static ATimeMod instance;
	
	public static Logger logger;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ATimeItems.registerItems(event.getRegistry());
			ATimeBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItemModels(ModelRegistryEvent event) {
			ATimeItems.registerItemModels();
			ATimeBlocks.registerModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ATimeBlocks.register(event.getRegistry());
		}
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		Registry.initOreGen();
		System.out.println("[ATimeMod2] We're back boys.");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Registry.initRecipes();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		System.out.println("[ATimeMod2] Loaded and registered everything hopefully!");
	}
}
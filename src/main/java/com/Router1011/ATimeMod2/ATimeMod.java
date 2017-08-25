package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Blocks.ATimeBlocks;
import com.Router1011.ATimeMod2.Entity.ModEntities;
import com.Router1011.ATimeMod2.Items.ATimeItems;
import com.Router1011.ATimeMod2.Registry.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = ATimeMod.modId, name = ATimeMod.name, version = ATimeMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class ATimeMod {

	@SidedProxy(serverSide = "com.Router1011.ATimeMod2.CommonProxy", clientSide = "com.Router1011.ATimeMod2.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "atimemod2";
	public static final String name = "AdventureTime Mod 2";
	public static final String version = "1.0";
	
	public static final ATimeTab creativeTab = new ATimeTab();
	public static final Item.ToolMaterial SCARLET = EnumHelper.addToolMaterial("SCARLET", 3, 3000, 10.0F, 16, 25);
	public static final Item.ToolMaterial FourD = EnumHelper.addToolMaterial("FourD", 0, 1000, 10.0F, 12, 0);
	
	@Mod.Instance(modId)
	public static ATimeMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("[ATimeMod2] We're back boys.");
		ATimeBlocks.initBlocks();
		ATimeItems.initItems();
		ClientProxy.registerEntityRenderers();
		Registry.mainRegistry();
		OreDictionary.registerOre("ingotSteel", ATimeItems.SteelIngot);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModEntities.registerEntites();
		System.out.println("[ATimeMod2] Loaded and registered everything successfully!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
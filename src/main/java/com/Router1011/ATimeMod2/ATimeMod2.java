package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Items.ATimeItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ATimeMod2.modId, name = ATimeMod2.name, version = ATimeMod2.version, acceptedMinecraftVersions = "[1.10.2]")
public class ATimeMod2 {

	@SidedProxy(serverSide = "com.Router1011.ATimeMod2.CommonProxy", clientSide = "com.Router1011.ATimeMod2.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "atimemod2";
	public static final String name = "AdventureTime Mod 2";
	public static final String version = "1.0";
	
	@Mod.Instance(modId)
	public static ATimeMod2 instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("We're back boys.");
		ATimeItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
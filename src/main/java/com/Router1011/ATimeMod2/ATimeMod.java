package com.Router1011.ATimeMod2;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ATimeMod.MODID, name = ATimeMod.NAME, acceptedMinecraftVersions = "[1.12.1]", dependencies = "required-after:lazymodder@[0.6,)")
public class ATimeMod {

	@SidedProxy(clientSide = "com.Router1011.ATimeMod2.ClientProxy", serverSide = "com.Router1011.ATimeMod2.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "atimemod2";
	public static final String NAME = "AdventureTime Mod 2";
	public static final String VERSION = "1.1";

	public static final ATimeTab creativeTab = new ATimeTab();
	public static final Item.ToolMaterial SCARLET = EnumHelper.addToolMaterial("SCARLET", 3, 3000, 10.0F, 16, 25);
	public static final Item.ToolMaterial FourD = EnumHelper.addToolMaterial("FourD", 0, 1000, 10.0F, 12, 0);

	@Instance(MODID)
	public static ATimeMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		System.out.println("[ATimeMod2] We're back boys.");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		System.out.println("[ATimeMod2] Loaded and registered everything successfully!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
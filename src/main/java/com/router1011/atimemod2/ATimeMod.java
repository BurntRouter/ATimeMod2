package com.router1011.atimemod2;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ATimeMod.MODID, name = ATimeMod.NAME, acceptedMinecraftVersions = "[1.12.1]", dependencies = "required-after:lazymodder@[0.74,)")
public class ATimeMod {

	@SidedProxy(clientSide = "com.router1011.atimemod2.ClientProxy", serverSide = "com.router1011.atimemod2.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "atimemod2";
	public static final String NAME = "AdventureTime Mod 2";

	public static final ATimeTab creativeTab = new ATimeTab();
	public static final Item.ToolMaterial FOURD = EnumHelper.addToolMaterial("FOURD", 0, 333, 10.0F, 16.0F, 0);
	public static final Item.ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 3, 2626, 12.0F, 5.0F, 25);
	public static final Item.ToolMaterial SCARLET = EnumHelper.addToolMaterial("SCARLET", 0, 3000, 10.0F, 10.0F, 25);
	public static final Item.ToolMaterial GRASS = EnumHelper.addToolMaterial("GRASS", 0, 58, 10.0F, 4.0F, 0);

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
package com.burntrouter.atimemod2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.burntrouter.atimemod2.init.ModBlocks;
import com.burntrouter.atimemod2.init.ModItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod("atimemod2")
@Mod.EventBusSubscriber(modid = ATimeMod2.MODID, bus = Bus.MOD)
public class ATimeMod2 {
	
	public static final ItemGroupATimeMod2 ITEM_GROUP = new ItemGroupATimeMod2();

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "atimemod2";
	
	public ATimeMod2() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModItems.initialize(modEventBus);
		ModBlocks.initialize(modEventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}

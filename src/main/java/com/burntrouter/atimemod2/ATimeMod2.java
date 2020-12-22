package com.burntrouter.atimemod2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.burntrouter.atimemod2.init.ModBlocks;
import com.burntrouter.atimemod2.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("atimemod2")
@Mod.EventBusSubscriber(modid = ATimeMod2.MODID, bus = Bus.MOD)
public class ATimeMod2 {
	
	public static final ItemGroupATimeMod2 ITEM_GROUP = new ItemGroupATimeMod2();

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "atimemod2";
	
    public ATimeMod2()
    {
    	FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }
	

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents
    {
	    @SubscribeEvent
	    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event)
	    {
	        ModBlocks.register(event.getRegistry());
	    }

	    @SubscribeEvent
	    public static void onItemsRegistry(final RegistryEvent.Register<Item> event)
	    {
	        ModItems.register(event.getRegistry());
	    }
    }
}

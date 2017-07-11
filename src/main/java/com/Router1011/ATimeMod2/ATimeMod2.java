package com.Router1011.ATimeMod2;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ATimeMod2.MODID, version = ATimeMod2.VERSION)
public class ATimeMod2
{
    public static final String MODID = "atimemod2";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("We're back boys");
    }
}

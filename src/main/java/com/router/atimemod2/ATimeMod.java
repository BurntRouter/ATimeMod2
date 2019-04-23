package com.router.atimemod2;

import com.router.atimemod2.client.render.living.RenderBMO;
import com.router.atimemod2.entity.EntityBMO;
import com.router.atimemod2.init.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.router.atimemod2.client.ATTab;

@Mod(ATimeMod.MODID)
public class ATimeMod {

    public static final ItemGroup ATTab = new ATTab();
    public static final String MODID = "atimemod2";
    public static ATimeMod instance;

    public ATimeMod() {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {

    }

    public void clientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityBMO.class, RenderBMO::new);
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerEntites(final RegistryEvent.Register<EntityType<?>> event) {
            event.getRegistry().registerAll(ModEntities.BMO);
        }
    }

}

package com.router1011.atimemod2;

import com.router1011.atimemod2.entity.ATimeLivingEntities;
import com.router1011.atimemod2.entity.EntityFinn;
import com.router1011.atimemod2.render.living.RenderFinn;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	 public void registerItemRenderer(Item item, int meta, String id) {
	 ModelLoader.setCustomModelResourceLocation(item, meta, new
	 ModelResourceLocation(ATimeMod.MODID + ":" + id, "inventory"));
	 }
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ATimeLivingEntities.registerRenders();	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

	public static void registerEntityRenderers() {
		 RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
		 (RenderManager manager) -> new RenderFinn(manager));
		 RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
		 RenderFinn::new);
	}
}
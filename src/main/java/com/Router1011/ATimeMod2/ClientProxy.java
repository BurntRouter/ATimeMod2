package com.Router1011.ATimeMod2;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	// public void registerItemRenderer(Item item, int meta, String id) {
	// ModelLoader.setCustomModelResourceLocation(item, meta, new
	// ModelResourceLocation(ATimeMod.modId + ":" + id, "inventory"));
	// }
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		// this.registerEntityRenderers();
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

	public static void registerEntityRenderers() {
		// RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
		// (RenderManager manager) -> new RenderFinn(manager));
		// RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
		// RenderFinn::new);
	}
}
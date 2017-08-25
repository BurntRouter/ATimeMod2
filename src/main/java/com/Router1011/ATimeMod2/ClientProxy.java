package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Entity.EntityFinn;
import com.Router1011.ATimeMod2.Models.ModelFinn;
import com.Router1011.ATimeMod2.Render.RenderFinn;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {

   public void registerItemRenderer(Item item, int meta, String id) {
   ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ATimeMod.modId + ":" + id, "inventory"));
   }

   public void preInit(FMLPreInitializationEvent event)
   {
	   this.registerEntityRenderers();
   }
   

   public static void registerEntityRenderers()
   {
//       RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class, (RenderManager manager) -> new RenderFinn(manager));
//       RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class, RenderFinn::new);
   }
}
package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityIceKing;
import com.router.atimemod2.models.ModelIceKing;
import com.router.atimemod2.render.living.RenderFP.Factory;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderIceKing extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/iceking.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderIceKing(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelIceKing(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityIceKing par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityIceKing> {

	        @Override
	        public Render<? super EntityIceKing> createRenderFor(RenderManager manager) {
	            return new RenderIceKing(manager);
	        }
	 }
}
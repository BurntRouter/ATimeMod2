package com.router1011.atimemod2.render.living;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.entity.EntityLSP;
import com.router1011.atimemod2.models.ModelLSP;
import com.router1011.atimemod2.render.living.RenderFP.Factory;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLSP extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/lsp.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderLSP(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelLSP(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityLSP par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityLSP> {

	        @Override
	        public Render<? super EntityLSP> createRenderFor(RenderManager manager) {
	            return new RenderLSP(manager);
	        }
	 }
}
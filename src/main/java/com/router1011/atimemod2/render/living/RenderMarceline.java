package com.router1011.atimemod2.render.living;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.entity.EntityMarceline;
import com.router1011.atimemod2.models.ModelMarceline;
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
public class RenderMarceline extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/marceline.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderMarceline(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelMarceline(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityMarceline par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityMarceline> {

	        @Override
	        public Render<? super EntityMarceline> createRenderFor(RenderManager manager) {
	            return new RenderMarceline(manager);
	        }
	 }
}
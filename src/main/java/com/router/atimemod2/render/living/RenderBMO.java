package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityBMO;
import com.router.atimemod2.models.ModelBMO;
import com.router.atimemod2.render.living.RenderBMO.Factory;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBMO extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/bmo.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderBMO(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelBMO(), 0.25F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityBMO par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityBMO> {

	        @Override
	        public Render<? super EntityBMO> createRenderFor(RenderManager manager) {
	            return new RenderBMO(manager);
	        }
	 }
}
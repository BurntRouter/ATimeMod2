package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityBilly;
import com.router.atimemod2.models.ModelBilly;
import com.router.atimemod2.render.living.RenderBilly.Factory;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBilly extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/billy.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderBilly(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelBilly(), 0.5F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityBilly par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityBilly> {

	        @Override
	        public Render<? super EntityBilly> createRenderFor(RenderManager manager) {
	            return new RenderBilly(manager);
	        }
	 }
}
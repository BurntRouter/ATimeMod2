package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityGunter;
import com.router.atimemod2.models.ModelGunter;
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
public class RenderGunter extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/gunter.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderGunter(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelGunter(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityGunter par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityGunter> {

	        @Override
	        public Render<? super EntityGunter> createRenderFor(RenderManager manager) {
	            return new RenderGunter(manager);
	        }
	 }
}
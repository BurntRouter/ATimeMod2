package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityPeppermintZombie;
import com.router.atimemod2.models.ModelPeppermintZombie;
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
public class RenderPeppermintZombie extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/peppermintzombie.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderPeppermintZombie(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelPeppermintZombie(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityPeppermintZombie par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityPeppermintZombie> {

	        @Override
	        public Render<? super EntityPeppermintZombie> createRenderFor(RenderManager manager) {
	            return new RenderPeppermintZombie(manager);
	        }
	 }
}
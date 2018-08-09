package com.router.atimemod2.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityFinn;
import com.router.atimemod2.models.ModelFinn;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFinn extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation("atimemod2:textures/entity/finn.png");

	  public static final Factory FACTORY = new Factory();

	    public RenderFinn(RenderManager rendermanagerIn) {
	        super(rendermanagerIn, new ModelFinn(), 0.35F);
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityFinn par1EntityLiving) {
		return 180.0F;
	}
	 public static class Factory implements IRenderFactory<EntityFinn> {

	        @Override
	        public Render<? super EntityFinn> createRenderFor(RenderManager manager) {
	            return new RenderFinn(manager);
	        }
	 }
}

package com.router1011.atimemod2.render.living;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.entity.EntityFinn;
import com.router1011.atimemod2.models.ModelBilly;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.router1011.atimemod2.lazymodder.helpers.TextureLocation.EntityTextureLocation;

@SideOnly(Side.CLIENT)
public class RenderBilly extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ATimeMod.MODID, "Billy");

	public RenderBilly(RenderManager manager) {
		super(manager, new ModelBilly(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityFinn par1EntityLiving) {
		return 180.0F;
	}
}

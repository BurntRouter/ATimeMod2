package com.router1011.atimemod2.render.living;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.entity.EntityFinn;
import com.router1011.atimemod2.models.ModelLich;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;

@SideOnly(Side.CLIENT)
public class RenderLich extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ATimeMod.MODID, "Lich");

	public RenderLich(RenderManager manager) {
		super(manager, new ModelLich(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityFinn par1EntityLiving) {
		return 180.0F;
	}
}

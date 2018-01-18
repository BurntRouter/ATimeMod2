package com.router1011.atimemod2.render;

import com.router1011.atimemod2.ATimeMod;
import com.router1011.atimemod2.entity.EntityFinn;
import com.router1011.atimemod2.models.ModelGauntlet;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGauntlet extends RenderLiving {
	public static final ResourceLocation TEXTURE = new ResourceLocation(ATimeMod.MODID, "Gauntlet");

	public RenderGauntlet(RenderManager manager) {
		super(manager, new ModelGauntlet(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityFinn par1EntityLiving) {
		return 180.0F;
	}
}

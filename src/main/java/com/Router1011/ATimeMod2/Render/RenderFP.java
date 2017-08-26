package com.Router1011.ATimeMod2.Render;

import com.Router1011.ATimeMod2.ATimeMod;
import com.Router1011.ATimeMod2.Entity.EntityFinn;
import com.Router1011.ATimeMod2.Models.ModelFP;
import com.Router1011.ATimeMod2.Models.ModelFinn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;

@SideOnly(Side.CLIENT)
public class RenderFP extends RenderLiving {
	public static final ResourceLocation TEXTURE = new EntityTextureLocation(ATimeMod.MODID, "FP");

	public RenderFP(RenderManager manager) {
		super(manager, new ModelFP(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return TEXTURE;

	}

	protected float getDeathMaxRotation(EntityFinn par1EntityLiving) {
		return 180.0F;
	}
}

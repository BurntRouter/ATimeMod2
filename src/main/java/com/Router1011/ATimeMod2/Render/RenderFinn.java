package com.Router1011.ATimeMod2.Render;

import org.lwjgl.opengl.GL11;

import com.Router1011.ATimeMod2.ATimeMod;
import com.Router1011.ATimeMod2.Entity.EntityFinn;
import com.Router1011.ATimeMod2.Models.ModelFinn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderFinn extends RenderLiving 
{
    protected ResourceLocation finnTexture;

    public RenderFinn(RenderManager manager) {
        super(manager, new ModelFinn(), 1.0F); 
	}

	protected void setEntityTexture()
    {
        finnTexture = new ResourceLocation(ATimeMod.modId+":textures/entity/Finn.png");
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return finnTexture;

    }
    

    protected float getDeathMaxRotation(EntityFinn par1EntityLiving)
    {
        return 180.0F;
    }
}

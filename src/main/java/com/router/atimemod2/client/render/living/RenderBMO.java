package com.router.atimemod2.client.render.living;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityBMO;
import com.router.atimemod2.model.ModelBMO;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class RenderBMO extends RenderLiving<EntityBMO> {

    public RenderBMO(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelBMO(), 0.25F);

    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBMO entity) {
        return new ResourceLocation(ATimeMod.MODID, "textures/entity/bmo.png");

    }

    protected float getMaxDeathRotation(EntityBMO entityLiving) {
        return 180.0F;

    }

    @Override
    protected void applyRotations(EntityBMO entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
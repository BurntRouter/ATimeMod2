package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelIceKing extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer RightShoulder;
    ModelRenderer LeftShoulder;
    ModelRenderer DressBottom;
    ModelRenderer Nose1;
    ModelRenderer Nose2;
    ModelRenderer Hair;
    ModelRenderer Beard1;
    ModelRenderer Beard2;
    ModelRenderer Beard3;
    ModelRenderer Beard4;
    ModelRenderer Beard5;
    ModelRenderer Beard6;
    ModelRenderer Beard7;
    ModelRenderer Crown1;
    ModelRenderer Crown2;
    ModelRenderer Crown3;
    ModelRenderer Crown4;

    public ModelIceKing()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(128, 128);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 106);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 10, 12, 10);
        this.body.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.body.setTextureSize(128, 128);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 46, 2);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 10, 2);
        this.rightarm.setRotationPoint(-6.0F, 4.0F, 1.0F);
        this.rightarm.setTextureSize(128, 128);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 36, 2);
        this.leftarm.addBox(0.0F, -2.0F, -2.0F, 2, 10, 2);
        this.leftarm.setRotationPoint(7.0F, 4.0F, 1.0F);
        this.leftarm.setTextureSize(128, 128);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 35);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 1.0F);
        this.rightleg.setTextureSize(128, 128);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 18);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
        this.leftleg.setRotationPoint(4.0F, 12.0F, 1.0F);
        this.leftleg.setTextureSize(128, 128);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.RightShoulder = new ModelRenderer(this, 39, 26);
        this.RightShoulder.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.RightShoulder.setRotationPoint(-9.0F, 2.0F, -1.0F);
        this.RightShoulder.setTextureSize(128, 128);
        this.RightShoulder.mirror = true;
        this.setRotation(this.RightShoulder, 0.0F, 0.0F, -0.5576792F);
        this.LeftShoulder = new ModelRenderer(this, 39, 21);
        this.LeftShoulder.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.LeftShoulder.setRotationPoint(4.0F, -1.0F, -1.0F);
        this.LeftShoulder.setTextureSize(128, 128);
        this.LeftShoulder.mirror = true;
        this.setRotation(this.LeftShoulder, 0.0F, 0.0F, 0.5634477F);
        this.DressBottom = new ModelRenderer(this, 0, 78);
        this.DressBottom.addBox(0.0F, 0.0F, 0.0F, 14, 12, 14);
        this.DressBottom.setRotationPoint(-7.0F, 12.0F, -7.0F);
        this.DressBottom.setTextureSize(128, 128);
        this.DressBottom.mirror = true;
        this.setRotation(this.DressBottom, 0.0F, 0.0F, 0.0F);
        this.Nose1 = new ModelRenderer(this, 0, 53);
        this.Nose1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4);
        this.Nose1.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Nose1.setTextureSize(128, 128);
        this.Nose1.mirror = true;
        this.setRotation(this.Nose1, 1.115358F, 0.0F, 0.0F);
        this.Nose2 = new ModelRenderer(this, 0, 59);
        this.Nose2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
        this.Nose2.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Nose2.setTextureSize(128, 128);
        this.Nose2.mirror = true;
        this.setRotation(this.Nose2, -0.2602503F, 0.0F, 0.0F);
        this.Hair = new ModelRenderer(this, 20, 64);
        this.Hair.addBox(0.0F, 0.0F, 0.0F, 12, 2, 10);
        this.Hair.setRotationPoint(-6.0F, -9.0F, -5.0F);
        this.Hair.setTextureSize(128, 128);
        this.Hair.mirror = true;
        this.setRotation(this.Hair, 0.0F, 0.0F, 0.0F);
        this.Beard1 = new ModelRenderer(this, 102, 14);
        this.Beard1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 10);
        this.Beard1.setRotationPoint(4.0F, -8.0F, -5.0F);
        this.Beard1.setTextureSize(128, 128);
        this.Beard1.mirror = true;
        this.setRotation(this.Beard1, 0.0F, 0.0F, 0.0F);
        this.Beard2 = new ModelRenderer(this, 92, 44);
        this.Beard2.addBox(0.0F, 0.0F, 0.0F, 12, 14, 3);
        this.Beard2.setRotationPoint(-6.0F, -9.0F, 3.0F);
        this.Beard2.setTextureSize(128, 128);
        this.Beard2.mirror = true;
        this.setRotation(this.Beard2, 0.0F, 0.0F, 0.0F);
        this.Beard3 = new ModelRenderer(this, 76, 14);
        this.Beard3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 10);
        this.Beard3.setRotationPoint(-6.0F, -8.0F, -5.0F);
        this.Beard3.setTextureSize(128, 128);
        this.Beard3.mirror = true;
        this.setRotation(this.Beard3, 0.0F, 0.0F, 0.0F);
        this.Beard4 = new ModelRenderer(this, 84, 33);
        this.Beard4.addBox(0.0F, 0.0F, 0.0F, 6, 7, 2);
        this.Beard4.setRotationPoint(-6.0F, -1.0F, -6.0F);
        this.Beard4.setTextureSize(128, 128);
        this.Beard4.mirror = true;
        this.setRotation(this.Beard4, 0.0F, 0.0F, 0.0F);
        this.Beard5 = new ModelRenderer(this, 65, 33);
        this.Beard5.addBox(0.0F, 0.0F, 0.0F, 6, 7, 2);
        this.Beard5.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Beard5.setTextureSize(128, 128);
        this.Beard5.mirror = true;
        this.setRotation(this.Beard5, 0.0F, 0.0F, 0.0F);
        this.Beard6 = new ModelRenderer(this, 65, 17);
        this.Beard6.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1);
        this.Beard6.setRotationPoint(0.0F, 6.0F, -6.0F);
        this.Beard6.setTextureSize(128, 128);
        this.Beard6.mirror = true;
        this.setRotation(this.Beard6, 0.0F, 0.0F, 0.0F);
        this.Beard7 = new ModelRenderer(this, 65, 22);
        this.Beard7.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1);
        this.Beard7.setRotationPoint(-4.0F, 6.0F, -6.0F);
        this.Beard7.setTextureSize(128, 128);
        this.Beard7.mirror = true;
        this.setRotation(this.Beard7, 0.0F, 0.0F, 0.0F);
        this.Crown1 = new ModelRenderer(this, 82, 0);
        this.Crown1.addBox(0.0F, 0.0F, 0.0F, 12, 2, 11);
        this.Crown1.setRotationPoint(-6.0F, -11.0F, -5.0F);
        this.Crown1.setTextureSize(128, 128);
        this.Crown1.mirror = true;
        this.setRotation(this.Crown1, 0.0F, 0.0F, 0.0F);
        this.Crown2 = new ModelRenderer(this, 73, 0);
        this.Crown2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
        this.Crown2.setRotationPoint(3.0F, -15.0F, -5.0F);
        this.Crown2.setTextureSize(128, 128);
        this.Crown2.mirror = true;
        this.setRotation(this.Crown2, 0.0F, 0.0F, 0.0F);
        this.Crown3 = new ModelRenderer(this, 73, 6);
        this.Crown3.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
        this.Crown3.setRotationPoint(-5.0F, -15.0F, -5.0F);
        this.Crown3.setTextureSize(128, 128);
        this.Crown3.mirror = true;
        this.setRotation(this.Crown3, 0.0F, 0.0F, 0.0F);
        this.Crown4 = new ModelRenderer(this, 64, 0);
        this.Crown4.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1);
        this.Crown4.setRotationPoint(-1.0F, -17.0F, -5.0F);
        this.Crown4.setTextureSize(128, 128);
        this.Crown4.mirror = true;
        this.setRotation(this.Crown4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.RightShoulder.render(var7);
        this.LeftShoulder.render(var7);
        this.DressBottom.render(var7);
        this.Nose1.render(var7);
        this.Nose2.render(var7);
        this.Hair.render(var7);
        this.Beard1.render(var7);
        this.Beard2.render(var7);
        this.Beard3.render(var7);
        this.Beard4.render(var7);
        this.Beard5.render(var7);
        this.Beard6.render(var7);
        this.Beard7.render(var7);
        this.Crown1.render(var7);
        this.Crown2.render(var7);
        this.Crown3.render(var7);
        this.Crown4.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, (Entity)null);
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.0F * var2;
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.0F * var2;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
    }
}

package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMarceline extends ModelBase
{
    public ModelRenderer head;
    ModelRenderer body;
    public ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Neck;
    ModelRenderer Hair1;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer HairBack;
    ModelRenderer HairLeft;
    ModelRenderer HairMiddle1;
    ModelRenderer HairRight;
    ModelRenderer HairMiddleLeft1;
    ModelRenderer HairMiddleLeft2;
    ModelRenderer HairMiddel2;
    ModelRenderer HairMiddelRight1;
    ModelRenderer HairMiddleRight2;
    ModelRenderer ShoulderLeft;
    ModelRenderer ShoulderRight;

    public ModelMarceline()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 94, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 9, 8);
        this.head.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.head.setTextureSize(128, 64);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 98, 21);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 6, 12, 4);
        this.body.setRotationPoint(1.0F, -4.0F, 0.0F);
        this.body.setTextureSize(128, 64);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 89, 25);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 15, 2);
        this.rightarm.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.rightarm.setTextureSize(128, 64);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 119, 25);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 15, 2);
        this.leftarm.setRotationPoint(4.0F, 0.0F, 1.0F);
        this.leftarm.setTextureSize(128, 64);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 98, 38);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 2, 16, 2);
        this.rightleg.setRotationPoint(-1.0F, 8.0F, 1.0F);
        this.rightleg.setTextureSize(128, 64);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 109, 38);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 2, 16, 2);
        this.leftleg.setRotationPoint(3.0F, 8.0F, 1.0F);
        this.leftleg.setTextureSize(128, 64);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 102, 17);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.Neck.setRotationPoint(-1.0F, -6.0F, -1.0F);
        this.Neck.setTextureSize(128, 64);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
        this.Hair1 = new ModelRenderer(this, 62, 49);
        this.Hair1.addBox(0.0F, 0.0F, 0.0F, 7, 5, 10);
        this.Hair1.setRotationPoint(1.0F, -18.0F, -5.0F);
        this.Hair1.setTextureSize(128, 64);
        this.Hair1.mirror = true;
        this.setRotation(this.Hair1, 0.0F, 0.0F, 0.5576792F);
        this.Hair2 = new ModelRenderer(this, 31, 37);
        this.Hair2.addBox(0.0F, 0.0F, 0.0F, 5, 3, 10);
        this.Hair2.setRotationPoint(-5.0F, -15.0F, -5.0F);
        this.Hair2.setTextureSize(128, 64);
        this.Hair2.mirror = true;
        this.setRotation(this.Hair2, 0.0F, 0.0F, -0.3346075F);
        this.Hair3 = new ModelRenderer(this, 31, 51);
        this.Hair3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 10);
        this.Hair3.setRotationPoint(-7.0F, -13.0F, -5.0F);
        this.Hair3.setTextureSize(128, 64);
        this.Hair3.mirror = true;
        this.setRotation(this.Hair3, 0.0F, 0.0F, -0.2974289F);
        this.HairBack = new ModelRenderer(this, 0, 35);
        this.HairBack.addBox(0.0F, 0.0F, 0.0F, 14, 28, 1);
        this.HairBack.setRotationPoint(-7.0F, -13.0F, 4.0F);
        this.HairBack.setTextureSize(128, 64);
        this.HairBack.mirror = true;
        this.setRotation(this.HairBack, 0.0F, 0.0F, 0.0F);
        this.HairLeft = new ModelRenderer(this, 61, 0);
        this.HairLeft.addBox(0.0F, 0.0F, 0.0F, 4, 8, 10);
        this.HairLeft.setRotationPoint(4.0F, -13.0F, -5.0F);
        this.HairLeft.setTextureSize(128, 64);
        this.HairLeft.mirror = true;
        this.setRotation(this.HairLeft, 0.0F, 0.0F, -0.1487144F);
        this.HairMiddle1 = new ModelRenderer(this, 38, 0);
        this.HairMiddle1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7);
        this.HairMiddle1.setRotationPoint(4.0F, -6.0F, -2.0F);
        this.HairMiddle1.setTextureSize(128, 64);
        this.HairMiddle1.mirror = true;
        this.setRotation(this.HairMiddle1, 0.0F, 0.0F, 0.0F);
        this.HairRight = new ModelRenderer(this, 11, 0);
        this.HairRight.addBox(0.0F, 0.0F, 0.0F, 3, 7, 10);
        this.HairRight.setRotationPoint(-7.0F, -11.0F, -5.0F);
        this.HairRight.setTextureSize(128, 64);
        this.HairRight.mirror = true;
        this.setRotation(this.HairRight, 0.0F, 0.0F, 0.0F);
        this.HairMiddleLeft1 = new ModelRenderer(this, 46, 10);
        this.HairMiddleLeft1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 4);
        this.HairMiddleLeft1.setRotationPoint(4.0F, -4.0F, 1.0F);
        this.HairMiddleLeft1.setTextureSize(128, 64);
        this.HairMiddleLeft1.mirror = true;
        this.setRotation(this.HairMiddleLeft1, 0.0F, 0.0F, 0.0F);
        this.HairMiddleLeft2 = new ModelRenderer(this, 50, 23);
        this.HairMiddleLeft2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2);
        this.HairMiddleLeft2.setRotationPoint(4.0F, 4.0F, 2.0F);
        this.HairMiddleLeft2.setTextureSize(128, 64);
        this.HairMiddleLeft2.mirror = true;
        this.setRotation(this.HairMiddleLeft2, 0.0F, 0.0F, 0.0F);
        this.HairMiddel2 = new ModelRenderer(this, 22, 18);
        this.HairMiddel2.addBox(0.0F, 0.0F, 0.0F, 3, 4, 6);
        this.HairMiddel2.setRotationPoint(-7.0F, -6.0F, -2.0F);
        this.HairMiddel2.setTextureSize(128, 64);
        this.HairMiddel2.mirror = true;
        this.setRotation(this.HairMiddel2, 0.0F, 0.0F, 0.0F);
        this.HairMiddelRight1 = new ModelRenderer(this, 0, 18);
        this.HairMiddelRight1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
        this.HairMiddelRight1.setRotationPoint(-7.0F, -4.0F, 1.0F);
        this.HairMiddelRight1.setTextureSize(128, 64);
        this.HairMiddelRight1.mirror = true;
        this.setRotation(this.HairMiddelRight1, 0.0F, 0.0F, 0.0F);
        this.HairMiddleRight2 = new ModelRenderer(this, 0, 25);
        this.HairMiddleRight2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2);
        this.HairMiddleRight2.setRotationPoint(-7.0F, -1.0F, 2.0F);
        this.HairMiddleRight2.setTextureSize(128, 64);
        this.HairMiddleRight2.mirror = true;
        this.setRotation(this.HairMiddleRight2, 0.0F, 0.0F, 0.0F);
        this.ShoulderLeft = new ModelRenderer(this, 119, 19);
        this.ShoulderLeft.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
        this.ShoulderLeft.setRotationPoint(2.0F, -3.0F, -1.0F);
        this.ShoulderLeft.setTextureSize(128, 64);
        this.ShoulderLeft.mirror = true;
        this.setRotation(this.ShoulderLeft, 0.0F, 0.0F, -0.4833219F);
        this.ShoulderRight = new ModelRenderer(this, 89, 19);
        this.ShoulderRight.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
        this.ShoulderRight.setRotationPoint(-4.0F, -4.0F, -1.0F);
        this.ShoulderRight.setTextureSize(128, 64);
        this.ShoulderRight.mirror = true;
        this.setRotation(this.ShoulderRight, 0.0F, 0.0F, 0.3717807F);
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
        this.Neck.render(var7);
        this.Hair1.render(var7);
        this.Hair2.render(var7);
        this.Hair3.render(var7);
        this.HairBack.render(var7);
        this.HairLeft.render(var7);
        this.HairMiddle1.render(var7);
        this.HairRight.render(var7);
        this.HairMiddleLeft1.render(var7);
        this.HairMiddleLeft2.render(var7);
        this.HairMiddel2.render(var7);
        this.HairMiddelRight1.render(var7);
        this.HairMiddleRight2.render(var7);
        this.ShoulderLeft.render(var7);
        this.ShoulderRight.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.0F * var2;
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.0F * var2;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
    }
}

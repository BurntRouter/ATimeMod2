package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelLSP extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;

    public ModelLSP()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape1.setRotationPoint(3.0F, 2.0F, -1.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape2.setRotationPoint(-5.0F, 2.0F, 2.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 10, 16);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape3.setRotationPoint(-1.0F, -5.0F, 0.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 32, 0);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape4.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 0, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape5.setRotationPoint(-1.0F, 7.0F, 2.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 0, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape6.setRotationPoint(-1.0F, 6.0F, -3.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 0, 0);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape7.setRotationPoint(-4.0F, 5.0F, 0.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 0, 0);
        this.Shape8.addBox(0.0F, 9.0F, 0.0F, 7, 7, 7);
        this.Shape8.setRotationPoint(-3.0F, -3.0F, -2.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 0, 0);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape9.setRotationPoint(1.0F, 9.0F, -1.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 0, 0);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape10.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 0, 0);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape11.setRotationPoint(2.0F, 3.0F, 1.0F);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 0, 0);
        this.Shape12.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3);
        this.Shape12.setRotationPoint(-2.0F, 13.0F, 0.0F);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
        this.Shape13 = new ModelRenderer(this, 0, 0);
        this.Shape13.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4);
        this.Shape13.setRotationPoint(1.0F, 15.0F, 0.0F);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
        this.Shape14 = new ModelRenderer(this, 0, 0);
        this.Shape14.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3);
        this.Shape14.setRotationPoint(5.0F, 14.0F, 0.0F);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
        this.Shape15 = new ModelRenderer(this, 0, 0);
        this.Shape15.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Shape15.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.Shape15.setTextureSize(64, 32);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
        this.Shape16 = new ModelRenderer(this, 0, 0);
        this.Shape16.addBox(0.0F, 0.0F, 0.0F, 2, 12, 2);
        this.Shape16.setRotationPoint(-6.0F, 3.0F, 3.0F);
        this.Shape16.setTextureSize(64, 32);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, 0.0F, 0.0F, 0.1858931F);
        this.Shape17 = new ModelRenderer(this, 0, 0);
        this.Shape17.addBox(0.0F, 0.0F, 0.0F, 2, 11, 2);
        this.Shape17.setRotationPoint(9.0F, 4.0F, 3.0F);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 0.0F, 0.0F, -0.2602503F);
        this.Shape18 = new ModelRenderer(this, 0, 0);
        this.Shape18.addBox(0.0F, 0.0F, 0.0F, 1, 2, 4);
        this.Shape18.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.Shape18.setTextureSize(64, 32);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}

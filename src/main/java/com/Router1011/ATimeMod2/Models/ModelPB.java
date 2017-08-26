package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPB extends ModelBase {
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
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	public ModelRenderer Head;
	ModelRenderer Body;
	public ModelRenderer RightArm;
	ModelRenderer LeftArm;
	ModelRenderer Shape22;
	ModelRenderer Body2;
	ModelRenderer Shape23;
	ModelRenderer Shape24;

	public ModelPB() {
		textureWidth = 128;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this, 64, 16);
		Shape1.addBox(0F, 0F, 0F, 10, 33, 2);
		Shape1.setRotationPoint(-5F, -13F, 3F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 26, 16);
		Shape2.addBox(0F, 0F, 0F, 2, 30, 1);
		Shape2.setRotationPoint(3F, -13F, 2F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 20, 16);
		Shape3.addBox(0F, 0F, 0F, 2, 30, 1);
		Shape3.setRotationPoint(-5F, -13F, 2F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 52);
		Shape4.addBox(0F, 0F, 0F, 2, 8, 4);
		Shape4.setRotationPoint(3F, -13F, -2F);
		Shape4.setTextureSize(128, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 40);
		Shape5.addBox(0F, 0F, 0F, 2, 8, 4);
		Shape5.setRotationPoint(-5F, -13F, -2F);
		Shape5.setTextureSize(128, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 12, 44);
		Shape6.addBox(0F, 0F, 0F, 2, 18, 2);
		Shape6.setRotationPoint(-5F, -13F, -4F);
		Shape6.setTextureSize(128, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 20);
		Shape7.addBox(0F, 0F, 0F, 2, 18, 2);
		Shape7.setRotationPoint(3F, -13F, -4F);
		Shape7.setTextureSize(128, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 12, 25);
		Shape8.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape8.setRotationPoint(-5F, 3F, -5F);
		Shape8.setTextureSize(128, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 40, 45);
		Shape9.addBox(0F, 0F, 0F, 6, 1, 6);
		Shape9.setRotationPoint(-3F, -16F, -3F);
		Shape9.setTextureSize(128, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 42, 14);
		Shape10.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape10.setRotationPoint(-5F, -14F, 4F);
		Shape10.setTextureSize(128, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 20, 53);
		Shape11.addBox(0F, 0F, 0F, 8, 3, 8);
		Shape11.setRotationPoint(-4F, -15F, -4F);
		Shape11.setTextureSize(128, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 88, 16);
		Shape12.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape12.setRotationPoint(3F, 3F, -5F);
		Shape12.setTextureSize(128, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 18);
		Shape13.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape13.setRotationPoint(-3F, -15F, -5F);
		Shape13.setTextureSize(128, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 38, 4);
		Shape14.addBox(0F, 0F, 0F, 1, 1, 8);
		Shape14.setRotationPoint(4F, -14F, -4F);
		Shape14.setTextureSize(128, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 64, 7);
		Shape15.addBox(0F, 0F, 0F, 1, 1, 8);
		Shape15.setRotationPoint(-5F, -14F, -4F);
		Shape15.setTextureSize(128, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 20, 14);
		Shape16.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape16.setRotationPoint(-5F, -14F, -5F);
		Shape16.setTextureSize(128, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 16);
		Shape17.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape17.setRotationPoint(-1F, -17F, -5F);
		Shape17.setTextureSize(128, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 6, 16);
		Shape18.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape18.setRotationPoint(-2F, -16F, -5F);
		Shape18.setTextureSize(128, 64);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 0, 14);
		Shape19.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape19.setRotationPoint(-1F, -18F, -5F);
		Shape19.setTextureSize(128, 64);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 6, 14);
		Shape20.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape20.setRotationPoint(-1F, -19F, -5F);
		Shape20.setTextureSize(128, 64);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 0, 12);
		Shape21.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape21.setRotationPoint(-1F, -20F, -5F);
		Shape21.setTextureSize(128, 64);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 52, 52);
		Head.addBox(-4F, -8F, -4F, 6, 6, 6);
		Head.setRotationPoint(1F, -5F, 1F);
		Head.setTextureSize(128, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 82, 0);
		Body.addBox(-4F, 0F, -2F, 6, 8, 6);
		Body.setRotationPoint(1F, -5F, -1F);
		Body.setTextureSize(128, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		RightArm = new ModelRenderer(this, 30, 0);
		RightArm.addBox(-1F, -2F, -1F, 2, 12, 2);
		RightArm.setRotationPoint(-5F, 1F, 0F);
		RightArm.setTextureSize(128, 64);
		RightArm.mirror = true;
		setRotation(RightArm, 0F, 0F, 0F);
		LeftArm = new ModelRenderer(this, 56, 0);
		LeftArm.addBox(-1F, -2F, -1F, 2, 12, 2);
		LeftArm.setRotationPoint(5F, 1F, 0F);
		LeftArm.setTextureSize(128, 64);
		LeftArm.mirror = true;
		setRotation(LeftArm, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 0, 0);
		Shape22.addBox(0F, 0F, 0F, 4, 4, 4);
		Shape22.setRotationPoint(-7F, -5F, -2F);
		Shape22.setTextureSize(128, 64);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 32, 16);
		Body2.addBox(-4F, 0F, -2F, 8, 21, 8);
		Body2.setRotationPoint(0F, 3F, -2F);
		Body2.setTextureSize(128, 64);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		Shape23 = new ModelRenderer(this, 0, 0);
		Shape23.addBox(0F, 0F, 0F, 4, 4, 4);
		Shape23.setRotationPoint(3F, -5F, -2F);
		Shape23.setTextureSize(128, 64);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape24 = new ModelRenderer(this, 48, 0);
		Shape24.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape24.setRotationPoint(-1F, -7F, -1F);
		Shape24.setTextureSize(128, 64);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Head.render(f5);
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
		Shape22.render(f5);
		Body2.render(f5);
		Shape23.render(f5);
		Shape24.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) null);
	}

}

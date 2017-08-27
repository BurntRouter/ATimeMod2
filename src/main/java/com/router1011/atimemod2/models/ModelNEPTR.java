package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNEPTR extends ModelBase {
	ModelRenderer face;
	ModelRenderer wheel;
	ModelRenderer wheel2;
	ModelRenderer base;
	ModelRenderer metal_claw;
	ModelRenderer metal_claw2;
	ModelRenderer metal_claw3;
	ModelRenderer fake_face;
	ModelRenderer fake_face2;
	ModelRenderer fake_face3;
	ModelRenderer fake_face4;
	ModelRenderer fake_face5;
	ModelRenderer yellow_wire;
	ModelRenderer red_wire;
	ModelRenderer red_wire2;
	ModelRenderer yellow_wire2;
	ModelRenderer red_wire4;

	public ModelNEPTR() {
		textureWidth = 64;
		textureHeight = 64;

		face = new ModelRenderer(this, 1, 45);
		face.addBox(0F, 0F, 0F, 11, 7, 9);
		face.setRotationPoint(-6F, 14F, -6F);
		face.setTextureSize(64, 64);
		face.mirror = true;
		setRotation(face, 0F, 0F, 0F);
		wheel = new ModelRenderer(this, 32, 13);
		wheel.addBox(0F, 0F, 0F, 2, 3, 11);
		wheel.setRotationPoint(5F, 21F, -7F);
		wheel.setTextureSize(64, 64);
		wheel.mirror = true;
		setRotation(wheel, 0F, 0F, 0F);
		wheel2 = new ModelRenderer(this, 0, 13);
		wheel2.addBox(0F, 0F, 0F, 2, 3, 11);
		wheel2.setRotationPoint(-8F, 21F, -7F);
		wheel2.setTextureSize(64, 64);
		wheel2.mirror = true;
		setRotation(wheel2, 0F, 0F, 0F);
		base = new ModelRenderer(this, 19, 32);
		base.addBox(0F, 0F, 0F, 11, 2, 8);
		base.setRotationPoint(-6F, 21F, -5F);
		base.setTextureSize(64, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		metal_claw = new ModelRenderer(this, 48, 0);
		metal_claw.addBox(0F, 0F, 0F, 1, 7, 1);
		metal_claw.setRotationPoint(5F, 12F, -2F);
		metal_claw.setTextureSize(64, 64);
		metal_claw.mirror = true;
		setRotation(metal_claw, 0F, 0F, 0F);
		metal_claw2 = new ModelRenderer(this, 60, 0);
		metal_claw2.addBox(0F, 0F, 0F, 1, 3, 1);
		metal_claw2.setRotationPoint(5F, 10F, -3F);
		metal_claw2.setTextureSize(64, 64);
		metal_claw2.mirror = true;
		setRotation(metal_claw2, 0F, 0F, 0F);
		metal_claw3 = new ModelRenderer(this, 60, 0);
		metal_claw3.addBox(0F, 0F, 0F, 1, 3, 1);
		metal_claw3.setRotationPoint(5F, 10F, -1F);
		metal_claw3.setTextureSize(64, 64);
		metal_claw3.mirror = true;
		setRotation(metal_claw3, 0F, 0F, 0F);
		fake_face = new ModelRenderer(this, 0, 36);
		fake_face.addBox(0F, 0F, 0F, 4, 5, 0);
		fake_face.setRotationPoint(-3F, 9F, -4F);
		fake_face.setTextureSize(64, 64);
		fake_face.mirror = true;
		setRotation(fake_face, 0F, 0F, 0F);
		fake_face2 = new ModelRenderer(this, 57, 59);
		fake_face2.addBox(0F, 0F, 0F, 4, 5, 0);
		fake_face2.setRotationPoint(-3F, 9F, 0F);
		fake_face2.setTextureSize(64, 64);
		fake_face2.mirror = true;
		setRotation(fake_face2, 0F, 0F, 0F);
		fake_face3 = new ModelRenderer(this, 56, 55);
		fake_face3.addBox(0F, 0F, 0F, 0, 5, 4);
		fake_face3.setRotationPoint(-3F, 9F, -4F);
		fake_face3.setTextureSize(64, 64);
		fake_face3.mirror = true;
		setRotation(fake_face3, 0F, 0F, 0F);
		fake_face4 = new ModelRenderer(this, 57, 55);
		fake_face4.addBox(0F, 0F, 0F, 0, 5, 4);
		fake_face4.setRotationPoint(1F, 9F, -4F);
		fake_face4.setTextureSize(64, 64);
		fake_face4.mirror = true;
		setRotation(fake_face4, 0F, 0F, 0F);
		fake_face5 = new ModelRenderer(this, 0, 41);
		fake_face5.addBox(0F, 0F, 0F, 4, 4, 0);
		fake_face5.setRotationPoint(-3F, 5F, 0F);
		fake_face5.setTextureSize(64, 64);
		fake_face5.mirror = true;
		setRotation(fake_face5, 0F, 0F, 0F);
		yellow_wire = new ModelRenderer(this, 15, 1);
		yellow_wire.addBox(0F, 0F, 0F, 1, 3, 1);
		yellow_wire.setRotationPoint(-1F, 10F, -2F);
		yellow_wire.setTextureSize(64, 64);
		yellow_wire.mirror = true;
		setRotation(yellow_wire, 0F, 0F, 0F);
		red_wire = new ModelRenderer(this, 20, 1);
		red_wire.addBox(0F, 0F, 0F, 1, 3, 1);
		red_wire.setRotationPoint(-2F, 10F, -2F);
		red_wire.setTextureSize(64, 64);
		red_wire.mirror = true;
		setRotation(red_wire, 0F, 0F, 0F);
		red_wire2 = new ModelRenderer(this, 20, 1);
		red_wire2.addBox(0F, 0F, 0F, 1, 3, 1);
		red_wire2.setRotationPoint(-1F, 10F, -3F);
		red_wire2.setTextureSize(64, 64);
		red_wire2.mirror = true;
		setRotation(red_wire2, 0F, 0F, 0F);
		yellow_wire2 = new ModelRenderer(this, 15, 1);
		yellow_wire2.addBox(0F, 0F, 0F, 1, 2, 1);
		yellow_wire2.setRotationPoint(-2F, 8F, -3F);
		yellow_wire2.setTextureSize(64, 64);
		yellow_wire2.mirror = true;
		setRotation(yellow_wire2, 0F, 0F, 0F);
		red_wire4 = new ModelRenderer(this, 20, 1);
		red_wire4.addBox(0F, 0F, 0F, 1, 2, 1);
		red_wire4.setRotationPoint(-1F, 8F, -3F);
		red_wire4.setTextureSize(64, 64);
		red_wire4.mirror = true;
		setRotation(red_wire4, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		face.render(f5);
		wheel.render(f5);
		wheel2.render(f5);
		base.render(f5);
		metal_claw.render(f5);
		metal_claw2.render(f5);
		metal_claw3.render(f5);
		fake_face.render(f5);
		fake_face2.render(f5);
		fake_face3.render(f5);
		fake_face4.render(f5);
		fake_face5.render(f5);
		yellow_wire.render(f5);
		red_wire.render(f5);
		red_wire2.render(f5);
		yellow_wire2.render(f5);
		red_wire4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	/*
	 * public void setRotationAngles(float f, float f1, float f2, float f3,
	 * float f4, float f5) { super.setRotationAngles(f, f1, f2, f3, f4, f5); } /
	 */
}

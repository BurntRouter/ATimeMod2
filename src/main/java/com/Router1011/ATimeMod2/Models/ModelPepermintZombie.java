package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPepermintZombie extends ModelBase {
	ModelRenderer leg_1;
	ModelRenderer leg_2;
	ModelRenderer face;
	ModelRenderer body_1;
	ModelRenderer body_2;
	ModelRenderer body_3;
	ModelRenderer body_4;
	ModelRenderer hand_1;
	ModelRenderer hand_2;
	ModelRenderer face_peace_1;
	ModelRenderer face_peace_2;
	ModelRenderer face_peace_3;
	ModelRenderer face_peace_4;

	public ModelPepermintZombie() {
		this.textureWidth = 256;
		this.textureHeight = 64;
		this.leg_1 = new ModelRenderer(this, 5, 5);
		this.leg_1.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1);
		this.leg_1.setRotationPoint(3.0F, 15.0F, 0.0F);
		this.leg_1.setTextureSize(256, 64);
		this.leg_1.mirror = true;
		this.setRotation(this.leg_1, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.leg_2 = new ModelRenderer(this, 5, 5);
		this.leg_2.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1);
		this.leg_2.setRotationPoint(-3.0F, 15.0F, 0.0F);
		this.leg_2.setTextureSize(256, 64);
		this.leg_2.mirror = true;
		this.setRotation(this.leg_2, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.face = new ModelRenderer(this, 112, 0);
		this.face.addBox(0.0F, 0.0F, 0.0F, 4, 10, 10);
		this.face.setRotationPoint(-4.5F, 2.0F, 1.0F);
		this.face.setTextureSize(256, 64);
		this.face.mirror = true;
		this.setRotation(this.face, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.face.mirror = false;
		this.body_1 = new ModelRenderer(this, 76, 0);
		this.body_1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 10);
		this.body_1.setRotationPoint(-4.5F, 12.0F, 1.0F);
		this.body_1.setTextureSize(256, 64);
		this.body_1.mirror = true;
		this.setRotation(this.body_1, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.body_2 = new ModelRenderer(this, 50, 0);
		this.body_2.addBox(0.0F, 0.0F, 0.0F, 4, 10, 3);
		this.body_2.setRotationPoint(5.5F, 1.5F, 1.0F);
		this.body_2.setTextureSize(256, 64);
		this.body_2.mirror = true;
		this.setRotation(this.body_2, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.body_3 = new ModelRenderer(this, 76, 14);
		this.body_3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 10);
		this.body_3.setRotationPoint(-4.5F, -2.0F, 1.0F);
		this.body_3.setTextureSize(256, 64);
		this.body_3.mirror = true;
		this.setRotation(this.body_3, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.body_4 = new ModelRenderer(this, 50, 13);
		this.body_4.addBox(0.0F, 0.0F, 0.0F, 4, 10, 3);
		this.body_4.setRotationPoint(-7.5F, 1.5F, 1.0F);
		this.body_4.setTextureSize(256, 64);
		this.body_4.mirror = true;
		this.setRotation(this.body_4, 0.0F, ((float) Math.PI / 2F), 0.0F);
		this.hand_1 = new ModelRenderer(this, 22, 0);
		this.hand_1.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
		this.hand_1.setRotationPoint(-8.0F, 6.0F, -1.5F);
		this.hand_1.setTextureSize(256, 64);
		this.hand_1.mirror = true;
		this.setRotation(this.hand_1, 0.0F, 0.0F, 0.0F);
		this.hand_2 = new ModelRenderer(this, 22, 0);
		this.hand_2.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
		this.hand_2.setRotationPoint(8.0F, 6.0F, -1.5F);
		this.hand_2.setTextureSize(256, 64);
		this.hand_2.mirror = true;
		this.setRotation(this.hand_2, 0.0F, 0.0F, 0.0F);
		this.face_peace_1 = new ModelRenderer(this, 195, 0);
		this.face_peace_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
		this.face_peace_1.setRotationPoint(-6.5F, -0.5F, -3.0F);
		this.face_peace_1.setTextureSize(256, 64);
		this.face_peace_1.mirror = true;
		this.setRotation(this.face_peace_1, 0.0F, 0.0F, 0.0F);
		this.face_peace_2 = new ModelRenderer(this, 180, 0);
		this.face_peace_2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
		this.face_peace_2.setRotationPoint(5.5F, -0.5F, -3.0F);
		this.face_peace_2.setTextureSize(256, 64);
		this.face_peace_2.mirror = true;
		this.setRotation(this.face_peace_2, 0.0F, 0.0F, 0.0F);
		this.face_peace_3 = new ModelRenderer(this, 165, 0);
		this.face_peace_3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
		this.face_peace_3.setRotationPoint(5.5F, 11.5F, -3.0F);
		this.face_peace_3.setTextureSize(256, 64);
		this.face_peace_3.mirror = true;
		this.setRotation(this.face_peace_3, 0.0F, 0.0F, 0.0F);
		this.face_peace_4 = new ModelRenderer(this, 150, 0);
		this.face_peace_4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
		this.face_peace_4.setRotationPoint(-6.5F, 11.0F, -3.0F);
		this.face_peace_4.setTextureSize(256, 64);
		this.face_peace_4.mirror = true;
		this.setRotation(this.face_peace_4, 0.0F, 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.leg_1.render(f5);
		this.leg_2.render(f5);
		this.face.render(f5);
		this.body_1.render(f5);
		this.body_2.render(f5);
		this.body_3.render(f5);
		this.body_4.render(f5);
		this.hand_1.render(f5);
		this.hand_2.render(f5);
		this.face_peace_1.render(f5);
		this.face_peace_2.render(f5);
		this.face_peace_3.render(f5);
		this.face_peace_4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are
	 * used for animating the movement of arms and legs, where par1 represents
	 * the time(so that arms and legs swing back and forth) and par2 represents
	 * how "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, par7Entity);
		this.hand_1.rotateAngleZ = 0.2F;
		this.hand_2.rotateAngleZ = 0.2F;
		this.hand_1.rotateAngleX = -((float) Math.PI / 2F);
		this.hand_2.rotateAngleX = -((float) Math.PI / 2F);
		this.hand_1.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
		this.hand_2.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
		this.hand_1.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
		this.hand_2.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
		this.leg_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		this.leg_2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;
	}
}

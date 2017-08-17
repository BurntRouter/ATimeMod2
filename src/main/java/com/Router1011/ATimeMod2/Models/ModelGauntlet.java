package com.Router1011.ATimeMod2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGauntlet extends ModelBase {
	ModelRenderer arm1;
	ModelRenderer arm2;
	ModelRenderer arm3;
	ModelRenderer arm4;
	ModelRenderer arm5;
	ModelRenderer hand1;
	ModelRenderer finger1;
	ModelRenderer finger2;
	ModelRenderer finger3;
	ModelRenderer finger4;

	public ModelGauntlet() {
		textureWidth = 64;
		textureHeight = 32;

		arm1 = new ModelRenderer(this, 0, 17);
		arm1.addBox(0F, 0F, 0F, 4, 8, 4);
		arm1.setRotationPoint(0F, 0F, 0F);
		arm1.setTextureSize(64, 32);
		arm1.mirror = true;
		setRotation(arm1, 0F, 0F, 0F);
		arm2 = new ModelRenderer(this, 43, 0);
		arm2.addBox(0F, 0F, 0F, 2, 6, 1);
		arm2.setRotationPoint(1F, 0F, -1F);
		arm2.setTextureSize(64, 32);
		arm2.mirror = true;
		setRotation(arm2, 0F, 0F, 0F);
		arm3 = new ModelRenderer(this, 0, 0);
		arm3.addBox(0F, 0F, 0F, 1, 6, 2);
		arm3.setRotationPoint(-1F, 0F, 1F);
		arm3.setTextureSize(64, 32);
		arm3.mirror = true;
		setRotation(arm3, 0F, 0F, 0F);
		arm4 = new ModelRenderer(this, 0, 0);
		arm4.addBox(0F, 0F, 0F, 2, 6, 1);
		arm4.setRotationPoint(1F, 0F, 4F);
		arm4.setTextureSize(64, 32);
		arm4.mirror = true;
		setRotation(arm4, 0F, 0F, 0F);
		arm5 = new ModelRenderer(this, 0, 0);
		arm5.addBox(0F, 0F, 0F, 1, 6, 2);
		arm5.setRotationPoint(4F, 0F, 1F);
		arm5.setTextureSize(64, 32);
		arm5.mirror = true;
		setRotation(arm5, 0F, 0F, 0F);
		hand1 = new ModelRenderer(this, 0, 0);
		hand1.addBox(0F, 0F, 0F, 4, 4, 2);
		hand1.setRotationPoint(0F, 8F, 1F);
		hand1.setTextureSize(64, 32);
		hand1.mirror = true;
		setRotation(hand1, 0F, 0F, 0F);
		finger1 = new ModelRenderer(this, 18, 0);
		finger1.addBox(0F, 0F, 0F, 1, 2, 1);
		finger1.setRotationPoint(0F, 12F, 1F);
		finger1.setTextureSize(64, 32);
		finger1.mirror = true;
		setRotation(finger1, -0.1487144F, 0F, 0.0743572F);
		finger2 = new ModelRenderer(this, 18, 0);
		finger2.addBox(0F, 0F, 0F, 1, 2, 1);
		finger2.setRotationPoint(2F, 12F, 1F);
		finger2.setTextureSize(64, 32);
		finger2.mirror = true;
		setRotation(finger2, -0.2602503F, 0F, -0.1289891F);
		finger3 = new ModelRenderer(this, 18, 0);
		finger3.addBox(0F, 0F, 0F, 1, 2, 1);
		finger3.setRotationPoint(1F, 12F, 1F);
		finger3.setTextureSize(64, 32);
		finger3.mirror = true;
		setRotation(finger3, -0.2974289F, 0F, 0.0371786F);
		finger4 = new ModelRenderer(this, 18, 0);
		finger4.addBox(0F, 0F, 0F, 1, 2, 1);
		finger4.setRotationPoint(3F, 12F, 1F);
		finger4.setTextureSize(64, 32);
		finger4.mirror = true;
		setRotation(finger4, 0F, 0F, -0.2974289F);
	}

	public void renderModel(float f5) {
		arm1.render(f5);
		arm2.render(f5);
		arm3.render(f5);
		arm4.render(f5);
		arm5.render(f5);
		hand1.render(f5);
		finger1.render(f5);
		finger2.render(f5);
		finger3.render(f5);
		finger4.render(f5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		arm1.render(f5);
		arm2.render(f5);
		arm3.render(f5);
		arm4.render(f5);
		arm5.render(f5);
		hand1.render(f5);
		finger1.render(f5);
		finger2.render(f5);
		finger3.render(f5);
		finger4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity ent) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}

package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBMO extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public ModelBMO() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 6, 5, 5);
		this.head.setRotationPoint(1.0F, 19.0F, 2.0F);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 16, 16);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 6, 5, 5);
		this.body.setRotationPoint(1.0F, 16.0F, 0.0F);
		this.body.setTextureSize(64, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 23);
		this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 1, 4, 1);
		this.rightarm.setRotationPoint(-1.0F, 19.0F, 2.0F);
		this.rightarm.setTextureSize(64, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 16);
		this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 1, 4, 1);
		this.leftarm.setRotationPoint(4.0F, 19.0F, 2.0F);
		this.leftarm.setTextureSize(64, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
		this.rightleg = new ModelRenderer(this, 0, 24);
		this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 1, 3, 1);
		this.rightleg.setRotationPoint(0.0F, 21.0F, 2.0F);
		this.rightleg.setTextureSize(64, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
		this.leftleg = new ModelRenderer(this, 0, 16);
		this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 1, 3, 1);
		this.leftleg.setRotationPoint(3.0F, 21.0F, 2.0F);
		this.leftleg.setTextureSize(64, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
		super.render(var1, var2, var3, var4, var5, var6, var7);
		this.setRotationAngles(var2, var3, var4, var5, var6, var7);
		this.head.render(var7);
		this.body.render(var7);
		this.rightarm.render(var7);
		this.leftarm.render(var7);
		this.rightleg.render(var7);
		this.leftleg.render(var7);
	}

	private void setRotation(ModelRenderer var1, float var2, float var3, float var4) {
		var1.rotateAngleX = var2;
		var1.rotateAngleY = var3;
		var1.rotateAngleZ = var4;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {
		this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
		this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
	}
}

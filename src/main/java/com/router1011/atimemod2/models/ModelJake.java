package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelJake extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer Mouth1;
	ModelRenderer Mouth2;
	ModelRenderer Mouth3;
	ModelRenderer Ear1;
	ModelRenderer Ear2;

	public ModelJake() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
		this.head.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 32, 0);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 10, 8);
		this.body.setRotationPoint(0.0F, 7.0F, -2.0F);
		this.body.setTextureSize(64, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 23);
		this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 8, 2);
		this.rightarm.setRotationPoint(-3.0F, 9.0F, 1.0F);
		this.rightarm.setTextureSize(64, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 33);
		this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 8, 2);
		this.leftarm.setRotationPoint(5.0F, 9.0F, 1.0F);
		this.leftarm.setTextureSize(64, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
		this.rightleg = new ModelRenderer(this, 0, 32);
		this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 2, 7, 2);
		this.rightleg.setRotationPoint(-2.0F, 17.0F, 1.0F);
		this.rightleg.setTextureSize(64, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
		this.leftleg = new ModelRenderer(this, 0, 23);
		this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 2, 7, 2);
		this.leftleg.setRotationPoint(4.0F, 17.0F, 1.0F);
		this.leftleg.setTextureSize(64, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
		this.Mouth1 = new ModelRenderer(this, 20, 30);
		this.Mouth1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
		this.Mouth1.setRotationPoint(-1.0F, 3.0F, -5.0F);
		this.Mouth1.setTextureSize(64, 64);
		this.Mouth1.mirror = true;
		this.setRotation(this.Mouth1, 0.0F, 0.0F, 0.0F);
		this.Mouth2 = new ModelRenderer(this, 26, 32);
		this.Mouth2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		this.Mouth2.setRotationPoint(1.0F, 4.0F, -5.0F);
		this.Mouth2.setTextureSize(64, 64);
		this.Mouth2.mirror = true;
		this.setRotation(this.Mouth2, 0.0F, 0.0F, 0.0F);
		this.Mouth3 = new ModelRenderer(this, 16, 32);
		this.Mouth3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		this.Mouth3.setRotationPoint(-2.0F, 4.0F, -5.0F);
		this.Mouth3.setTextureSize(64, 64);
		this.Mouth3.mirror = true;
		this.setRotation(this.Mouth3, 0.0F, 0.0F, 0.0F);
		this.Ear1 = new ModelRenderer(this, 33, 29);
		this.Ear1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2);
		this.Ear1.setRotationPoint(-5.0F, 1.0F, -1.0F);
		this.Ear1.setTextureSize(64, 64);
		this.Ear1.mirror = true;
		this.setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
		this.Ear2 = new ModelRenderer(this, 33, 38);
		this.Ear2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2);
		this.Ear2.setRotationPoint(4.0F, 1.0F, -1.0F);
		this.Ear2.setTextureSize(64, 64);
		this.Ear2.mirror = true;
		this.setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
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
		this.Mouth1.render(var7);
		this.Mouth2.render(var7);
		this.Mouth3.render(var7);
		this.Ear1.render(var7);
		this.Ear2.render(var7);
	}

	private void setRotation(ModelRenderer var1, float var2, float var3, float var4) {
		var1.rotateAngleX = var2;
		var1.rotateAngleY = var3;
		var1.rotateAngleZ = var4;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {
		super.setRotationAngles(var1, var2, var3, var4, var5, var6, (Entity) null);
		this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
		this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
	}
}

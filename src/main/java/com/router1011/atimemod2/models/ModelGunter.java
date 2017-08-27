package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGunter extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer Nose1;
	ModelRenderer Nose2;

	public ModelGunter() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 9, 8, 6);
		this.head.setRotationPoint(0.0F, 10.0F, 2.0F);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 0, 45);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 11, 13, 6);
		this.body.setRotationPoint(-1.0F, 10.0F, 0.0F);
		this.body.setTextureSize(64, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 0);
		this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 1, 9, 6);
		this.rightarm.setRotationPoint(-3.0F, 13.0F, 0.0F);
		this.rightarm.setTextureSize(64, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 17);
		this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 1, 9, 6);
		this.leftarm.setRotationPoint(7.0F, 13.0F, 0.0F);
		this.leftarm.setTextureSize(64, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
		this.rightleg = new ModelRenderer(this, 0, 26);
		this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 6);
		this.rightleg.setRotationPoint(-3.0F, 23.0F, 0.0F);
		this.rightleg.setTextureSize(64, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
		this.leftleg = new ModelRenderer(this, 0, 18);
		this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 6);
		this.leftleg.setRotationPoint(4.0F, 23.0F, 0.0F);
		this.leftleg.setTextureSize(64, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
		this.Nose1 = new ModelRenderer(this, 0, 34);
		this.Nose1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2);
		this.Nose1.setRotationPoint(-1.0F, 5.0F, -4.0F);
		this.Nose1.setTextureSize(64, 64);
		this.Nose1.mirror = true;
		this.setRotation(this.Nose1, 0.0F, 0.0F, 0.0F);
		this.Nose2 = new ModelRenderer(this, 0, 40);
		this.Nose2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
		this.Nose2.setRotationPoint(0.0F, 6.0F, -6.0F);
		this.Nose2.setTextureSize(64, 64);
		this.Nose2.mirror = true;
		this.setRotation(this.Nose2, 0.0F, 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.Nose1.render(par7);
		this.Nose2.render(par7);
	}

	private void setRotation(ModelRenderer var1, float var2, float var3, float var4) {
		var1.rotateAngleX = var2;
		var1.rotateAngleY = var3;
		var1.rotateAngleZ = var4;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {
		this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
		this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.rightarm.rotateAngleZ = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.leftarm.rotateAngleZ = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
	}
}

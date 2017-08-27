package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelFinn extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer Backpack1;
	ModelRenderer Backpack2;
	ModelRenderer BackpackHandle1;
	ModelRenderer BackpackHandle2;
	ModelRenderer BackpackHandle3;
	ModelRenderer BackpackHandle4;
	ModelRenderer BackpackHandle5;
	ModelRenderer BackpackHandle6;
	ModelRenderer BackpackHandle7;
	ModelRenderer BackpackHandle8;
	ModelRenderer BackpackHandle9;
	ModelRenderer BackpackHandle10;
	ModelRenderer Ear1;
	ModelRenderer Ear2;

	public ModelFinn() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head.setTextureSize(128, 128);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 16, 16);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body.setTextureSize(128, 128);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 16);
		this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 12, 2);
		this.rightarm.setRotationPoint(-3.0F, 2.0F, 1.0F);
		this.rightarm.setTextureSize(128, 128);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 16);
		this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 12, 2);
		this.leftarm.setRotationPoint(5.0F, 2.0F, 1.0F);
		this.leftarm.setTextureSize(128, 128);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
		this.rightleg = new ModelRenderer(this, 0, 16);
		this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
		this.rightleg.setRotationPoint(-2.0F, 12.0F, 1.0F);
		this.rightleg.setTextureSize(128, 128);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
		this.leftleg = new ModelRenderer(this, 0, 16);
		this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
		this.leftleg.setRotationPoint(4.0F, 12.0F, 1.0F);
		this.leftleg.setTextureSize(128, 128);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
		this.Backpack1 = new ModelRenderer(this, 48, 0);
		this.Backpack1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 3);
		this.Backpack1.setRotationPoint(-4.0F, 0.0F, 2.0F);
		this.Backpack1.setTextureSize(128, 128);
		this.Backpack1.mirror = true;
		this.setRotation(this.Backpack1, 0.0F, 0.0F, 0.0F);
		this.Backpack2 = new ModelRenderer(this, 33, 0);
		this.Backpack2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 1);
		this.Backpack2.setRotationPoint(-3.0F, 1.0F, 5.0F);
		this.Backpack2.setTextureSize(128, 128);
		this.Backpack2.mirror = true;
		this.setRotation(this.Backpack2, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle1 = new ModelRenderer(this, 49, 17);
		this.BackpackHandle1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.BackpackHandle1.setRotationPoint(4.0F, -1.0F, -1.0F);
		this.BackpackHandle1.setTextureSize(128, 128);
		this.BackpackHandle1.mirror = true;
		this.setRotation(this.BackpackHandle1, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle2 = new ModelRenderer(this, 49, 21);
		this.BackpackHandle2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.BackpackHandle2.setRotationPoint(4.0F, 0.0F, 1.0F);
		this.BackpackHandle2.setTextureSize(128, 128);
		this.BackpackHandle2.mirror = true;
		this.setRotation(this.BackpackHandle2, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle3 = new ModelRenderer(this, 49, 24);
		this.BackpackHandle3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.BackpackHandle3.setRotationPoint(-5.0F, -1.0F, -1.0F);
		this.BackpackHandle3.setTextureSize(128, 128);
		this.BackpackHandle3.mirror = true;
		this.setRotation(this.BackpackHandle3, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle4 = new ModelRenderer(this, 49, 28);
		this.BackpackHandle4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.BackpackHandle4.setRotationPoint(4.0F, 1.0F, 2.0F);
		this.BackpackHandle4.setTextureSize(128, 128);
		this.BackpackHandle4.mirror = true;
		this.setRotation(this.BackpackHandle4, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle5 = new ModelRenderer(this, 57, 17);
		this.BackpackHandle5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.BackpackHandle5.setRotationPoint(-5.0F, 0.0F, 1.0F);
		this.BackpackHandle5.setTextureSize(128, 128);
		this.BackpackHandle5.mirror = true;
		this.setRotation(this.BackpackHandle5, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle6 = new ModelRenderer(this, 57, 21);
		this.BackpackHandle6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.BackpackHandle6.setRotationPoint(-5.0F, 1.0F, 2.0F);
		this.BackpackHandle6.setTextureSize(128, 128);
		this.BackpackHandle6.mirror = true;
		this.setRotation(this.BackpackHandle6, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle7 = new ModelRenderer(this, 57, 24);
		this.BackpackHandle7.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
		this.BackpackHandle7.setRotationPoint(-5.0F, 0.0F, -2.0F);
		this.BackpackHandle7.setTextureSize(128, 128);
		this.BackpackHandle7.mirror = true;
		this.setRotation(this.BackpackHandle7, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle8 = new ModelRenderer(this, 63, 17);
		this.BackpackHandle8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.BackpackHandle8.setRotationPoint(-5.0F, 6.0F, 1.0F);
		this.BackpackHandle8.setTextureSize(128, 128);
		this.BackpackHandle8.mirror = true;
		this.setRotation(this.BackpackHandle8, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle9 = new ModelRenderer(this, 63, 21);
		this.BackpackHandle9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.BackpackHandle9.setRotationPoint(4.0F, 6.0F, 1.0F);
		this.BackpackHandle9.setTextureSize(128, 128);
		this.BackpackHandle9.mirror = true;
		this.setRotation(this.BackpackHandle9, 0.0F, 0.0F, 0.0F);
		this.BackpackHandle10 = new ModelRenderer(this, 63, 25);
		this.BackpackHandle10.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
		this.BackpackHandle10.setRotationPoint(4.0F, 0.0F, -2.0F);
		this.BackpackHandle10.setTextureSize(128, 128);
		this.BackpackHandle10.mirror = true;
		this.setRotation(this.BackpackHandle10, 0.0F, 0.0F, 0.0F);
		this.Ear1 = new ModelRenderer(this, 57, 12);
		this.Ear1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.Ear1.setRotationPoint(2.0F, -10.0F, -1.0F);
		this.Ear1.setTextureSize(128, 128);
		this.Ear1.mirror = true;
		this.setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
		this.Ear2 = new ModelRenderer(this, 48, 12);
		this.Ear2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.Ear2.setRotationPoint(-4.0F, -10.0F, -1.0F);
		this.Ear2.setTextureSize(128, 128);
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
		this.Backpack1.render(var7);
		this.Backpack2.render(var7);
		this.BackpackHandle1.render(var7);
		this.BackpackHandle2.render(var7);
		this.BackpackHandle3.render(var7);
		this.BackpackHandle4.render(var7);
		this.BackpackHandle5.render(var7);
		this.BackpackHandle6.render(var7);
		this.BackpackHandle7.render(var7);
		this.BackpackHandle8.render(var7);
		this.BackpackHandle9.render(var7);
		this.BackpackHandle10.render(var7);
		this.Ear1.render(var7);
		this.Ear2.render(var7);
	}

	private void setRotation(ModelRenderer var1, float var2, float var3, float var4) {
		var1.rotateAngleX = var2;
		var1.rotateAngleY = var3;
		var1.rotateAngleZ = var4;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {
		super.setRotationAngles(var1, var2, var3, var4, var5, var6, null);
		this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
		this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float) Math.PI) * 1.0F * var2;
		this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.0F * var2;
	}
}

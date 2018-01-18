package com.router1011.atimemod2.lazymodder.interfaces;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IRenderLiving {
	@SideOnly(Side.CLIENT)
	public Class<? extends RenderLiving> getLivingRenderer();
}
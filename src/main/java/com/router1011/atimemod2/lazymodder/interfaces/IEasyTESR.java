package com.router1011.atimemod2.lazymodder.interfaces;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public interface IEasyTESR {

	Class<? extends TileEntity> getTileEntity();

	Class<? extends TileEntitySpecialRenderer> getTileEntityRenderer();

}

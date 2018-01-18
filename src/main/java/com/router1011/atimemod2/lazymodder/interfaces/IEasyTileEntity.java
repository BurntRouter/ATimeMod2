package com.router1011.atimemod2.lazymodder.interfaces;

import net.minecraft.tileentity.TileEntity;

public interface IEasyTileEntity<T> {
	public Class<? extends TileEntity> getTileEntity();
	public String getTileEntityRegistryName();
	public T getItemBlock();
}

package com.router1011.atimemod2.lazymodder.blocks.tileentity;

import org.apache.logging.log4j.Level;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;
import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyTileEntity;
import com.router1011.atimemod2.lazymodder.item.EasyItemBlockTileEntity;

public class EasyTileEntityBlock extends EasyBlock implements ITileEntityProvider, IEasyTileEntity, IEasyRegister {
	protected Class<? extends TileEntity> tileEntity;

	public EasyTileEntityBlock(String name, Class<? extends TileEntity> tileEntity) {
		this(name, tileEntity, Material.IRON);
	}

	public EasyTileEntityBlock(String name, Class<? extends TileEntity> tileEntity, Material materialIn) {
		super(name, materialIn);
		this.tileEntity = tileEntity;
		this.fullBlock = true;
	}
	
	@Override
	public Class<? extends TileEntity> getTileEntity() {
		return this.tileEntity;
	}
	
	@Override
	public String getTileEntityRegistryName() {
		return getRegistryName().getResourcePath();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		try {
			return this.tileEntity.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			FMLLog.log.log(Level.TRACE, "Unable to create new instance of {}", this.tileEntity.getName());
		}
		return null;
	}
	
	@Override
	public String getNameFromMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public String getRegistryNameForMeta(int meta) {
		return getRegistryName().getResourcePath();
	}

	@Override
	public ItemBlock createItem() {
		return new EasyItemBlockTileEntity(this);
	}
	
	@Override
	public boolean hasTileEntity() {
		return true;
	}

}

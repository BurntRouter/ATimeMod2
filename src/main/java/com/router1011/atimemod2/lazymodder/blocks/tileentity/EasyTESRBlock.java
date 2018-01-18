package com.router1011.atimemod2.lazymodder.blocks.tileentity;

import org.apache.logging.log4j.Level;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;
import com.router1011.atimemod2.lazymodder.blocks.EasyBlock;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyTESR;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyTileEntity;
import com.router1011.atimemod2.lazymodder.item.EasyItemBlockTileEntity;

public class EasyTESRBlock extends EasyBlock implements ITileEntityProvider, IEasyTileEntity, IEasyRegister, IEasyTESR {
	protected Class<? extends TileEntity> tileEntity;
	private Class<? extends TileEntitySpecialRenderer> renderEntity;

	public EasyTESRBlock(String name, Class<? extends TileEntity> tileEntity,
			Class<? extends TileEntitySpecialRenderer> renderEntity) {
		this(name, tileEntity, renderEntity, Material.IRON);
	}

	public EasyTESRBlock(String name, Class<? extends TileEntity> tileEntity,
			Class<? extends TileEntitySpecialRenderer> renderEntity, Material materialIn) {
		super(name, materialIn);
		this.tileEntity = tileEntity;
		this.renderEntity = renderEntity;
		this.fullBlock = true;
	}
	
	@Override
	public Class<? extends TileEntity> getTileEntity() {
		return this.tileEntity;
	}
	
	@Override
	public Class<? extends TileEntitySpecialRenderer> getTileEntityRenderer() {
		return this.renderEntity;
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
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.INVISIBLE;
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
	
	// Defaults
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public boolean isTranslucent(IBlockState state) {
		return false;
	}

	@Override
	public boolean isNormalCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}

	@Override
	public boolean hasTileEntity() {
		return true;
	}

}

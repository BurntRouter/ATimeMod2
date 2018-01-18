package com.router1011.atimemod2.lazymodder.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import com.router1011.atimemod2.lazymodder.blocks.properties.MetaProperty;

public class EasyMetaBlock extends EasyBlock {
	protected MetaProperty meta;
	protected BlockStateContainer blockState;

	public EasyMetaBlock(String name) {
		this(name, Material.ROCK);
	}

	public EasyMetaBlock(String name, int subBlockCount) {
		this(name, subBlockCount, Material.ROCK);
	}

	public EasyMetaBlock(String name, Material materialIn) {
		this(name, 1, materialIn);
	}

	public EasyMetaBlock(String name, int subCount, Material materialIn) {
		super(name, subCount, materialIn);
		meta = MetaProperty.create("meta", 0, subCount - 1);
		this.blockState = createTrueBlockState();
		setDefaultState(this.blockState.getBaseState().withProperty(meta, 0));
	}

	protected BlockStateContainer createTrueBlockState() {
		return new BlockStateContainer.Builder(this).add(meta).build();
	}

	@Override
	public BlockStateContainer getBlockState() {
		return this.blockState;
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(meta);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(this.meta, meta);
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(this.meta, meta);
	}

}

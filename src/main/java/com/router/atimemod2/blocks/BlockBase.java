package com.router.atimemod2.blocks;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableMap;
import com.router.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block implements IBlockState {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ATimeMod.creativeTab);
	}
	
	public void registerItemModel(Item itemBlock) {
		ATimeMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}

	@Override
	public boolean onBlockEventReceived(World worldIn, BlockPos pos, int id, int param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void neighborChanged(World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Material getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canEntitySpawn(Entity entityIn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLightOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightOpacity(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLightValue(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isTranslucent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean useNeighborBrightness() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MapColor getMapColor(IBlockAccess p_185909_1_, BlockPos p_185909_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withRotation(Rotation rot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withMirror(Mirror mirrorIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCustomBreakingProgress() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPackedLightmapCoords(IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAmbientOcclusionLightValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBlockNormalCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNormalCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canProvidePower() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWeakPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasComparatorInputOverride() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getComparatorInputOverride(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getBlockHardness(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPlayerRelativeBlockHardness(EntityPlayer player, World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrongPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EnumPushReaction getMobilityFlag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState getActualState(IBlockAccess blockAccess, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, BlockPos pos, EnumFacing facing) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockAccess worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCollisionBoxToList(World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185908_6_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockAccess blockAccess, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RayTraceResult collisionRayTrace(World worldIn, BlockPos pos, Vec3d start, Vec3d end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTopSolid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockAccess world, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vec3d getOffset(IBlockAccess access, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean causesSuffocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, BlockPos pos, EnumFacing facing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IProperty<?>> getPropertyKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>> T getValue(IProperty<T> property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>, V extends T> IBlockState withProperty(IProperty<T> property, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>> IBlockState cycleProperty(IProperty<T> property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImmutableMap<IProperty<?>, Comparable<?>> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesSideBlockChestOpening(IBlockAccess world, BlockPos pos, EnumFacing side) {
		return false;
	}
}
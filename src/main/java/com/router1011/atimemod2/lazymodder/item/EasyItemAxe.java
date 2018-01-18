package com.router1011.atimemod2.lazymodder.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class EasyItemAxe extends ItemTool {
	protected static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG,
			Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER,
			Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	protected static final float[] ATTACK_DAMAGES = new float[] { 6.0F, 8.0F, 8.0F, 8.0F, 6.0F };
	protected static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F };

	public EasyItemAxe(String toolName, Item.ToolMaterial materialIn) {
		this(toolName, materialIn, 0.0F, 0.0F, EFFECTIVE_ON);
	}
	
	public EasyItemAxe(String toolName, Item.ToolMaterial materialIn, Set<Block> effectiveBlocksIn) {
		this(toolName, materialIn, 0.0F, 0.0F, effectiveBlocksIn);
	}

	public EasyItemAxe(String toolName, Item.ToolMaterial material, float damage, float speed) {
		this(toolName, material, damage, speed, EFFECTIVE_ON);
	}

	public EasyItemAxe(String toolName, Item.ToolMaterial materialIn, float attackDamageIn, float attackSpeedIn,
			Set<Block> effectiveBlocksIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
				? super.getDestroySpeed(stack, state) : this.efficiency;
	}

}

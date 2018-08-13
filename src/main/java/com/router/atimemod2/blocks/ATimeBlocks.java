package com.router.atimemod2.blocks;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.items.ATimeItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ATimeBlocks {
		
		public static BlockBase candy_dirt = new BlockBase(Material.GRASS, "candy_dirt", 1.0F, "shovel", 0, SoundType.GROUND, 1.0F);
		public static CandyGrass candy_grass = new CandyGrass();
		public static BlockBase crystal_block = new BlockBase(Material.GLASS, "crystal_block", 4.0F, "pickaxe", 2, SoundType.STONE, 2.0F);
		public static BlockBase crystal_ore = new BlockBase(Material.ROCK, "crystal_ore", 4.0F, "pickaxe", 2, SoundType.STONE, 2.0F);
		public static BlockBase candy_log = new BlockBase(Material.WOOD, "candy_log", 1.2F, "axe", 0, SoundType.WOOD, 1.2F);
		public static CandyLeaves candy_leaves = new CandyLeaves();
		public static CandySapling candy_sapling = new CandySapling();
		
		public static void register(IForgeRegistry<Block> registry) {
			registry.registerAll(
					candy_dirt,
					candy_grass,
					crystal_block,
					crystal_ore,
					candy_log,
					candy_leaves,
					candy_sapling
			);
		}
		
		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(
					candy_dirt.createItemBlock(),
					candy_grass.createItemBlock(),
					crystal_block.createItemBlock(),
					crystal_ore.createItemBlock(),
					candy_log.createItemBlock(),
					candy_leaves.createItemBlock(),
					candy_sapling.createItemBlock()
			);
		}
		
		public static void registerModels() {
			candy_dirt.registerItemModel(Item.getItemFromBlock(candy_dirt));
			candy_grass.registerItemModel(Item.getItemFromBlock(candy_grass));
			crystal_block.registerItemModel(Item.getItemFromBlock(crystal_block));
			crystal_ore.registerItemModel(Item.getItemFromBlock(crystal_ore));
			candy_log.registerItemModel(Item.getItemFromBlock(candy_log));
			candy_leaves.registerItemModel(Item.getItemFromBlock(candy_leaves));
			candy_sapling.registerItemModel(Item.getItemFromBlock(candy_sapling));
		}
}
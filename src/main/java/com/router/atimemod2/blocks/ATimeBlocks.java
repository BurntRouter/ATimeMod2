package com.router.atimemod2.blocks;

import com.router.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ATimeBlocks {
		
//		public static BlockBase candy_dirt = new BlockBase(Material.GRASS, "candy_dirt");
//		public static BlockBase candy_grass = new BlockBase(Material.GRASS, "candy_grass");
		public static BlockBase crystal_block = new BlockBase(Material.GLASS, "crystal_block");
		public static BlockBase crystal_ore = new BlockBase(Material.ROCK, "crystal_ore");
		public static BlockBase demonic_ore = new BlockBase(Material.ROCK, "demonic_ore");
		
		public static void register(IForgeRegistry<Block> registry) {
			registry.registerAll(
//					candy_dirt,
//					candy_grass,
					crystal_block,
					crystal_ore,
					demonic_ore
			);
		}
		
		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(
//					candy_dirt.createItemBlock(),
//					candy_grass.createItemBlock(),
					crystal_block.createItemBlock(),
					crystal_ore.createItemBlock(),
					demonic_ore.createItemBlock()
			);
		}
		
		public static void registerModels() {
//			candy_dirt.registerItemModel(Item.getItemFromBlock(candy_dirt));
//			candy_grass.registerItemModel(Item.getItemFromBlock(candy_grass));
			crystal_block.registerItemModel(Item.getItemFromBlock(crystal_block));
			crystal_ore.registerItemModel(Item.getItemFromBlock(crystal_ore));
			demonic_ore.registerItemModel(Item.getItemFromBlock(demonic_ore));
		}
}
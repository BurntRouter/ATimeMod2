package com.router1011.atimemod2.blocks;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ATimeBlocks {
		
		public static BlockBase crystal_block = new BlockBase(Material.GLASS, "crystal_block");
		public static BlockBase crystal_ore = new BlockBase(Material.ROCK, "crystal_ore");
		public static BlockBase demonic_ore = new BlockBase(Material.ROCK, "demonic_ore");
		public static BlockBase steel_ore = new BlockBase(Material.IRON, "steel_ore");
		
		public static void register(IForgeRegistry<Block> registry) {
			registry.registerAll(
					crystal_block,
					crystal_ore,
					demonic_ore,
					steel_ore
			);
		}
		
		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(
					crystal_block.createItemBlock(),
					crystal_ore.createItemBlock(),
					demonic_ore.createItemBlock(),
					steel_ore.createItemBlock()
			);
		}
		
		public static void registerModels() {
			crystal_block.registerItemModel(Item.getItemFromBlock(crystal_block));
			crystal_ore.registerItemModel(Item.getItemFromBlock(crystal_ore));
			demonic_ore.registerItemModel(Item.getItemFromBlock(demonic_ore));
			steel_ore.registerItemModel(Item.getItemFromBlock(steel_ore));
		}
}
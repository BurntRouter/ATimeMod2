package com.burntrouter.atimemod2.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static final Block BANANA_YELLOW = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("banana_yellow");
	public static final Block BERRY_BLUE = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("berry_blue");
	public static final Block CANDY_DIRT = new Block(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.3F).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL)).setRegistryName("candy_dirt");
	public static final Block CANDY_GRASS = new Block(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.GRASS).hardnessAndResistance(0.3F).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL)).setRegistryName("candy_grass");
	public static final Block CANDY_LEAVES = new Block(AbstractBlock.Properties.create(Material.LEAVES, MaterialColor.PINK).hardnessAndResistance(0.1F).sound(SoundType.PLANT).harvestTool(ToolType.HOE)).setRegistryName("candy_leaves");
	public static final Block CANDY_LOG = new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)).setRegistryName("candy_log");
	public static final Block CANDY_SAPLING = new Block(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.PINK).sound(SoundType.PLANT).doesNotBlockMovement().zeroHardnessAndResistance()).setRegistryName("candy_sapling");
	public static final Block CHERRY_RED = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("cherry_red");
	public static final Block CHOCOLATE_BROWN = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("chocolate_brown");
	public static final Block CREAM_WHITE = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("cream_white");
	public static final Block CRYSTAL_BLOCK = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F).sound(SoundType.GLASS).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("crystal_block");
	public static final Block CRYSTAL_ORE = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F).sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("crystal_ore");
	public static final Block GRAPE_PURPLE = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("grape_purple");
	public static final Block WATERMELON_PINK = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).setRegistryName("watermelon_pink");
	
	public static void register(IForgeRegistry<Block> forgeRegistry) {
		forgeRegistry.registerAll(BANANA_YELLOW, BERRY_BLUE, CANDY_DIRT, CANDY_GRASS, CANDY_LEAVES, CANDY_LOG, CANDY_SAPLING, CHERRY_RED, CHOCOLATE_BROWN, CREAM_WHITE, CRYSTAL_BLOCK, GRAPE_PURPLE, WATERMELON_PINK);
	}

}

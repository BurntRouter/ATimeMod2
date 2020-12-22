package com.burntrouter.atimemod2.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static final Block CRYSTAL_BLOCK = new Block(Properties.create(Material.ROCK).hardnessAndResistance(1.5F).sound(SoundType.GLASS)).setRegistryName("crystal_block");
	
	public static void register(IForgeRegistry<Block> forgeRegistry) {
		forgeRegistry.register(CRYSTAL_BLOCK);
	}

}

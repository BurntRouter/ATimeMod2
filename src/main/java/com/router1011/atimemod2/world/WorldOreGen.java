package com.router1011.atimemod2.world;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import com.router1011.atimemod2.blocks.ATimeBlocks;

public class WorldOreGen implements IWorldGenerator {
	private final WorldGenMinable oreGenCrystal, oreGenDemonic, oreGenSteel;

	public WorldOreGen() {
		oreGenCrystal = new WorldGenMinable(ATimeBlocks.crystal_ore.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.STONE));
		oreGenDemonic = new WorldGenMinable(ATimeBlocks.demonic_ore.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.STONE));
		oreGenSteel = new WorldGenMinable(ATimeBlocks.steel_ore.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.STONE));
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator chunkGenerator, final IChunkProvider chunkProvider) {
		final BlockPos chunkPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);

		switch (world.provider.getDimensionType()) {
			case OVERWORLD:
				for (int i = 0; i < 16; i++) {
					oreGenCrystal.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
					oreGenDemonic.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
					oreGenSteel.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
				}
				break;
		}
	}
}
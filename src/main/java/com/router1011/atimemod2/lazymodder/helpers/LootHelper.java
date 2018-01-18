package com.router1011.atimemod2.lazymodder.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;

public class LootHelper {
	//https://mcforge.readthedocs.io/en/latest/items/loot_tables/
	public static void addLootTable(ResourceLocation resourceLocation) {
		LootTableList.register(resourceLocation);
	}

	/**
     * Register a new seed to be dropped when breaking tall grass.
     *
     * @param drop The item to drop as a seed.
     * @param dropChance The relative probability of the seeds,
     *               where wheat seeds are 10.
     **/
	public static void addGrassDrop(ItemStack drop, int dropChance) {
		MinecraftForge.addGrassSeed(drop, dropChance);
	}
}

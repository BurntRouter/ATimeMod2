package com.router.atimemod2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.router.atimemod2.ATimeMod;

@Mod.EventBusSubscriber(modid = ATimeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ATimeMod.MODID)
public class ModBlocks {

    public static final Block candy_dirt = null;
    public static final Block candy_grass = null;
    public static final Block crystal_block = null;
    public static final Block crystal_ore = null;
    public static final Block demonic_ore = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 1.5f)).setRegistryName(ATimeMod.MODID, "candy_dirt"),
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 1.5f)).setRegistryName(ATimeMod.MODID, "candy_grass"),
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 4.0f)).setRegistryName(ATimeMod.MODID, "crystal_block"),
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f, 3.5f)).setRegistryName(ATimeMod.MODID, "crystal_ore"),
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.5f, 5.5f)).setRegistryName(ATimeMod.MODID, "demonic_ore")
                );
    }
}

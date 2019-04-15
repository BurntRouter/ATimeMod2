package com.router.atimemod2.init;

import com.router.atimemod2.blocks.ATBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.router.atimemod2.ATimeMod;

import javax.tools.Tool;

@Mod.EventBusSubscriber(modid = ATimeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ATimeMod.MODID)
public class ModBlocks {

    public static final ATBlocks candy_dirt = null;
    public static final ATBlocks candy_grass = null;
    public static final ATBlocks crystal_block = null;
    public static final ATBlocks crystal_ore = null;
    public static final ATBlocks demonic_ore = null;


    //Order for ATBlocks is Material.material, MaterialColor.color, Hardness float, Resistance float, SoundType.sound, String name, ToolType.tool, HarvestLevel int :D
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                new ATBlocks(Material.GROUND, MaterialColor.DIRT, 1f, 1f, SoundType.GROUND, "candy_dirt", ToolType.SHOVEL, 0),
                new ATBlocks(Material.GROUND, MaterialColor.DIRT, 1f, 1f, SoundType.GROUND, "candy_grass", ToolType.SHOVEL, 0),
                new ATBlocks(Material.ROCK, MaterialColor.BLUE, 3f, 3f, SoundType.STONE, "crystal_block", ToolType.PICKAXE, 3),
                new ATBlocks(Material.ROCK, MaterialColor.STONE, 3f, 3f, SoundType.STONE, "crystal_ore", ToolType.PICKAXE, 3),
                new ATBlocks(Material.ROCK, MaterialColor.STONE, 3f, 3f, SoundType.STONE, "demonic_ore", ToolType.PICKAXE, 3)
                );
    }
}

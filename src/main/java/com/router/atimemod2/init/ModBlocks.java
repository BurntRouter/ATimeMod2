package com.router.atimemod2.init;

import com.router.atimemod2.block.ATBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.block.BlockFlowingFluid;

@Mod.EventBusSubscriber(modid = ATimeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ATimeMod.MODID)
public class ModBlocks {

    //Candy Kingdom Blocks
    public static final ATBlocks banana_yellow = null;
    public static final ATBlocks berry_blue = null;
    public static final ATBlocks candy_dirt = null;
    public static final ATBlocks candy_grass = null;
    public static final ATBlocks candy_leaves = null;
    public static final ATBlocks candy_log = null;
    public static final ATBlocks cherry_red = null;
    public static final ATBlocks chocolate_brown = null;
    public static final ATBlocks cream_white = null;
    public static final ATBlocks grape_purple = null;
    public static final BlockFlowingFluid juice = null;
    public static final ATBlocks watermelon_pink = null;

    //Misc Blocks

    public static final ATBlocks crystal_block = null;
    public static final ATBlocks crystal_ore = null;
    public static final ATBlocks demonic_ore = null;


    //Order for ATBlocks is Material.material, MaterialColor.color, Hardness float, Resistance float, SoundType.sound, String name, ToolType.tool, HarvestLevel int :D
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                new ATBlocks(Material.ROCK, MaterialColor.YELLOW, 1f, 1f, SoundType.GROUND, "banana_yellow", ToolType.PICKAXE, 1),
                new ATBlocks(Material.ROCK, MaterialColor.BLUE, 1f, 1f, SoundType.GROUND, "berry_blue", ToolType.PICKAXE, 1),
                new ATBlocks(Material.GROUND, MaterialColor.DIRT, 1f, 1f, SoundType.GROUND, "candy_dirt", ToolType.SHOVEL, 0),
                new ATBlocks(Material.GROUND, MaterialColor.DIRT, 1f, 1f, SoundType.GROUND, "candy_grass", ToolType.SHOVEL, 0),
                new ATBlocks(Material.LEAVES, MaterialColor.PINK, 1f, 1f, SoundType.PLANT, "candy_leaves", ToolType.AXE, 1),
                new ATBlocks(Material.WOOD, MaterialColor.PINK, 1f, 1f, SoundType.WOOD, "candy_log", ToolType.AXE, 0),
                new ATBlocks(Material.ROCK, MaterialColor.RED, 1f, 1f, SoundType.GROUND, "cherry_red", ToolType.PICKAXE, 1),
                new ATBlocks(Material.ROCK, MaterialColor.BROWN, 1f, 1f, SoundType.GROUND, "chocolate_brown", ToolType.PICKAXE, 1),
                new ATBlocks(Material.ROCK, MaterialColor.QUARTZ, 1f, 1f, SoundType.GROUND, "cream_white", ToolType.PICKAXE, 1),
                new ATBlocks(Material.ROCK, MaterialColor.OBSIDIAN, 1f, 1f, SoundType.GROUND, "grape_purple", ToolType.PICKAXE, 1),
//                new BlockFlowingFluid(ModFluids.JUICE, new Block.Properties(Material.WATER, MaterialColor.RED));
                new ATBlocks(Material.ROCK, MaterialColor.PINK, 1f, 1f, SoundType.GROUND, "watermelon_pink", ToolType.PICKAXE, 1),

                new ATBlocks(Material.ROCK, MaterialColor.BLUE, 3f, 3f, SoundType.STONE, "crystal_block", ToolType.PICKAXE, 3),
                new ATBlocks(Material.ROCK, MaterialColor.STONE, 3f, 3f, SoundType.STONE, "crystal_ore", ToolType.PICKAXE, 3),
                new ATBlocks(Material.ROCK, MaterialColor.STONE, 3f, 3f, SoundType.STONE, "demonic_ore", ToolType.PICKAXE, 3)
                );
    }
}

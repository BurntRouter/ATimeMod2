package com.router.atimemod2.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;


public class ATBlocks extends Block {

    private int harvestLevel;
    private net.minecraftforge.common.ToolType harvestTool;


    public ATBlocks(Material material, MaterialColor color, Float hardness, Float resistance, SoundType sound, String name,  ToolType tool, int level) {
        super(Properties.create(material, color).hardnessAndResistance(hardness, resistance).sound(sound));
        this.setRegistryName(name);
        harvestTool = tool;
        harvestLevel = level;
    }

    @Override
    public int getHarvestLevel(IBlockState state) {

        return harvestLevel;
    }

    @Nullable
    @Override
    public net.minecraftforge.common.ToolType getHarvestTool(IBlockState state) {
        return harvestTool;
    }

}

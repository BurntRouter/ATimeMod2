package com.router.atimemod2.init;

import com.router.atimemod2.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.router.atimemod2.ATimeMod;

@Mod.EventBusSubscriber(modid = ATimeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ATimeMod.MODID)
public class ModItems {

    public static final ItemFood bacon = null;
    public static final ItemFood bacon_pancake = null;
    public static final Item billy_gauntlet = null;
    public static final ItemFood bubblegum = null;
    public static final ItemFood candy = null;
    public static final ItemFood cotton_candy = null;
    public static final ATAxe crystal_axe = null;
    public static final Item crystal_gem = null;
    public static final Item crystal_gem_apple = null;
    public static final ATHoe crystal_hoe = null;
    public static final ATPickaxe crystal_pickaxe = null;
    public static final ATShovel crystal_shovel = null;
    public static final ATSword crystal_sword = null;
    public static final Item demon_blood = null;
    public static final Item demonic_ingot = null;
    public static final ATSword demonic_sword = null;
    public static final ItemFood doughnut = null;
    public static final ItemFood everything_burrito = null;
    public static final Item flour = null;
    public static final ATSword fourd_sword = null;
    public static final ATSword grass_sword = null;
    public static final Item ice_shard = null;
    public static final ATSword jake_sword = null;
    public static final ItemBucket juice_bucket = null;
    public static final ItemFood lollipop = null;
    public static final ItemFood pancake = null;
    public static final ATSword paper_sword = null;
    public static final ATSword root_sword = null;
    public static final ATSword scarlet = null;
    public static final Item steel_base = null;
    public static final Item steel_ingot = null;
    public static final Item the_enchiridion = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemFood(5, 2, true, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "bacon"),
                new ItemFood(9, 5, true, new Item.Properties().maxStackSize(16).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "bacon_pancake"),
                new Item(new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "billy_gauntlet"),
                new ItemFood(1, 1, false, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "bubblegum"),
                new ItemFood(1, 1, false, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "candy"),
                new ItemFood(2, 1, false, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "cotton_candy"),
                new ATAxe(ItemTier.DIAMOND, 4, 1, new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "crystal_axe"),
                new Item(new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)).setRegistryName("crystal_gem"),
                new Item(new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName("crystal_gem_apple"),
                new ATHoe(ItemTier.DIAMOND, 2, new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "crystal_hoe"),
                new ATPickaxe(ItemTier.DIAMOND, 2, 1, new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "crystal_pickaxe"),
                new ATShovel(ItemTier.DIAMOND, 1, 1, new Item.Properties().maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "crystal_shovel"),//
//                new ItemBucket(ModFluids.JUICE, (new Item.Properties()).maxStackSize(1).group(ATimeMod.ATTab)).setRegistryName(ATimeMod.MODID, "juice_bucket"),

                //ItemBlocks
                createItemBlockForBlock(ModBlocks.banana_yellow, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.berry_blue, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.candy_dirt, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.candy_grass, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.candy_leaves, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.candy_log, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.cherry_red, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.chocolate_brown, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.cream_white, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.grape_purple, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
//                createItemBlockForBlock(ModBlocks.juice_flow, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
//                createItemBlockForBlock(ModBlocks.juice_still, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.watermelon_pink, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),

                createItemBlockForBlock(ModBlocks.crystal_block, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.crystal_ore, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab)),
                createItemBlockForBlock(ModBlocks.demonic_ore, new Item.Properties().maxStackSize(64).group(ATimeMod.ATTab))
        );
    }

    private static ItemBlock createItemBlockForBlock(Block block, Item.Properties properties) {
        return (ItemBlock) new ItemBlock(block, properties).setRegistryName(block.getRegistryName());
    }
}

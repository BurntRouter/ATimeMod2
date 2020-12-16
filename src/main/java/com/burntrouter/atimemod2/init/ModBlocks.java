package com.burntrouter.atimemod2.init;

import java.util.function.Supplier;

import com.burntrouter.atimemod2.ATimeMod2;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ATimeMod2.MODID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ATimeMod2.MODID);
	
	public static boolean isInitialized = false;
	
	public static final RegistryObject<Block> CRYSTAL_BLOCK = registerBlock("crystal_block",
			() -> new Block(Block.Properties.create(Material.ROCK)));
	
	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		return registerBlock(name, blockFactory, block -> new BlockItem(block, defaultItemProperties()));
	}
	
	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory, final IBlockItemFactory<BLOCK> itemFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);

		ITEMS.register(name, () -> itemFactory.create(block.get()));

		return block;
	}
	
	@FunctionalInterface
	private interface IBlockItemFactory<BLOCK extends Block> {
		Item create(BLOCK block);
	}
	
	private static Item.Properties defaultItemProperties() {
		return new Item.Properties().group(ATimeMod2.ITEM_GROUP);
	}
	
	public static void initialize(final IEventBus modEventBus) {
		if (isInitialized) {
			throw new IllegalStateException("Already initialized");
		}

		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);

		isInitialized = true;
	}

}

package com.burntrouter.atimemod2.init;

import com.burntrouter.atimemod2.ATimeMod2;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ATimeMod2.MODID);
    
    private static boolean isInitialized;
    
    //Food
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon", 
    		() -> new Item.Properties().food(new Food.Builder().hunger(4).saturation(4).meat().build()).group(ATimeMod2.ITEM_GROUP));
    
    //Items
    public static final RegistryObject<Item> CRYSTAL_GEM = ITEMS.register("crystal_gem",
    		() -> new Item(defaultItemProperties()));
    
    
	private static Item.Properties defaultItemProperties() {
		return new Item.Properties().group(ATimeMod2.ITEM_GROUP);
	}
	
	public static void initialize(final IEventBus modEventBus) {
		if (isInitialized) {
			throw new IllegalStateException("Already initialized");
		}

		ITEMS.register(modEventBus);

		isInitialized = true;
	}

}

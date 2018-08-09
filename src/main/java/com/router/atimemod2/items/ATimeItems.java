package com.router.atimemod2.items;

import com.router.atimemod2.ATimeMod;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.registries.IForgeRegistry;

public class ATimeItems {

	public static ItemBase billy_gauntlet = new ItemBase("billy_gauntlet");
	public static ItemBase crystal_gem = new ItemBase("crystal_gem");
	public static ItemBase demon_blood = new ItemBase("demon_blood");
	public static ItemBase demon_ingot = new ItemBase("demon_ingot");
	public static ItemBase enchiridion_item = new ItemBase("enchiridion_item");
	public static ItemBase flour = new ItemBase("flour");
	public static ItemBase ice_shard = new ItemBase("ice_shard");
	public static ItemBase steel_ingot = new ItemBase("steel_ingot");
	public static ItemBase steel_base = new ItemBase("steel_base");

	//TODO figure out armor or something
//	public static ArmorBase JakeBoots, JakeChest, JakeHead, JakeLegs;
	
//	public static ShovelBase crystal_shovel = new ShovelBase("crystal_shovel", ATimeMod.CRYSTAL);
//	public static AxeBase crystal_axe = new AxeBase("crystal_axe", ATimeMod.CRYSTAL);
//	public static HoeBase crystal_hoe = new HoeBase("crystal_hoe", ATimeMod.CRYSTAL);
//	public static PickaxeBase crystal_pickaxe = new PickaxeBase("crystal_pickaxe", ATimeMod.CRYSTAL);

	public static FoodBase bacon = new FoodBase("bacon", 6, 6F, true);
	public static FoodBase bacon_pancake = new FoodBase("bacon_pancake", 16, 7F, false);
	public static FoodBase bubble_gum = new FoodBase("bubble_gum", 1, 1F, false);
	public static FoodBase candy = new FoodBase("candy", 2, 2F, false);
	public static FoodBase cotton_candy = new FoodBase("cotton_candy", 4, 2F, false);
	public static FoodBase donut = new FoodBase("donut", 4, 6F, false);
	public static FoodBase everything_burrito = new FoodBase("everything_burrito", 16, 8F, false);
	public static FoodBase gem_apple = new FoodBase("gem_apple", 20, 20F, false);
	public static FoodBase lollipop = new FoodBase("lollipop", 1, 1F, false);
	public static FoodBase pancake = new FoodBase("pancake", 14, 7F, false);

	public static SwordBase crystal_sword = new SwordBase("crystal_sword", ATimeMod.CRYSTAL);
	public static SwordBase demon_sword = new SwordBase("demon_sword", ATimeMod.FOURD);
	public static SwordBase fourd_sword = new SwordBase("fourd_sword", ATimeMod.FOURD);
	public static SwordBase grass_sword = new SwordBase("grass_sword", ATimeMod.GRASS);
	public static SwordBase jake_sword = new SwordBase("jake_sword", ToolMaterial.DIAMOND); 
	public static SwordBase scarlet = new SwordBase("scarlet", ATimeMod.SCARLET); 
	public static SwordBase paper_sword = new SwordBase("paper_sword", ToolMaterial.GOLD);
	public static SwordBase root_sword = new SwordBase("root_sword", ToolMaterial.IRON);

	public static void registerItems(IForgeRegistry<Item> registry) {
		registry.registerAll(
				//Items
				billy_gauntlet, 
				crystal_gem, 
				demon_blood, 
				demon_ingot, 
				enchiridion_item, 
				flour, 
				ice_shard, 
				steel_ingot,
				steel_base,
				//Food
				bacon,
				bacon_pancake,
				bubble_gum,
				candy,
				cotton_candy,
				donut,
				everything_burrito,
				gem_apple,
				lollipop,
				pancake,
				//Swords
				crystal_sword,
				demon_sword,
				fourd_sword,
				grass_sword,
				jake_sword,
				scarlet,
				paper_sword,
				root_sword
		);
	}

	public static void registerItemModels() {
		//Items
		billy_gauntlet.registerItemModel(); 
		crystal_gem.registerItemModel(); 
		demon_blood.registerItemModel(); 
		demon_ingot.registerItemModel(); 
		enchiridion_item.registerItemModel(); 
		flour.registerItemModel(); 
		ice_shard.registerItemModel(); 
		steel_ingot.registerItemModel();
		steel_base.registerItemModel();
		
		//Tools
//		crystal_shovel.registerItemModel();
//		crystal_axe.registerItemModel();
//		crystal_hoe.registerItemModel();
//		crystal_pickaxe.registerItemModel();
		
		//Food
		bacon.registerItemModel();
		bacon_pancake.registerItemModel();
		bubble_gum.registerItemModel();
		candy.registerItemModel();
		cotton_candy.registerItemModel();
		donut.registerItemModel();
		everything_burrito.registerItemModel();
		gem_apple.registerItemModel();
		lollipop.registerItemModel();
		pancake.registerItemModel();
		
		//Swords&Weapons
		crystal_sword.registerItemModel();
		demon_sword.registerItemModel();
		fourd_sword.registerItemModel();
		grass_sword.registerItemModel();
		jake_sword.registerItemModel();
		scarlet.registerItemModel();
		paper_sword.registerItemModel();
		root_sword.registerItemModel();
	};

}
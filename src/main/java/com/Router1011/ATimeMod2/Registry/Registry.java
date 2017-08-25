package com.Router1011.ATimeMod2.Registry;

import com.Router1011.ATimeMod2.Items.ATimeItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry extends GameRegistry {
	public static ItemStack ingotSteel = new ItemStack(ATimeItems.SteelIngot);
	public static void mainRegistry() {

		Registry.addRecipe(new ItemStack(ATimeItems.Bacon, 3), " p ", " p ",
				" p ", Character.valueOf('p'), Items.PORKCHOP);

		Registry.addRecipe(new ItemStack(ATimeItems.RootSword, 1), " s ", " s ",
				"srs", Character.valueOf('s'), ingotSteel,
				Character.valueOf('r'), Blocks.SAPLING);

		Registry.addRecipe(new ItemStack(ATimeItems.Pancake, 1), "   ", " m ", "fff",
				Character.valueOf('f'), ATimeItems.Flour, Character.valueOf('m'),
				Items.MILK_BUCKET);

		Registry.addToolsetRecipe(ATimeItems.CrystalGem, ATimeItems.CrystalSword,
				ATimeItems.CrystalShovel, ATimeItems.CrystalPickaxe, ATimeItems.CrystalHoe,
				ATimeItems.CrystalAxe);

		Registry.addVerticleRecipe(ATimeItems.DemonSword, ATimeItems.DemonIngot,
				ATimeItems.DemonIngot, Items.STICK);

		Registry.addRecipe(new ItemStack(ATimeItems.GemApple, 1), "xxx", "xyx",
				"xxx", Character.valueOf('x'), ATimeItems.CrystalGem,
				Character.valueOf('y'), Items.APPLE);

		Registry.addShapelessRecipe(new ItemStack(ATimeItems.BaconPancake, 1),
				ATimeItems.Bacon, ATimeItems.Pancake);

		Registry.addShapelessRecipe(new ItemStack(Blocks.ICE, 1), ATimeItems.IceShard);

		Registry.addShapelessRecipe(new ItemStack(ATimeItems.IceShard, 1), Blocks.ICE);

		Registry.addShapelessRecipe(new ItemStack(ATimeItems.BubbleGum, 1),
				Items.SUGAR, Items.WATER_BUCKET);

		Registry.addVerticleRecipe(ATimeItems.JakeSword, ATimeItems.SteelIngot, Items.STICK,
				Items.STICK);

		Registry.addRecipe(new ItemStack(ATimeItems.Lollipop, 1), " c ", " s ",
				Character.valueOf('c'), ATimeItems.Candy, Character.valueOf('s'),
				Items.STICK);

		Registry.addSmelting(ATimeItems.BubbleGum,
				new ItemStack(ATimeItems.Candy), 0.1f);

/*		Registry.addRecipe(new ItemStack(ModBlocks.CrystalBlock, 1), "ccc", "ccc",
				"ccc", Character.valueOf('c'), ATimeItems.CrystalGem);

		Registry.addSmelting(ModBlocks.SteelOre,
				new ItemStack(ATimeItems.SteelIngot), 0.1f);

		Registry.addSmelting(ModBlocks.DemonOre,
				new ItemStack(ATimeItems.DemonBlood), 0.1f);

		Registry.addSmelting(ModBlocks.CandyOre, new ItemStack(ATimeItems.Candy),
			0.1F);
*/	
		Registry.addRecipe(new ItemStack(ATimeItems.DemonIngot, 1), "ddd", "ddd",
				"ddd", Character.valueOf('d'), ATimeItems.DemonBlood);

		Registry.addShapelessRecipe(new ItemStack(ATimeItems.Flour, 1), Items.WHEAT);

		Registry.addRecipe(new ItemStack(ATimeItems.FourDSword, 1), "ede", "ede",
				"ese", Character.valueOf('e'), Items.ENDER_PEARL,
				Character.valueOf('d'), Items.DIAMOND, Character.valueOf('s'),
				Items.STICK);

		Registry.addRecipe(new ItemStack(ATimeItems.CottonCandy), "sss", "scs",
				" t ", Character.valueOf('s'), Items.STRING,
				Character.valueOf('c'), ATimeItems.Candy, Character.valueOf('t'),
				Items.STICK);

	}

public static void addToolsetRecipe(Object CraftedWith, Item Sword,
			Item Shovel, Item Pickaxe, Item Hoe, Item Axe) {
		Registry.addVerticleRecipe(Sword, CraftedWith, CraftedWith, Items.STICK);
		Registry.addVerticleRecipe(Shovel, CraftedWith, Items.STICK, Items.STICK);
		Registry.addRecipe(new ItemStack(Pickaxe, 1), "111", " 2 ", " 2 ",
				Character.valueOf('1'), CraftedWith, Character.valueOf('2'),
				Items.STICK);
		Registry.addRecipe(new ItemStack(Axe, 1), "ww ", "ws ", " s ",
				Character.valueOf('s'), Items.STICK, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Axe, 1), " ww", " sw", " s ",
				Character.valueOf('s'), Items.STICK, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Hoe, 1), "ww ", " s ", " s ",
				Character.valueOf('s'), Items.STICK, Character.valueOf('w'),
				CraftedWith);
	}

	/**
	 * Add in a vertical recipe. Works with Minecraft Version 1.10.2
	 * 
	 * @author Cyphereion
	 * @param output
	 * @param top
	 * @param mid
	 * @param bottom
	 */
	public static void addVerticleRecipe(Item output, Object top, Object mid,
			Object bottom) {
		if (top instanceof Item || top instanceof Block && mid instanceof Item
				|| mid instanceof Block && bottom instanceof Item
				|| bottom instanceof Item) {
			Registry.addRecipe(new ItemStack(output, 1), " 1 ", " 2 ", " 3 ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "  1", "  2", "  3",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "1  ", "2  ", "3  ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
		} else {
			System.err
					.println("Cannot create a verticle recipe with the following attributes: \n OUTPUT: ("
							+ output.toString()
							+ ") top: ("
							+ top.toString()
							+ ") mid: ("
							+ mid.toString()
							+ ") bottom: ("
							+ bottom.toString() + ")");
		}
	}
}

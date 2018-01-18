package com.router1011.atimemod2.lazymodder.builders;

import java.util.HashMap;
import java.util.Map;

import com.router1011.atimemod2.ATimeMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class RecipeBuilder {
	private ItemStack result;
	private int height = -1;
	private int width = -1;
	private String[] recipeArray;
	private Map<Character, ItemStack> ingredients = new HashMap();
	private String name;
	private boolean isShaped = false;
	private int meta;
	private int amount;

	public RecipeBuilder(Item item) {
		this(new ItemStack(item));
	}
	
	public RecipeBuilder(ItemStack itemStack) {
		this.result = itemStack;
	}

	public RecipeBuilder map(String... recipeArray) {
		this.height = recipeArray.length;
		for (String string : recipeArray) {
			this.width = this.width < string.length() ? string.length() : this.width;
		}
		for (String string : recipeArray) {
			if (this.width != string.length()) {
				StringBuilder sb = new StringBuilder(string);
				do {
					sb.append(' ');
					setShaped(true);
				} while (this.width != string.length());
			}
			for (char c : string.toCharArray()) {
				if(c == ' ')
					setShaped(true);
			}
		}
		this.recipeArray = recipeArray;
		return this;
	}

	public RecipeBuilder where(char key, ItemStack value) {
		ingredients.put(key, value);
		return this;
	}

	public RecipeBuilder where(char key, Item value) {
		ingredients.put(key, new ItemStack(value));
		return this;
	}
	
	public RecipeBuilder where(char key, Block value) {
		ingredients.put(key, new ItemStack(value));
		return this;
	}

	public RecipeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public ItemStack getResult() {
		return result;
	}
	
	public void setResult(ItemStack result) {
		this.result = result;
	}

	public String getName() {
		if (name != null)
			return name;

		StringBuilder name = new StringBuilder();
		int coord = 0;
		for (int i = 0; i < recipeArray.length; i++) {
			String s = recipeArray[i];
			for (int y = 0; y < s.length(); y++) {
				char c = s.charAt(y);
				if (c != ' ') {
					ItemStack stack = ingredients.get(c);
					name.append(stack.getDisplayName() + "[" + stack.getMetadata() + "]");
				} else
					name.append("Empty[0]");
				if (i + 1 < recipeArray.length || y + 1 < s.length())
					name.append(";");

			}
		}
		return name.toString();
	}

	@Override
	public String toString() {
		return getName();
	}
	
	public IRecipe build() {
		return this.build(Groups.NONE);
	}

	public IRecipe build(String group) {
		return isShaped ? buildShaped(group) : buildShapeless(group);
	}

	public IRecipe buildShaped() {
		return this.buildShaped(Groups.NONE);
	}

	public IRecipe buildShaped(String group) {
		ShapedRecipes recipe = new ShapedRecipes(group, width, height, getIngreidentList(), result);
		String modid = Loader.instance().activeModContainer().getModId();
		recipe.setRegistryName(new ResourceLocation(modid, "Shaped{" + getName() + "}"));
		return recipe;
	}

	public IRecipe buildShapeless() {
		return this.buildShapeless(Groups.NONE);
	}

	public IRecipe buildShapeless(String group) {
		ShapelessRecipes recipe = new ShapelessRecipes(group, result, getIngreidentList());
		recipe.setRegistryName(new ResourceLocation(ATimeMod.MODID, "Shapeless{" + getName() + "}"));
		return recipe;
	}

	public NonNullList<Ingredient> getIngreidentList() {
		NonNullList<Ingredient> ingredientList = NonNullList.withSize(height * width, Ingredient.EMPTY);
		int coord = 0;
		for (String s : recipeArray) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c != ' ')
					ingredientList.set(coord, Ingredient.fromStacks(ingredients.get(c)));
				coord++;
			}
		}
		return ingredientList;
	}
	
	public RecipeBuilder setShaped(boolean shaped) {
		this.isShaped = shaped;
		return this;
	}

	public static class Groups {
		public static final String NONE = "";
		public static final String WOOL = "wool";
		public static final String STAINED_HARDENED_CLAY = "stained_hardened_clay";
		public static final String STAINED_GLASS_PANE = "stained_glass_pane";
		public static final String STAINED_GLASS = "stained_glass";
		public static final String YELLOW_DYE = "yellow_dye";
		public static final String CONCRETE_POWDER = "concrete_powder";
		public static final String CARPET = "carpet";
		public static final String DYED_BED = "dyed_bed";
		public static final String BED = "bed";
		public static final String BANNER = "banner";
		public static final String WOODEN_DOOR = "wooden_door";
		public static final String WOODEN_SLAB = "wooden_slab";
		public static final String WOODEN_STAIRS = "wooden_stairs";
		public static final String PLANKS = "planks";
		public static final String WOODEN_FENCE_GATE = "wooden_fence_gate";
		public static final String WOODEN_FENCE = "wooden_fence";
		public static final String boat = "boat";
		public static final String RED_DYE = "red_dye";
		public static final String RABBIT_STEW = "rabbit_stew";
		public static final String PINK_DYE = "pink_dye";
		public static final String ORANGE_DYE = "orange_dye";
		public static final String MAGENTA_DYE = "magenta_dye";
		public static final String LIGHT_GRAY_DYE = "light_gray_dye";
		public static final String LIGHT_BLUE_DYE = "light_blue_dye";
		public static final String IRON_INGOT = "iron_ingot";
		public static final String GOLD_INGOT = "gold_ingot";
		public static final String BONEMEAL = "bonemeal";
	}

}

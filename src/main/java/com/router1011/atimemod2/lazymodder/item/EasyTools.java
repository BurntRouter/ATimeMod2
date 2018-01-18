package com.router1011.atimemod2.lazymodder.item;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.router1011.atimemod2.lazymodder.interfaces.IEasyRegister;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

// ToDo: Add the shove feature to make dirt path.
/**
 * Contains a bunch of quick ways to create tools/weapons, with added/intended
 * support omni-tools
 * 
 * @author Z_Doctor
 */
public abstract class EasyTools implements IEasyRegister {
	/**
	 * @param materialName
	 *            The name of the material
	 * @param harvestLevel
	 *            For pickaxes. Vanilla pickaxes have a value between 0-3 (0 -
	 *            wood/glod, 1 - stone, 2 - iron, 3 - diamond). Higher values
	 *            are acceptable, but you won't be able to harvest them with
	 *            vanilla pickaxes.
	 * @param maxUses
	 *            This value defines how often you can use a tool until it
	 *            breaks. The tools always last one use longer than the entered
	 *            value. Common values for the durability: Wood(59),Stone(131),
	 *            Iron(250), Diamond(1561), Gold(32)
	 * @param efficiency
	 *            The mining speed of the tool. This value defines how much
	 *            faster you are with this tool than with your hand. Common
	 *            values for the mining speed: Without(1.0F), Wood(2.0F),
	 *            Stone(4.0F), Iron(6.0F), Diamond(8.0F), Gold(12.0F)
	 * @param damage
	 *            The damage an entity takes if you hit it. Defines the basic
	 *            damage to which different values are added, depending on the
	 *            tool. A sword always causes 3.0F more damage than written in
	 *            the ToolMaterial. Values can be below zero. Common values for
	 *            the damage versus Entities: Wood(0.0F), Stone(1.0F),
	 *            Iron(2.0F), Diamond(3.0F), Gold(0.0F)
	 * @param enchantability
	 *            Used to calculate enchantments. Common values for the
	 *            enchantability: Wood(15), Stone(5), Iron(14), Diamond(10),
	 *            Gold(22);
	 * @return
	 */
	public static ToolMaterial addMaterial(String materialName, int harvestLevel, int maxUses, int efficiency,
			int damage, int enchantability) {
		return EnumHelper.addToolMaterial(materialName, harvestLevel, maxUses, efficiency, damage, enchantability);
	}

	private static void register(Item tool, String toolName) {
		tool.setRegistryName(toolName);
		tool.setUnlocalizedName(toolName);
		EasyRegistry.register(tool);
	}

	public static class EasyPickaxe extends ItemPickaxe implements IEasyRegister {
		public EasyPickaxe(String toolName, ToolMaterial material) {
			super(material);
			register(this, toolName);
		}

		@Override
		public String getNameFromMeta(int meta) {
			return getRegistryName().getResourcePath();
		}

		@Override
		public int getSubCount() {
			return 1;
		}

		@Override
		public String getRegistryNameForMeta(int meta) {
			return getNameFromMeta(meta);
		}
	}

	public static class EasyAxe extends ItemAxe implements IEasyRegister {
		public EasyAxe(String toolName, ToolMaterial material) {
			super(material);
			register(this, toolName);
		}

		@Override
		public String getNameFromMeta(int meta) {
			// TODO Auto-generated method stub
			return getRegistryName().getResourcePath();
		}

		@Override
		public int getSubCount() {
			return 1;
		}

		@Override
		public String getRegistryNameForMeta(int meta) {
			return getNameFromMeta(meta);
		}
	}

	public static class EasySpade extends ItemSpade implements IEasyRegister {
		public EasySpade(String toolName, ToolMaterial material) {
			super(material);
			register(this, toolName);
		}

		@Override
		public String getNameFromMeta(int meta) {
			// TODO Auto-generated method stub
			return getRegistryName().getResourcePath();
		}

		@Override
		public int getSubCount() {
			return 1;
		}

		@Override
		public String getRegistryNameForMeta(int meta) {
			return getNameFromMeta(meta);
		}
	}

	public static class EasyHoe extends ItemHoe implements IEasyRegister {
		public EasyHoe(String toolName, ToolMaterial material) {
			super(material);
			register(this, toolName);
		}

		@Override
		public String getNameFromMeta(int meta) {
			return getRegistryName().getResourcePath();
		}

		@Override
		public int getSubCount() {
			return 1;
		}

		@Override
		public String getRegistryNameForMeta(int meta) {
			return getNameFromMeta(meta);
		}
	}

	public static class EasyWeapon extends ItemSword implements IEasyRegister {
		private int subTypeCount;

		public EasyWeapon(String toolName, ToolMaterial material) {
			this(toolName, 1, material);
		}

		public EasyWeapon(String toolName, int subTypeCount, ToolMaterial material) {
			super(material);
			this.subTypeCount = subTypeCount;
			if (subTypeCount > 1)
				setHasSubtypes(true);
			register(this, toolName);
		}

		@Override
		public String getNameFromMeta(int meta) {
			return getRegistryName().getResourcePath();
		}

		@Override
		public int getSubCount() {
			return subTypeCount;
		}

		@Override
		public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
			if (this.hasSubtypes) {
				if (this.isInCreativeTab(tab))
					for (int i = 0; i < this.getSubCount(); i++)
						subItems.add(new ItemStack(this, 1, i));
			} else
				super.getSubItems(tab, subItems);
		}

		@Override
		public String getUnlocalizedName(ItemStack par1ItemStack) {
			return "item." + this.getNameFromMeta(par1ItemStack.getItemDamage()).toLowerCase();
		}

		@Override
		public String getRegistryNameForMeta(int meta) {
			return getNameFromMeta(meta);
		}
	}

	public static abstract class EasyHybrid {
		private static Set shovelBlocks = Sets.newHashSet(
				new Block[] { Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM,
						Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH });
		private static Set axeBlocks = Sets.newHashSet(new Block[] { Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG,
				Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER,
				Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE });
		private static Set omniBlocks = Sets.newHashSet(shovelBlocks.toArray(), axeBlocks.toArray());

		public static class EasyPickSpade extends EasyPickaxe {
			public EasyPickSpade(String toolName, ToolMaterial material) {
				super(toolName, material);
			}

			@Override
			public Set<String> getToolClasses(ItemStack stack) {
				return ImmutableSet.of("pickaxe", "shovel");
			}

			@Override
			public boolean canHarvestBlock(IBlockState state) {
				Block block = state.getBlock();
				return block == Blocks.SNOW_LAYER ? true : block == Blocks.SNOW ? true : super.canHarvestBlock(state);
			}

			@Override
			public float getDestroySpeed(ItemStack stack, IBlockState state) {
				return shovelBlocks.contains(state.getBlock()) ? efficiency
						: super.getDestroySpeed(stack, state);
			}

		}

		public static class EasyPickAxe extends EasyPickaxe {
			public EasyPickAxe(String toolName, ToolMaterial material) {
				super(toolName, material);
			}

			@Override
			public Set<String> getToolClasses(ItemStack stack) {
				return ImmutableSet.of("pickaxe", "axe");
			}

			@Override
			public float getDestroySpeed(ItemStack stack, IBlockState state) {
				if (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.VINE
						|| state.getMaterial() == Material.PLANTS)
					return efficiency;
				return omniBlocks.contains(state.getBlock()) ? efficiency
						: super.getDestroySpeed(stack, state);
			}
		}

		public static class EasyAxeSpade extends EasySpade {
			public EasyAxeSpade(String toolName, ToolMaterial material) {
				super(toolName, material);
			}

			@Override
			public Set<String> getToolClasses(ItemStack stack) {
				return ImmutableSet.of("shovel", "axe");
			}

			@Override
			public float getDestroySpeed(ItemStack stack, IBlockState state) {
				if (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.VINE
						|| state.getMaterial() == Material.PLANTS)
					return efficiency;
				return omniBlocks.contains(state.getBlock()) ? efficiency
						: super.getDestroySpeed(stack, state);
			}
		}

		public static class EasyOmniTool extends EasyPickaxe {
			private boolean isHoe;

			public EasyOmniTool(String toolName, ToolMaterial material) {
				this(toolName, material, false);
			}

			public EasyOmniTool(String toolName, ToolMaterial material, boolean isHoe) {
				super(toolName, material);
				this.isHoe = isHoe;
			}

			@Override
			public Set<String> getToolClasses(ItemStack stack) {
				return ImmutableSet.of("shovel", "pickaxe", "axe");
			}

			protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos,
					IBlockState state) {
				worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

				if (!worldIn.isRemote) {
					worldIn.setBlockState(pos, state, 11);
					stack.damageItem(1, player);
				}
			}

			public boolean canHarvestBlock(IBlockState state) {
				return omniBlocks.contains(state.getBlock()) ? true : this.canHarvestBlock(state);
			}

			public float getStrVsBlock(ItemStack stack, IBlockState state) {
				if (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.VINE
						|| state.getMaterial() == Material.PLANTS)
					return efficiency;
				return omniBlocks.contains(state.getBlock()) ? efficiency
						: super.getDestroySpeed(stack, state);
			}

			@SuppressWarnings("incomplete-switch")
			@Override
			public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
					EnumFacing facing, float hitX, float hitY, float hitZ) {
				if (this.isHoe) {
					ItemStack itemstack = player.getHeldItem(hand);

					if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
						return EnumActionResult.FAIL;
					} else {
						int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
						if (hook != 0)
							return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

						IBlockState iblockstate = worldIn.getBlockState(pos);
						Block block = iblockstate.getBlock();

						if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up())) {
							if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
								this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
								return EnumActionResult.SUCCESS;
							}

							if (block == Blocks.DIRT) {
								switch ((BlockDirt.DirtType) iblockstate.getValue(BlockDirt.VARIANT)) {
								case DIRT:
									this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
									return EnumActionResult.SUCCESS;
								case COARSE_DIRT:
									this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState()
											.withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
									return EnumActionResult.SUCCESS;
								}
							}
						}

						return EnumActionResult.PASS;
					}
				}
				return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
			}
		}
	}
}

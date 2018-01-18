package com.router1011.atimemod2.lazymodder.helpers;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A collection of functions that do a variety of useful things.
 * 
 * @author Z_Doctor
 */
public class BlockFinderHelpers {
	/**
	 * A collection of function that deal with scanning around an area to find
	 * specific blocks and if they are covered.
	 * 
	 * @author Z_Doctor
	 */
	public static class Scanners {
		/**
		 * Looks around the specified block pos for a certain block
		 * 
		 * @param block
		 *            - The block being looked for
		 * @param worldIn
		 *            - The world to look in
		 * @param pos
		 *            - The position of the block to look around
		 * @param topIsAir
		 *            - Can the block being looked for be covered
		 */
		public static boolean checkSurrondingsFor(Block block, World worldIn, BlockPos pos, boolean topIsAir) {
			if (lookForABlockAt(block, worldIn, topIsAir, pos.north(), pos.east(), pos.south(), pos.west()))
				return true;
			else if (lookForABlockAt(block, worldIn, topIsAir, pos.north().east(), pos.north().west(), pos.south(),
					pos.south().east(), pos.south().west()))
				return true;
			else
				return false;
		}

		/**
		 * Looks for a certain block at the location(s) given.
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param block
		 *            - The block being looked for
		 * @param topIsAir
		 *            - Can the block be covered
		 * @param pos
		 *            - The position(s) to look in
		 */
		public static boolean lookForABlockAt(Block block, World worldIn, boolean topIsAir, BlockPos... pos) {
			for (BlockPos bp : pos) {
				if (Locators.getAndCompareBlock(worldIn, bp, block))
					if (topIsAir && Locators.getAndCompareBlock(worldIn, bp.up(), Blocks.AIR))
						return true;
					else if (!topIsAir)
						return true;

			}
			return false;
		}

		/**
		 * Changes the blocks within a certain radius to another
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param center
		 *            - The position of the center block
		 * @param block
		 *            - The block to change them to
		 * @param radius
		 *            - Blocks from the center
		 * @param changeCenter
		 *            - Should the center block be changed
		 * @param blockList
		 *            - The blocks to change
		 * @return The number of blocks changed
		 */
		public static int changeBlocksInRadiusTo(World worldIn, BlockPos center, Block block, int radius,
				boolean changeCenter, Block... blockList) {
			ArrayList<BlockPos> posList = scanRadiusFor(worldIn, center, radius, blockList, changeCenter);
			Changers.changeTheseTo(worldIn, block.getDefaultState(), posList);
			return posList.size();
		}

		/**
		 * Scans the radius for a certain block
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param center
		 *            - The position of the center
		 * @param r
		 *            - The radius of the square (from center) to look in
		 * @param blockList
		 *            - The blocks to look for
		 * @param includeCenter
		 *            - Should the center be evaluated
		 * @return A BlockPos list of blocks found
		 */
		public static ArrayList<BlockPos> scanRadiusFor(World worldIn, BlockPos center, int r, Block[] blockList,
				boolean includeCenter) {
			ArrayList<BlockPos> newList = new ArrayList<BlockPos>();
			int d = r * 2 + 1;
			for (int y = d - 1; y >= 0; y--) {
				for (int x = d - 1; x >= 0; x--) {
					BlockPos temp = center.north(y - r).west(x - r);
					if (y - r == 0 && x - r == 0) {
						if (includeCenter)
							newList.add(temp);
					} else if (Checkers.blockInList(Locators.getBlock(worldIn, temp), blockList))
						newList.add(temp);
				}
			}
			return newList;
		}

		/**
		 * Scans the radius for a certain block
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param center
		 *            - The position of the center
		 * @param r1
		 *            - The radius of the square (from north of center) to look
		 *            in
		 * @param r2
		 *            - The radius of the square (from west of center) to look
		 *            in
		 * @param blockList
		 *            - The blocks to look for
		 * @param includeCenter
		 *            - Should the center be evaluated
		 * @return A BlockPos list of blocks found
		 */
		public static ArrayList<BlockPos> scanRadiusFor(World worldIn, BlockPos center, int r1, int r2,
				Block[] blockList, boolean includeCenter) {
			ArrayList<BlockPos> newList = new ArrayList<BlockPos>();
			int d1 = r1 * 2 + 1;
			int d2 = r2 * 2 + 1;
			for (int y = d1 - 1; y >= 0; y--) {
				for (int x = d2 - 1; x >= 0; x--) {
					BlockPos temp = center.north(y - r1).west(x - r2);
					if (y - r1 == 0 && x - r2 == 0) {
						if (includeCenter)
							newList.add(temp);
					} else if (Checkers.blockInList(Locators.getBlock(worldIn, temp), blockList))
						newList.add(temp);
				}
			}
			return newList;
		}
	}

	public static class Locators {
		/**
		 * Gets the block and checks against the block(s) givens
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param pos
		 *            - The position of the block
		 * @param blockList
		 *            - The blocks to look for
		 */
		public static boolean getAndCompareBlock(World worldIn, BlockPos pos, Block... blockList) {
			Block block = getBlock(worldIn, pos);
			for (Block b : blockList) {
				if (block == b)
					return true;
			}
			return false;
		}

		/**
		 * @param worldIn
		 *            - The world to check in
		 * @param pos
		 *            - The position of the block
		 * @return - The block found
		 */
		public static Block getBlock(World worldIn, BlockPos pos) {
			return worldIn.getBlockState(pos).getBlock();
		}

		/**
		 * Checks to see if top block is air
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param posList
		 *            - The position(s) to check
		 */
		public static boolean isCovered(World worldIn, BlockPos... posList) {
			for (BlockPos pos : posList) {
				if (getBlock(worldIn, pos.up()) != Blocks.AIR)
					return false;
			}
			return true;
		}

		/**
		 * @param worldIn
		 * @param pos
		 * @param blockList
		 * @return Whether or not the block at the position is covered by the
		 *         block(s) given
		 */
		public static boolean isCoveredBy(World worldIn, BlockPos pos, Block... blockList) {
			Block temp = getBlock(worldIn, pos.up());
			for (Block block : blockList) {
				if (temp == block)
					return true;
			}
			return false;
		}
	}

	public static class Changers {
		/**
		 * Changes the blocks within a certain radius to another
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param center
		 *            - The position of the center block
		 * @param newState
		 *            - The state to change them to
		 * @param radius
		 *            - Blocks from the center
		 * @param changeCenter
		 *            - Should the center block be changed
		 * @param blockList
		 *            - The blocks to change
		 * @return The number of blocks changed
		 */
		public static int changeBlocksInRadiusTo(World worldIn, BlockPos center, IBlockState newState, int radius,
				boolean changeCenter, Block... blockList) {
			ArrayList<BlockPos> posList = Scanners.scanRadiusFor(worldIn, center, radius, blockList, changeCenter);
			Changers.changeTheseTo(worldIn, newState, posList);
			return posList.size();
		}

		/**
		 * Changes the blocks in the position(s) to the new state
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param posList
		 *            - The position(s)
		 * @param newState
		 *            - The block state to change them to
		 */
		public static void changeTheseTo(World worldIn, IBlockState newState, ArrayList<BlockPos> posList) {
			for (BlockPos bp : posList) {
				worldIn.setBlockState(bp, newState);
			}

		}

		/**
		 * Changes the blocks in the position(s) to the new state
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param posList
		 *            - The position(s)
		 * @param block
		 *            - The block to change them to
		 */
		public static void changeTheseTo(World worldIn, Block block, ArrayList<BlockPos> posList) {
			changeTheseTo(worldIn, block.getDefaultState(), posList);
		}

		/**
		 * Changes the blocks in the position(s) to the new state
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param posList
		 *            - The position(s)
		 * @param block
		 *            - The block to change them to
		 */
		public static void changeTheseTo(World worldIn, Block block, BlockPos... posList) {
			for (BlockPos bp : posList) {
				worldIn.setBlockState(bp, block.getDefaultState());
			}
		}

		/**
		 * Changes the blocks in the position
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param newState
		 *            - The Block State to change them to
		 * @param block
		 *            - The block to change it into
		 */
		public static void changeThisTo(World worldIn, IBlockState newState, BlockPos pos) {
			worldIn.setBlockState(pos, newState);
		}

		/**
		 * Re /** Changes the blocks in the position
		 * 
		 * @param worldIn
		 *            - The world to look in
		 * @param posList
		 *            - The position
		 * @param block
		 *            - The block to change it into
		 */
		public static void changeThisTo(World worldIn, Block block, BlockPos pos) {
			changeThisTo(worldIn, block.getDefaultState(), pos);
		}
		/**
		 * Returns whether the block was found in the list
		 * 
		 * @param block
		 *            - The block to check
		 * @param blockList
		 *            - The list to check against
		 */
	}

	public static class Checkers {
		public static boolean blockInList(Block block, Block... blockList) {
			for (Block b : blockList) {
				if (block == b) {
					return true;
				}
			}
			return false;
		}

		public static int getBlockProperty(World worldIn, BlockPos pos, PropertyInteger property) {
			return (Integer) (worldIn.getBlockState(pos).getValue(property));
		}

		public static void setBlockProperty(World worldIn, BlockPos pos, PropertyInteger property, int value) {
			worldIn.setBlockState(pos, worldIn.getBlockState(pos).withProperty(property, value));
		}
	}
}

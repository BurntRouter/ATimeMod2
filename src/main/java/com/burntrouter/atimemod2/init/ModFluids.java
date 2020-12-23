package com.burntrouter.atimemod2.init;

import com.burntrouter.atimemod2.ATimeMod2;
import com.burntrouter.atimemod2.fluids.FluidGroup;
import com.burntrouter.atimemod2.fluids.StandardFluidGroup;
import com.burntrouter.atimemod2.fluids.StaticFluid;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;

public class ModFluids {
	private static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, ATimeMod2.MODID);
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ATimeMod2.MODID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ATimeMod2.MODID);

	private static boolean isInitialised = false;
	
	public static final FluidGroup<FlowingFluid, FlowingFluid, FlowingFluidBlock, Item> STATIC = new StandardFluidGroup.Builder("juice", FLUIDS, BLOCKS, ITEMS)
			.stillFactory(StaticFluid.Source::new)
			.flowingFactory(StaticFluid.Flowing::new)
			.attributes(
					FluidAttributes.builder(new ResourceLocation(ATimeMod2.MODID, "block/juice_still"), new ResourceLocation(ATimeMod2.MODID, "block/juice_still"))
							.luminosity(10)
							.density(800)
							.viscosity(1500)
			)
			.blockMaterial(ModMaterials.STATIC)
			.build();
	
	/**
	 * Registers the {@link DeferredRegister} instances with the mod event bus.
	 * <p>
	 * This should be called during mod construction.
	 *
	 * @param modEventBus The mod event bus
	 */
	public static void initialise(final IEventBus modEventBus) {
		if (isInitialised) {
			throw new IllegalStateException("Already initialised");
		}

		FLUIDS.register(modEventBus);
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);

		isInitialised = true;
	}

}

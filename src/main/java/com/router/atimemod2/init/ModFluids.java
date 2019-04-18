package com.router.atimemod2.init;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.init.Bootstrap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.IRegistry;

public class ModFluids {
    private static final Set<Fluid> CACHE;
    public static final Fluid EMPTY;
    public static final FlowingFluid FLOWING_JUICE;
    public static final FlowingFluid JUICE;
    private static Fluid getRegisteredFluid(String id) {
        Fluid fluid = IRegistry.field_212619_h.get(new ResourceLocation(id));
        if (!CACHE.add(fluid)) {
            throw new IllegalStateException("Invalid Fluid requested: " + id);
        } else {
            return fluid;
        }
    }

    static {
        if (!Bootstrap.isRegistered()) {
            throw new RuntimeException("Accessed Fluids before Bootstrap!");
        } else {
            CACHE = Sets.newHashSet((Fluid)null);
            EMPTY = getRegisteredFluid("empty");
            FLOWING_JUICE = (FlowingFluid)getRegisteredFluid("flowing_water");
            JUICE = (FlowingFluid)getRegisteredFluid("water");
            CACHE.clear();
        }
    }
}
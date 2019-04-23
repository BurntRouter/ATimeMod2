package com.router.atimemod2.init;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.entity.EntityBMO;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.IRegistry;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ATimeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ATimeMod.MODID)
public class ModEntities<T extends Entity> extends net.minecraftforge.registries.ForgeRegistryEntry<EntityType<?>> {

    public static final EntityType<EntityBMO> BMO = register("bmo", EntityType.Builder.create(EntityBMO.class, EntityBMO::new));

    public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        EntityType<T> entityType = builder.build(id);
        IRegistry.field_212629_r.put(new ResourceLocation(ATimeMod.MODID, id), entityType);
        return entityType;
    }

}
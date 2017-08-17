package com.Router1011.ATimeMod2.Entity;

import com.Router1011.ATimeMod2.ATimeMod;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntites(){
		registerEntity(EntityFinn.class, "finn", 80, 3, false, 0x7AE8FF, 0x47FFE2);
	}
	

	private static int entityID = 0;
	
	/**
	 * Register an entity with the specified tracking values and spawn egg colours.
	 *
	 * @param entityClass          The entity's class
	 * @param entityName           The entity's unique name
	 * @param trackingRange        The range at which MC will send tracking updates
	 * @param updateFrequency      The frequency of tracking updates
	 * @param sendsVelocityUpdates Whether to send velocity information packets as well
	 * @param eggPrimary           The spawn egg's primary (background) colour
	 * @param eggSecondary         The spawn egg's secondary (foreground) colour
	 */
	private static void registerEntity(final Class<? extends Entity> entityClass, final String entityName, final int trackingRange, final int updateFrequency, final boolean sendsVelocityUpdates, final int eggPrimary, final int eggSecondary) {
		final ResourceLocation registryName = new ResourceLocation(ATimeMod.modId, entityName);
		EntityRegistry.registerModEntity(entityClass, registryName.toString(), entityID++, ATimeMod.instance, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);
}
}

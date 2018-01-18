package com.router1011.atimemod2.lazymodder.helpers;

import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHelper {

	public static SoundEvent getSound(String soundName) {
		return getSound(new ResourceLocation(soundName));
	}
	
	public static SoundEvent getSound(ResourceLocation soundRes) {
		return SoundEvent.REGISTRY.getObject(soundRes);
	}
	
	public static SoundEvent getRandomSound(Random random) {
		return SoundEvent.REGISTRY.getRandomObject(random);
	}

}

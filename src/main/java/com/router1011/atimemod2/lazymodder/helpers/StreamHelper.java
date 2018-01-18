package com.router1011.atimemod2.lazymodder.helpers;

import java.io.IOException;
import java.io.InputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class StreamHelper {

	public static InputStream getStream(ResourceLocation resourceLocation) throws IOException {
		return Minecraft.getMinecraft().getResourceManager().getResource(resourceLocation)
				.getInputStream();
	}

}

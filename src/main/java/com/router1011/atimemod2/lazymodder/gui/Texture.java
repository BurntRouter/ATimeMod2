package com.router1011.atimemod2.lazymodder.gui;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.router1011.atimemod2.lazymodder.helpers.StreamHelper;

import net.minecraft.util.ResourceLocation;

public class Texture {

	private int texWidth;
	private int texHeight;
	private ResourceLocation textureLocation;
	private int dimensionWidth;
	private int dimensionHeight;

	public Texture(int texWidth, int texHeight, ResourceLocation textureLocation) {
		this.texWidth = texWidth; this.texHeight = texHeight; this.textureLocation = textureLocation;
		BufferedImage texture;
		try {
			texture = ImageIO.read(StreamHelper.getStream(textureLocation));
			dimensionHeight = texture.getHeight();
			dimensionWidth = texture.getWidth();
		} catch (IOException e) {
			e.printStackTrace();
			dimensionHeight = 255;
			dimensionWidth = 255;
		}
		
	}

	public int getWidth() {
		return texWidth;
	}

	public int getHeight() {
		return texHeight;
	}

	public ResourceLocation getLocation() {
		return textureLocation;
	}

	public int getDimensionHeight() {
		return dimensionHeight;
	}

	public int getDimensionWidth() {
		return dimensionWidth;
	}

}

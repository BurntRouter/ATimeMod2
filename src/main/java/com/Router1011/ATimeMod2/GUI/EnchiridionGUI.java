package com.Router1011.ATimeMod2.GUI;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class EnchiridionGUI extends GuiScreen {

	private static final ResourceLocation bookGuiTextures = new ResourceLocation("atimemod2", "textures/gui/sun.png");

	private final int Dimension = 256;

	public EnchiridionGUI() {

	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
			this.mc.player.closeScreen();
		}
	}

	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(bookGuiTextures);

		int posX = (this.width) / 2;
		int posY = (this.height) / 2;

		drawTexturedModalRect(posX - 100, posY - 100, 0, 0, Dimension, Dimension);

		this.updateScreen();
		super.drawScreen(x, y, f);
	}

	@Override
	public void initGui() {

	}

	@Override
	public void actionPerformed(GuiButton button) {
		switch (button.id) {
		default:
			break;
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	static ResourceLocation func_110404_g() {
		return bookGuiTextures;
	}

}
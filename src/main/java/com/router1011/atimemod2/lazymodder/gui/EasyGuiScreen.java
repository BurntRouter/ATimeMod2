package com.router1011.atimemod2.lazymodder.gui;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EasyGuiScreen extends GuiScreen {
	protected List<GuiTextField> textBoxList = Lists.<GuiTextField>newArrayList();
	
	public EasyGuiScreen() {
	}
	
	public EasyGuiScreen(EntityPlayer player, World world, int x, int y, int z) {
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		textBoxList.forEach(textBox -> {
			textBox.drawTextBox();
		});

		buttonList.forEach(button -> {
			button.drawButton(this.mc, mouseX, mouseY, partialTicks);
		});
		labelList.forEach(label -> {
			label.drawLabel(this.mc, mouseX, mouseY);
		});
	}
	
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		textBoxList.forEach(textBox -> {
			textBox.textboxKeyTyped(typedChar, keyCode);
		});
		
		super.keyTyped(typedChar, keyCode);
	}
	
	@Override
	public void updateScreen() {
		textBoxList.forEach(textBox -> {
			textBox.updateCursorCounter();
		});
		
		super.updateScreen();
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		textBoxList.forEach(textBox -> {
			textBox.mouseClicked(mouseX, mouseY, mouseButton);
		});
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
}

package com.Router1011.ATimeMod2.GUI;

import zdoctor.lazymodder.client.gui.EasyGuiHandler;

public class ATimeGuis {

	public static EasyGuiHandler guiHandler;
	public static int enchiridionID;

	public static void initGuis() {
		guiHandler = new EasyGuiHandler();

		enchiridionID = guiHandler.register(EnchiridionGUI.class);
	}

}

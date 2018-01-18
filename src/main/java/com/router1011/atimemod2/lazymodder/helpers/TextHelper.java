package com.router1011.atimemod2.lazymodder.helpers;

import net.minecraft.client.resources.I18n;

public class TextHelper {
	public static String translateToLocal(String text, Object... params) {
		return I18n.format(text, params);
	}
}

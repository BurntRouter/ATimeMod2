package com.router1011.atimemod2.lazymodder.helpers;


import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyBindingHelper {
	private static ArrayList<EasyKeyBinding> keyBinding = new ArrayList<>();

	public static void registerKeyBinding(KeyBinding keybind) {
		ClientRegistry.registerKeyBinding(keybind);
	}
	
	public static abstract class EasyKeyBinding extends KeyBinding {
		/**
		 * 
		 * @param description
		 * @param keyCode - can be gotten from {@link Keyboard}
		 * @param category
		 */
		public EasyKeyBinding(String description, int keyCode, String category) {
			super(description, keyCode, category);
			keyBinding.add(this);
		}

		public EasyKeyBinding(String description, IKeyConflictContext keyConflictContext, KeyModifier keyModifier,
				int keyCode, String category) {
			super(description, keyConflictContext, keyModifier, keyCode, category);
			keyBinding.add(this);
		}

		public EasyKeyBinding(String description, IKeyConflictContext keyConflictContext, int keyCode,
				String category) {
			super(description, keyConflictContext, keyCode, category);
			keyBinding.add(this);
		}

		public abstract void onPressed();

		public abstract void onKeyDown();
		
	}
	
	@SubscribeEvent
	public void keyEvent(KeyInputEvent e) {
		keyBinding.forEach(keyBinding -> {
			if(keyBinding.isPressed())
				keyBinding.onPressed();
			if(keyBinding.isKeyDown())
				keyBinding.onKeyDown();
		});
	}

}

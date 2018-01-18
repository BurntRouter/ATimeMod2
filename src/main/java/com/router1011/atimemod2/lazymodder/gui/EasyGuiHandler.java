package com.router1011.atimemod2.lazymodder.gui;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import com.router1011.atimemod2.lazymodder.interfaces.IEasyGuiHandler;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * This class is used to create a GuiHandler. GUI IDs are handled internally but
 * can be fetched from the class. Only one GuiHandler per mod. To change your
 * gui based on player position, create a constructor for EntityPlayer player,
 * World world, int x, int y, int z
 */
public class EasyGuiHandler implements IGuiHandler, IEasyGuiHandler {
	// protected static final Map<Mod, EasyGuiHandler> GUI_HANDLERS = new
	// HashMap<>();

	private Object mod;
	List<Class<? extends GuiScreen>> clientGuis = new ArrayList<>();
	List<Class<? extends GuiContainer>> serverGuis = new ArrayList<>();

	public EasyGuiHandler() {
		this.mod = Loader.instance().activeModContainer().getMod();
		EasyRegistry.register(this);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("Attempting to open server gui");
		Class<? extends GuiContainer> serverGui = serverGuis.get(ID);
		if (serverGui == null)
			return null;
		try {
			Constructor<? extends GuiContainer> constructor = serverGui.getConstructor(EntityPlayer.class, World.class,
					Integer.class, Integer.class, Integer.class);
			return constructor.newInstance(player, world, x, y, z);
		} catch (Exception e) {
			try {
				return serverGui.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
				return null;
			}
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("Attempting to open client gui");
		Class<? extends GuiScreen> clientGui = clientGuis.get(ID);
		if (clientGui == null)
			return null;
		try {
			Constructor<? extends GuiScreen> constructor = clientGui.getConstructor(EntityPlayer.class, World.class,
					int.class, int.class, int.class);
			System.out.println("Constructor: " + constructor);
			return constructor.newInstance(player, world, x, y, z);
		} catch (Exception e) {
			try {
				return clientGui.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				e.printStackTrace();
				e1.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Object getMod() {
		return mod;
	}

	@Override
	public EasyGuiHandler getHandler() {
		return this;
	}

	public int register(Class<? extends GuiScreen> client) {
		return register(client, null);
	}

	/**
	 * 
	 * @param clientGui
	 * @param serverGui
	 * @return The id used to call that gui.
	 */
	public int register(Class<? extends GuiScreen> clientGui, Class<? extends GuiContainer> serverGui) {
		int id = clientGuis.size();
		clientGuis.add(clientGui);
		serverGuis.add(serverGui);
		return id;
	}

	public void openPlayerGui(int id, World world, EntityPlayer player, BlockPos pos) {
		if (pos == null)
			pos = player.getPosition();
		player.openGui(mod, id, world, pos.getX(), pos.getY(), pos.getZ());
	}

}

package com.router1011.atimemod2.lazymodder.helpers;

import net.minecraft.util.ResourceLocation;

/**
 * @author Z_Doctor
 * 
 * This class helps path textures from common paths. All names are set to lower regardless of case.
 */
public class TextureLocation extends ResourceLocation {
	public static final String TEX_EXT = ".png";
	public static final String ITEM_TEX = "textures/items";
	public static final String BLOCK_TEX = "textures/blocks";
	public static final String GUI_TEX = "textures/gui";
	public static final String ENTITY_TEX = "textures/entity";
	public static final String MOB_TEX = "textures/entity/mobs";
	
	public TextureLocation(String resourcePathIn) {
		this("minecraft", resourcePathIn);
	}
	
	public TextureLocation(String resourceDomainIn, String resourcePathIn) {
		super(resourceDomainIn.toLowerCase(), resourcePathIn.toLowerCase());
	}

	public static class BlockTextureLocation extends TextureLocation {
		public BlockTextureLocation(String resourcePathIn) {
			super(updateBlockPath(resourcePathIn));
		}

		public BlockTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateBlockPath(resourcePathIn));
		}
	}
	
	public static class ItemTextureLocation extends TextureLocation {
		public ItemTextureLocation(String resourcePathIn) {
			super(updateItemPath(resourcePathIn));
		}

		public ItemTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateItemPath(resourcePathIn));
		}
	}
	
	public static class GUITextureLocation extends TextureLocation {
		public GUITextureLocation(String resourcePathIn) {
			super(updateItemPath(resourcePathIn));
		}

		public GUITextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateGUIPath(resourcePathIn));
		}
	}
	
	public static class MobTextureLocation extends TextureLocation {
		public MobTextureLocation(String resourcePathIn) {
			super(updateMobPath(resourcePathIn));
		}

		public MobTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateMobPath(resourcePathIn));
		}
	}
	
	public static class EntityTextureLocation extends TextureLocation {
		public EntityTextureLocation(String resourcePathIn) {
			super(updateMobPath(resourcePathIn));
		}

		public EntityTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateEntityPath(resourcePathIn));
		}
	}
	
	public static String updateBlockPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(BLOCK_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateItemPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(ITEM_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateGUIPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(GUI_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateMobPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(MOB_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateEntityPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(ENTITY_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
}

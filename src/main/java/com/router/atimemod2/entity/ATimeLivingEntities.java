package com.router.atimemod2.entity;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.render.living.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ATimeLivingEntities {

	public static void initEntity() {
		int id = 1;
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_billy"), EntityBilly.class, "entity_billy", id++, ATimeMod.instance, 64, 3, true, 0x89E1F2, 0xFFFFFF);
		EntityRegistry.addSpawn(EntityBilly.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		LootTableList.register(EntityBilly.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_bmo"), EntityBMO.class, "entity_bmo", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityBMO.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityBMO.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_finn"), EntityFinn.class, "entity_finn", id++, ATimeMod.instance, 64, 3, true, 0x00FFFF, 0x7C6D3F);
		EntityRegistry.addSpawn(EntityFinn.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		LootTableList.register(EntityFinn.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_fp"), EntityFP.class, "entity_fp", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityFP.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_gunter"), EntityGunter.class, "entity_gunter", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityGunter.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_iceking"), EntityIceKing.class, "entity_iceking", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityIceKing.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_jake"), EntityJake.class, "entity_jake", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityJake.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_lich"), EntityLich.class, "entity_lich", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityLich.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		//TODO Fix LSP she's gorked as hell
//		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_lsp"), EntityLSP.class, "entity_lsp", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
//		EntityRegistry.addSpawn(EntityLSP.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
//		LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_marceline"), EntityMarceline.class, "entity_marceline", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityMarceline.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_neptr"), EntityNEPTR.class, "entity_neptr", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityNEPTR.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_pb"), EntityPB.class, "entity_pb", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityPB.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_peppermintzombie"), EntityPeppermintZombie.class, "entity_peppermintzombie", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
		EntityRegistry.addSpawn(EntityPeppermintZombie.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		//LootTableList.register(EntityFP.LOOT);
		
		//TODO Figure out where the hell her texture went
//		EntityRegistry.registerModEntity(new ResourceLocation(ATimeMod.MODID, "entity_treetrunks"), EntityTreeTrunks.class, "entity_treetrunks", id++, ATimeMod.instance, 64, 3, true, 0x999999, 0x000000);
//		EntityRegistry.addSpawn(EntityTreeTrunks.class, 1, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
//		LootTableList.register(EntityFP.LOOT);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModel() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class, RenderBilly.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBMO.class, RenderBMO.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class, RenderFinn.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityFP.class, RenderFP.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityGunter.class, RenderGunter.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityIceKing.class, RenderIceKing.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityJake.class, RenderJake.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityLich.class, RenderLich.FACTORY);
//		RenderingRegistry.registerEntityRenderingHandler(EntityLSP.class, RenderLSP.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMarceline.class, RenderMarceline.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityNEPTR.class, RenderNEPTR.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityPB.class, RenderPB.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityPeppermintZombie.class, RenderPeppermintZombie.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityTreeTrunks.class, RenderTreeTrunks.FACTORY);
	}

}
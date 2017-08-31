package com.router1011.atimemod2.entity;

import com.router1011.atimemod2.render.living.RenderBMO;
import com.router1011.atimemod2.render.living.RenderBilly;
import com.router1011.atimemod2.render.living.RenderFP;
import com.router1011.atimemod2.render.living.RenderFinn;
import com.router1011.atimemod2.render.living.RenderGunter;
import com.router1011.atimemod2.render.living.RenderIceKing;
import com.router1011.atimemod2.render.living.RenderJake;
import com.router1011.atimemod2.render.living.RenderLich;
import com.router1011.atimemod2.render.living.RenderMarceline;
import com.router1011.atimemod2.render.living.RenderNEPTR;
import com.router1011.atimemod2.render.living.RenderPB;

//github.com/BurntRouter/ATimeMod2.git

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zdoctor.lazymodder.easy.entity.living.EasyLivingEntity;
import zdoctor.lazymodder.easy.registry.EasyRegistry;

public class ATimeLivingEntities {

	private static EasyLivingEntity finn;
	private static EasyLivingEntity jake;
	private static EasyLivingEntity bmo;
	private static EasyLivingEntity pb;
	private static EasyLivingEntity fp;
	private static EasyLivingEntity billy;
	private static EasyLivingEntity gunter;
	private static EasyLivingEntity iceKing;
	private static EasyLivingEntity lich;
	private static EasyLivingEntity marceline;
	private static EasyLivingEntity neptr;

	public static void initLivingEntites() {
		finn = new EasyLivingEntity(EntityFinn.class, "Finn", 0, 0);
		jake = new EasyLivingEntity(EntityJake.class, "Jake", 0, 0);
		bmo = new EasyLivingEntity(EntityBMO.class, "BMO", 0, 0);
		pb = new EasyLivingEntity(EntityPB.class, "PB", 0, 0);
		fp = new EasyLivingEntity(EntityFP.class, "FP", 0, 0);
		billy = new EasyLivingEntity(EntityBilly.class, "Billy", 0, 0);
		gunter = new EasyLivingEntity(EntityGunter.class, "Gunter", 0, 0);
		iceKing = new EasyLivingEntity(EntityIceKing.class, "IceKing", 0, 0);
		lich = new EasyLivingEntity(EntityLich.class, "Lich", 0, 0);
		// new EasyLivingEntity(EntityLSP.class, RenderLSP.class, "LSP", 0, 0);
		marceline = new EasyLivingEntity(EntityMarceline.class, "Marceline", 0, 0);
		neptr = new EasyLivingEntity(EntityNEPTR.class, "NEPTR", 0, 0);
		// new EasyLivingEntity(EntityPepermintZombie.class,
		// RenderPepermintZombie.class, "PepermintZombie", 0, 0);
		// new EasyLivingEntity(EntityTreeTrunks.class, RenderTreeTrunks.class,
		// "TreeTrunks", 0, 0);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		EasyRegistry.registerLivingEntityRenderer(finn, RenderFinn.class);
		EasyRegistry.registerLivingEntityRenderer(jake, RenderJake.class);
		EasyRegistry.registerLivingEntityRenderer(bmo, RenderBMO.class);
		EasyRegistry.registerLivingEntityRenderer(pb, RenderPB.class);
		EasyRegistry.registerLivingEntityRenderer(fp, RenderFP.class);
		EasyRegistry.registerLivingEntityRenderer(billy, RenderBilly.class);
		EasyRegistry.registerLivingEntityRenderer(gunter, RenderGunter.class);
		EasyRegistry.registerLivingEntityRenderer(iceKing, RenderIceKing.class);
		EasyRegistry.registerLivingEntityRenderer(lich, RenderLich.class);
		EasyRegistry.registerLivingEntityRenderer(marceline, RenderMarceline.class);
		EasyRegistry.registerLivingEntityRenderer(neptr, RenderNEPTR.class);
	}

}
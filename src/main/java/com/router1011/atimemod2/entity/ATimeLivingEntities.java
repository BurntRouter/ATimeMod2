package com.router1011.atimemod2.entity;

<<<<<<< HEAD
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
import com.router1011.atimemod2.lazymodder.entity.EasyLivingEntity;
import com.router1011.atimemod2.lazymodder.registry.EasyRegistry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
=======
import zdoctor.lazymodder.easy.entity.living.EasyEntityLiving;
>>>>>>> 24d8763936e2c1a3b74ab23d2a31d0bddb73d488

public class ATimeLivingEntities {

	private static EasyEntityLiving finn;
	private static EasyEntityLiving jake;
	private static EasyEntityLiving bmo;
	private static EasyEntityLiving pb;
	private static EasyEntityLiving fp;
	private static EasyEntityLiving billy;
	private static EasyEntityLiving gunter;
	private static EasyEntityLiving iceKing;
	private static EasyEntityLiving lich;
	private static EasyEntityLiving marceline;
	private static EasyEntityLiving neptr;

	public static void initLivingEntites() {
<<<<<<< HEAD
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
		EasyRegistry.register(RenderFinn.class);
		EasyRegistry.register(RenderJake.class);
		EasyRegistry.register(RenderBMO.class);
		EasyRegistry.register(RenderPB.class);
		EasyRegistry.register(RenderFP.class);
		EasyRegistry.register(RenderBilly.class);
		EasyRegistry.register(RenderGunter.class);
		EasyRegistry.register(RenderIceKing.class);
		EasyRegistry.register(RenderLich.class);
		EasyRegistry.register(RenderMarceline.class);
		EasyRegistry.register(RenderNEPTR.class);
=======
		finn = new EasyEntityLiving("Finn", EntityFinn.class, 0, 0);
		jake = new EasyEntityLiving("Jake", EntityJake.class, 0, 0);
		bmo = new EasyEntityLiving("BMO", EntityBMO.class, 0, 0);
		pb = new EasyEntityLiving("PB", EntityPB.class, 0, 0);
		fp = new EasyEntityLiving("FP", EntityFP.class, 0, 0);
		billy = new EasyEntityLiving("Billy", EntityBilly.class, 0, 0);
		gunter = new EasyEntityLiving("Gunter", EntityGunter.class, 0, 0);
		iceKing = new EasyEntityLiving("IceKing", EntityIceKing.class, 0, 0);
		lich = new EasyEntityLiving("Lich", EntityLich.class, 0, 0);
		marceline = new EasyEntityLiving("Marceline", EntityMarceline.class, 0, 0);
		neptr = new EasyEntityLiving("NEPTR", EntityNEPTR.class, 0, 0);
>>>>>>> 24d8763936e2c1a3b74ab23d2a31d0bddb73d488
	}


}
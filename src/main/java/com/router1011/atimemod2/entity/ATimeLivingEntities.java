package com.router1011.atimemod2.entity;

import zdoctor.lazymodder.easy.entity.living.EasyEntityLiving;

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
	}

}
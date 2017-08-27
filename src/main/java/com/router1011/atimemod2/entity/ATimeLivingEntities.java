package com.router1011.atimemod2.entity;

import com.router1011.atimemod2.render.living.RenderBMO;
import com.router1011.atimemod2.render.living.RenderBilly;
import com.router1011.atimemod2.render.living.RenderFP;
import com.router1011.atimemod2.render.living.RenderFinn;
import com.router1011.atimemod2.render.living.RenderGunter;
import com.router1011.atimemod2.render.living.RenderIceKing;
import com.router1011.atimemod2.render.living.RenderJake;
import com.router1011.atimemod2.render.living.RenderLSP;
import com.router1011.atimemod2.render.living.RenderLich;
import com.router1011.atimemod2.render.living.RenderMarceline;
import com.router1011.atimemod2.render.living.RenderNEPTR;
import com.router1011.atimemod2.render.living.RenderPB;
import com.router1011.atimemod2.render.living.RenderPepermintZombie;
import com.router1011.atimemod2.render.living.RenderTreeTrunks;

import zdoctor.lazymodder.easy.entity.living.EasyLivingEntity;

public class ATimeLivingEntities {

	public static void initLivingEntites() {
		new EasyLivingEntity(EntityFinn.class, RenderFinn.class, "Finn", 0, 0);
		new EasyLivingEntity(EntityJake.class, RenderJake.class, "Jake", 0, 0);
		new EasyLivingEntity(EntityBMO.class, RenderBMO.class, "BMO", 0, 0);
		new EasyLivingEntity(EntityPB.class, RenderPB.class, "PB", 0, 0);
		new EasyLivingEntity(EntityFP.class, RenderFP.class, "FP", 0, 0);
		new EasyLivingEntity(EntityBilly.class, RenderBilly.class, "Billy", 0, 0);
		new EasyLivingEntity(EntityGunter.class, RenderGunter.class, "Gunter", 0, 0);
		new EasyLivingEntity(EntityIceKing.class, RenderIceKing.class, "IceKing", 0, 0);
		new EasyLivingEntity(EntityLich.class, RenderLich.class, "Lich", 0, 0);
		new EasyLivingEntity(EntityLSP.class, RenderLSP.class, "LSP", 0, 0);
		new EasyLivingEntity(EntityMarceline.class, RenderMarceline.class, "Marceline", 0, 0);
		new EasyLivingEntity(EntityNEPTR.class, RenderNEPTR.class, "NEPTR", 0, 0);
		new EasyLivingEntity(EntityPepermintZombie.class, RenderPepermintZombie.class, "PepermintZombie", 0, 0);
		new EasyLivingEntity(EntityTreeTrunks.class, RenderTreeTrunks.class, "TreeTrunks", 0, 0);
	}

}
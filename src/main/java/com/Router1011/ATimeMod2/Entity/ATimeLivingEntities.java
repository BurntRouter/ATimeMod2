package com.Router1011.ATimeMod2.Entity;

import com.Router1011.ATimeMod2.Render.RenderBMO;
import com.Router1011.ATimeMod2.Render.RenderFP;
import com.Router1011.ATimeMod2.Render.RenderFinn;
import com.Router1011.ATimeMod2.Render.RenderJake;
import com.Router1011.ATimeMod2.Render.RenderPB;

import zdoctor.lazymodder.easy.entity.living.EasyLivingEntity;

public class ATimeLivingEntities {

	public static void initLivingEntites() {
		new EasyLivingEntity(EntityFinn.class, RenderFinn.class, "Finn", 0, 0);
		new EasyLivingEntity(EntityJake.class, RenderJake.class, "Jake", 0, 0);
		new EasyLivingEntity(EntityBMO.class, RenderBMO.class, "BMO", 0, 0);
		new EasyLivingEntity(EntityPB.class, RenderPB.class, "PB", 0, 0);
		new EasyLivingEntity(EntityFP.class, RenderFP.class, "FP", 0, 0);
	}

}
package com.burntrouter.atimemod2.entity;

import com.burntrouter.atimemod2.entity.ai.DemonAttackGoal;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class DemonEntity extends MonsterEntity {
	private static final DataParameter<Boolean> WET = EntityDataManager.createKey(DemonEntity.class, DataSerializers.BOOLEAN);

	public DemonEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	   protected void registerData() {
		      super.registerData();
		      this.getDataManager().register(WET, false);
		   }

	protected void registerGoals() {
		this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
		this.applyEntityAI();
	}
	
	   protected void applyEntityAI() {
		      this.goalSelector.addGoal(2, new DemonAttackGoal(this, 1.0D, false));
		      this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setCallsForHelp(DemonEntity.class));
		      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
		   }
	   
	   public void tick() {
		            if (this.inWater) {
		            	this.getDataManager().set(WET, true);
		            }

		      super.tick();
		   }
	   
	   public void livingTick() {
		      if (this.isAlive()) {
		            if (this.isWet()) {
		               this.damageEntity(null, 10.0F);;
		            }
		      }

		      super.livingTick();
		   }
	   
	   public DemonEntity(World worldIn) {
		      this(EntityType.ZOMBIE, worldIn);
		   }
	   
	   public boolean isWet() {
		      return this.getDataManager().get(WET);
		   }
	   
	   public boolean attackEntityFrom(DamageSource source, float amount) {
		      if (!super.attackEntityFrom(source, amount)) {
		         return false;
		      } else if (!(this.world instanceof ServerWorld)) {
		         return false;
		      } else {
		         ServerWorld serverworld = (ServerWorld)this.world;
		         LivingEntity livingentity = this.getAttackTarget();
		         if (livingentity == null && source.getTrueSource() instanceof LivingEntity) {
		            livingentity = (LivingEntity)source.getTrueSource();
		         }

		            int i = MathHelper.floor(this.getPosX());
		            int j = MathHelper.floor(this.getPosY());
		            int k = MathHelper.floor(this.getPosZ());

		            for(int l = 0; l < 50; ++l) {
		               int i1 = i + MathHelper.nextInt(this.rand, 7, 40) * MathHelper.nextInt(this.rand, -1, 1);
		               int j1 = j + MathHelper.nextInt(this.rand, 7, 40) * MathHelper.nextInt(this.rand, -1, 1);
		               int k1 = k + MathHelper.nextInt(this.rand, 7, 40) * MathHelper.nextInt(this.rand, -1, 1);
		               BlockPos blockpos = new BlockPos(i1, j1, k1);
		               EntityType<?> entitytype = this.getType();
		                  this.setPosition((double)i1, (double)j1, (double)k1);
		                  if (!this.world.isPlayerWithin((double)i1, (double)j1, (double)k1, 7.0D) && this.world.checkNoEntityCollision(this) && this.world.hasNoCollisions(this) && !this.world.containsAnyLiquid(this.getBoundingBox())) {
		                     if (livingentity != null)
		                     this.setAttackTarget(livingentity);
		                     break;
		                  }
		               }

		         return true;
		      }
		   }

		   public boolean attackEntityAsMob(Entity entityIn) {
		      boolean flag = super.attackEntityAsMob(entityIn);
		      if (flag) {
		         float f = this.world.getDifficultyForLocation(this.getPosition()).getAdditionalDifficulty();
		      }

		      return flag;
		   }

}

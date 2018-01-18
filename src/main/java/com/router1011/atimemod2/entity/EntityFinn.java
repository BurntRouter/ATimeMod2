package com.router1011.atimemod2.entity;

import com.router1011.atimemod2.items.ATimeItems;
import com.router1011.atimemod2.render.living.RenderFinn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerInteract;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import com.router1011.atimemod2.lazymodder.interfaces.IRenderLiving;

public class EntityFinn extends EntityCreature implements IRenderLiving {
	private int conversionTime = 0;
	public String npcName;

	public EntityFinn(World var1) {
		super(var1);
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		// TODO Add a trading mechnic to finn and firends
		// this.tasks.addTask(1, new EntityAITradePlayer(this));
		// this.tasks.addTask(1, new EntityAILookAtTradePlayer(this));
		// this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));

		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, true));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityVillager.class, 3.0F, 0.02F));
		this.tasks.addTask(9, new EntityAIWanderAvoidWater(this, 0.6D));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));

		this.tasks.addTask(33, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(31, new EntityAILookIdle(this));
		this.tasks.addTask(35, new EntityAIMoveIndoors(this));
		this.tasks.addTask(36, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(43, new EntityAIOpenDoor(this, true));

	}

	protected void applyEntityAI() {

		// TODO Make it so Finn can call his friends for help with fighting or
		// something
		// this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new
		// Class[] {}));
		this.targetTasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
	}

	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		// TODO Determine if he should spawn with gear
		// super.setEquipmentBasedOnDifficulty(difficulty);
		ItemStack weapon = new ItemStack(ATimeItems.Scarlet);
		
		
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, weapon);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.50D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public boolean attackEntityAsMob(Entity par1Entity) {
		// TODO Perhaps change this
		boolean flag = super.attackEntityAsMob(par1Entity);

		return flag;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	public Class<? extends RenderLiving> getLivingRenderer() {
		return RenderFinn.class;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
		// TODO Auto-generated method stub
		return super.getHurtSound(p_184601_1_);
	}

	@Override
	protected SoundEvent getDeathSound() {
		return null;
	}

	/**
	 * Plays step sound at given x, y, z for the entity
	 */
	protected void playStepSound(int var1, int var2, int var3, int var4) {
		// TODO add some type of step sound i guess
		this.playSound(null, 1, 1);
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound() {
		return null;
	}

}
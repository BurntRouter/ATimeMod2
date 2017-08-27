package com.router1011.atimemod2.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityGunter extends EntityCreature {
	private int conversionTime = 0;
	public String npcName;

	public EntityGunter(World var1) {
		super(var1);
		this.tasks.addTask(33, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(32, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(31, new EntityAILookIdle(this));
		this.tasks.addTask(35, new EntityAIMoveIndoors(this));
		this.tasks.addTask(36, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(43, new EntityAIOpenDoor(this, true));
		// this.tasks.addTask(16, new EntityAIAttackMelee(EntityZombie.class,
		// 1.0D, true));

		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	/**
	 * Determines if an entity can be despawned, used on idle far away entities
	 */
	protected boolean canDespawn() {
		return false;
	}

	protected void entityInit() {
		super.entityInit();
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.50D);
	}

	public float getMobMaxHealth() {
		return 40.0F;
	}

	public float getMobMaxSpeed() {
		return 1.25F;
	}

	public boolean attackEntityAsMob(Entity par1Entity) {
		boolean flag = super.attackEntityAsMob(par1Entity);

		// par1Entity.setFire(8);

		return flag;
	}

	/**
	 * Returns the current armor value as determined by a call to
	 * InventoryPlayer.getTotalArmorValue
	 */
	public int getTotalArmorValue() {
		int var1 = super.getTotalArmorValue() + 2;

		if (var1 > 20) {
			var1 = 20;
		}

		return var1;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled() {
		return true;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound() {
		return null;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected SoundEvent getHurtSound() {
		return null;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected SoundEvent getDeathSound() {
		return null;
	}

	/**
	 * Plays step sound at given x, y, z for the entity
	 */
	protected void playStepSound(int var1, int var2, int var3, int var4) {
		this.playSound(null, 1, 1);
	}

}
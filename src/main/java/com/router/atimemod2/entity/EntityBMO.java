package com.router.atimemod2.entity;

import com.router.atimemod2.ATimeMod;
import com.router.atimemod2.init.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorldReaderBase;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBMO extends ATEntity {

    private static final ResourceLocation field_200608_bC = new ResourceLocation(ATimeMod.MODID, "bmo");

    public EntityBMO(World world) {
        super(ModEntities.BMO, world);
        this.setSize(0.5F, 0.5F);
    }
    @Override
    protected void initEntityAI(){
        this.tasks.addTask(33, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(32, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(31, new EntityAILookIdle(this));
        this.tasks.addTask(35, new EntityAIMoveIndoors(this));
        this.tasks.addTask(36, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(43, new EntityAIOpenDoor(this, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }

    public void updateAITasks() {
        if (this.getMoveHelper().isUpdating()) {
            double d0 = this.getMoveHelper().getSpeed();
            if (d0 == 0.6D) {
                this.setSneaking(true);
                this.setSprinting(false);
            } else if (d0 == 1.33D) {
                this.setSneaking(false);
                this.setSprinting(true);
            } else {
                this.setSneaking(false);
                this.setSprinting(false);
            }
        } else {
            this.setSneaking(false);
            this.setSprinting(false);
        }

    }

    public boolean canDespawn() {

        return false;
    }

    protected void entityInit() {

        super.initEntityAI();
    }

    @Override
    public float getEyeHeight() {
        return this.height;
    }

    protected void registerData() {
        super.registerData();
    }

    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }


    public boolean attackEntityAsMob(Entity par1Entity) {
        boolean flag = super.attackEntityAsMob(par1Entity);

        // par1Entity.setFire(8);

        return flag;
    }

    public void writeAdditional(NBTTagCompound compound) {
        super.writeAdditional(compound);
    }

    public void readAdditional(NBTTagCompound compound) {
        super.readAdditional(compound);
    }

    public boolean isNotColliding(IWorldReaderBase worldIn) {
        if (worldIn.checkNoEntityCollision(this, this.getBoundingBox())
                && worldIn.isCollisionBoxesEmpty(this, this.getBoundingBox())
                && !worldIn.containsAnyLiquid(this.getBoundingBox())) {
            BlockPos blockpos = new BlockPos(this.posX, this.getBoundingBox().minY, this.posZ);
            if (blockpos.getY() < worldIn.getSeaLevel()) {
                return false;
            }

            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());
            Block block = iblockstate.getBlock();
            if (block == Blocks.GRASS_BLOCK || iblockstate.isIn(BlockTags.LEAVES)) {
                return true;
            }
        }

        return false;
    }


    protected SoundEvent getDeathSound() {

        return null;
    }

    @Override
    public void baseTick(){
        super.baseTick();
        this.world.profiler.startSection("mobBaseTick");
    }

    @Nullable
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData entityLivingData,
                                            @Nullable NBTTagCompound itemNbt) {
        entityLivingData = super.onInitialSpawn(difficulty, entityLivingData, itemNbt);
        if (this.world.rand.nextInt(7) == 0) {
            for (int i = 0; i < 2; ++i) {
                EntityBMO entityBMO = new EntityBMO(this.world);
                entityBMO.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
                this.world.spawnEntity(entityBMO);
            }
        }

        return entityLivingData;
    }
}
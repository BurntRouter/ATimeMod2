package com.burntrouter.atimemod2.entity.ai;

import com.burntrouter.atimemod2.entity.DemonEntity;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;

public class DemonAttackGoal extends MeleeAttackGoal {
   private final DemonEntity demon;
   private int raiseArmTicks;

   public DemonAttackGoal(DemonEntity demonIn, double speedIn, boolean longMemoryIn) {
      super(demonIn, speedIn, longMemoryIn);
      this.demon = demonIn;
   }

   /**
    * Execute a one shot task or start executing a continuous task
    */
   public void startExecuting() {
      super.startExecuting();
      this.raiseArmTicks = 0;
   }

   /**
    * Reset the task's internal state. Called when this task is interrupted by another one
    */
   public void resetTask() {
      super.resetTask();
      this.demon.setAggroed(false);
   }

   /**
    * Keep ticking a continuous task that has already been started
    */
   public void tick() {
      super.tick();
      ++this.raiseArmTicks;
      if (this.raiseArmTicks >= 5 && this.func_234041_j_() < this.func_234042_k_() / 2) {
         this.demon.setAggroed(true);
      } else {
         this.demon.setAggroed(false);
      }

   }
}

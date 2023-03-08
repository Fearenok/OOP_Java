package HW1.ShooterClass;

import HW1.BaseHero;

/**
 * Это класс стрелков
 */

public class ShooterClass extends BaseHero {

   /**
    * энергия
    */
   protected int energy;
   /**
    * ловкость
    */
   protected int dexterity;

   public ShooterClass(String name, int hp, int maxHp, int speed, int energy, int dexterity) {
      super(name, hp, maxHp, speed);
      this.energy = energy;
      this.dexterity = dexterity;
   }

}
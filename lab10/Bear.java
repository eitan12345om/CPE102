public class Bear implements TotemPole {

   // Instance Variable
   TotemPole rest;

   // Constructor
   public Bear(TotemPole rest) {
      this.rest = rest;
   }

   // Methods
   public int power() {
      return 5 + rest.power();
   }

   public int height() {
      return 1 + rest.height();
   }

   public boolean chiefPole(int bearCount) {
      if (bearCount + 1 >= 3) {
         return true;
      } else {
         return rest.chiefPole(bearCount + 1);
      }
   }
}
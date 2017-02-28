public class Snake implements TotemPole {

   // Instance Variable
   TotemPole rest;

   // Constructor
   public Snake(TotemPole rest) {
      this.rest = rest;
   }

   // Methods
   public int power() {
      return 3 + rest.power();
   }

   public int height() {
      return 1 + rest.height();
   }

   public boolean chiefPole(int bearCount) {
      return rest.chiefPole(0);
   }
}
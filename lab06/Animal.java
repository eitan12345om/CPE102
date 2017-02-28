public class Animal {

   private int num_legs;

   public Animal(int num_legs) {
      this.num_legs = num_legs;
   }

   @Override
   public boolean equals(Object other) {
      if (other == null) {
         return false;
      }
      if (this.getClass() != other.getClass()) {
         return false;
      }
      Animal otter = (Animal)other;
      if (this.num_legs != otter.num_legs) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return ("I am an Animal object with " + num_legs + " legs");
   }
}

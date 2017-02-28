public class Person extends Animal {

   private String name;

   public Person(int num_legs, String name) {
      super(num_legs);
      this.name = name;
   }
   
   @Override
   public boolean equals(Object other) {
      if (!super.equals(other)) {
         return false;
      }
      Person otter = (Person)other;
      if (this.name != otter.name) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return (super.toString() + " and a Person object whose name is " + name);
   }
}

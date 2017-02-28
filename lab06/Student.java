public class Student extends Person {

   private double gpa;

   public Student(int num_legs, String name, double gpa) {
      super(num_legs, name);
      this.gpa = gpa;
   }

   @Override
   public boolean equals(Object other) {
      if (!super.equals(other)) {
         return false;
      }
      Student otter = (Student)other;
      if (this.gpa != otter.gpa) {
         return false;
      }
      return true;
   }
   
   @Override
   public String toString() {
      return (super.toString() + " and a Student Object with a " + gpa + " gpa");
   }
}

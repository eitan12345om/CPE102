public class CircleTest {

   public static void main(String[] args) {
      try {
         Circle c1 = new Circle(-5);
	 System.out.println(c1);
      }
      catch(ZeroRadiusException e) {
         System.out.println(e.getMessage());
      }
      // catch(NegativeRadiusException e) {
         // System.out.println(e.getMessage() + ": " + e.getRadius());
      // }
   }
}

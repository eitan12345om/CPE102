public class TestCartesianPoint
{
   public static void main(String[] args)
   {
      // test methods
      testConstructor(); 
      testRadius();
      testAngle();
      testDistanceFrom();
      testRotate90();

      // results
      System.out.println("\nTests: " + SUnit.testsRun());
      System.out.println("Failures: " + SUnit.testsFailed());

      if (SUnit.testsFailed() == 0) {
         System.out.println("\nPASSED ALL TESTS!!!");
      }
   }

   private static void testConstructor() {
      int fails = SUnit.testsFailed();

      System.out.println("Testing constructor...");
      CartesianPoint cp = new CartesianPoint(2.1, 4.7);
      SUnit.assertEquals(2.1, cp.xCoordinate(), .000001);
      SUnit.assertEquals(4.7, cp.yCoordinate(), .000001);

      if (fails == SUnit.testsFailed()) {
         System.out.println("     PASS");
      }
   }
   
   private static void testRadius() {
      int fails = SUnit.testsFailed();

      System.out.println("Testing radius...");
      CartesianPoint cp = new CartesianPoint(Math.sqrt(2.0),Math.sqrt(2.0));
      SUnit.assertEquals(2.0, cp.radius(), .00001);
      if (fails == SUnit.testsFailed()) {
         System.out.println("     PASS");
      }
   }

   private static void testAngle() {
      int fails = SUnit.testsFailed();

      System.out.println("Testing angle...");
      CartesianPoint cp = new CartesianPoint(4, 4);
      CartesianPoint cp2 = new CartesianPoint(-4, 4);
      CartesianPoint cp3 = new CartesianPoint(-4, -4);
      CartesianPoint cp4 = new CartesianPoint(4, -4);
      SUnit.assertEquals(Math.PI *.25, cp.angle(), .00001);
      SUnit.assertEquals(Math.PI *.75, cp2.angle(), .00001);
      SUnit.assertEquals(-Math.PI *.75, cp3.angle(), .00001);
      SUnit.assertEquals(-Math.PI *.25, cp4.angle(), .00001);
      
      if (fails == SUnit.testsFailed()) {
         System.out.println("     PASS");
      }
   } 
   
   private static void testDistanceFrom() {
      int fails = SUnit.testsFailed();

      System.out.println("Testing distanceFrom...");
      CartesianPoint cp = new CartesianPoint(4, 4);
      CartesianPoint cp2 = new CartesianPoint(1, 3);
      SUnit.assertEquals(cp.distanceFrom(cp2), Math.sqrt(10), .00001);
      if (fails == SUnit.testsFailed()) {
         System.out.println("     PASS");
      }
   }
   
   private static void testRotate90() {
      int fails = SUnit.testsFailed();

      System.out.println("Testing rotate90...");
      CartesianPoint cp = new CartesianPoint(4, 4);
      
      Point rot90 = cp.rotate90();
      SUnit.assertEquals(rot90.xCoordinate(), -4, .00001);
      SUnit.assertEquals(rot90.yCoordinate(), 4, .00001);
      SUnit.assertEquals(cp.xCoordinate(), 4, .00001);
      SUnit.assertEquals(cp.yCoordinate(), 4, .00001);
      
      Point rot180 = rot90.rotate90();
      SUnit.assertEquals(rot180.xCoordinate(), -4, .00001);
      SUnit.assertEquals(rot180.yCoordinate(), -4, .00001);
      SUnit.assertEquals(cp.xCoordinate(), 4, .00001);
      SUnit.assertEquals(cp.yCoordinate(), 4, .00001);
      
      Point rot270 = rot180.rotate90();
      SUnit.assertEquals(rot270.xCoordinate(), 4, .00001);
      SUnit.assertEquals(rot270.yCoordinate(), -4, .00001);
      SUnit.assertEquals(cp.xCoordinate(), 4, .00001);
      SUnit.assertEquals(cp.yCoordinate(), 4, .00001);

      if (fails == SUnit.testsFailed()) {
         System.out.println("     PASS");
      }
   }
}

/**
 * CartesianPoint1.class Has bugs in angle.
 * CartesianPoint2.class Has no bugs.
 * CartesianPoint3.class Has bugs in rotate90.
 * CartesianPoint4.class Has bugs in constructor, angle, distanceFrom, and rotate90. 
 * CartesianPoint5.class Has bugs in radius.
 * CartesianPoint6.class Has bugs in rotate90.
 * CartesianPoint7.class Has bugs in distanceFrom.
 */

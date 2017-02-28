public class SUnit {

   private static int num_tests = 0;
   private static int failed = 0;

   public static void assertEquals(double expect, double actual, double epsilon) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected " + expect + " +/-" + epsilon
                                  + ", found " + actual);
      if (Math.abs(expect - actual) > epsilon) {
         failed++;
         e.printStackTrace();
      }
   }

   public static void assertEquals(long expect, long actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected " + expect + ", found " + actual);
      if (expect != actual) {
         failed++;
         e.printStackTrace();
      }
   }

   public static void assertEqualsObject(Object expect, Object actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected object equality, found inequality");
      if (!expect.equals(actual)) {
         failed++;
         e.printStackTrace();
      } 
   }

   public static void assertEqualsReference(Object expect, Object actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected reference equality, found inequality");
      if (expect != actual) {
         failed++;
         e.printStackTrace();
      }  
   }

   public static void assertFalse(boolean actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected false, found true");
      if (actual) {
         failed++;
         e.printStackTrace();
      }
   }

   public static void assertNotNull(Object actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected non-null, found null");
      if (actual == null) {
         failed++;
         e.printStackTrace();
      }  
   }

   public static void assertNull(Object actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected null, found non-null");
      if (actual != null) {
         failed++;
         e.printStackTrace();
      }   
   }

   public static void assertTrue(boolean actual) {
      num_tests++;
      Throwable e = new Throwable("Error: Expected true, found false");
      if (!actual) {
         failed++;
         e.printStackTrace();
      } 
   }

   public static void fail() {
      num_tests++;
      Throwable e = new Throwable("Error: Explicit failure");
      failed++;
      e.printStackTrace();
   }

   public static int testsFailed() {
      return failed;
   }

   public static int testsRun() {
      return num_tests;  
   }
}

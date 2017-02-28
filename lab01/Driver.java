/**
 * Runs the Counter class 
 *
 * @Eitan Simler
 * @version Lab 01
 * @version CPE102-03
 */

public class Driver {
   public static void main(String[] args) {
      //Declare and test a Counter object ...
      Counter ct = new Counter();

      // some sample tests
      ct.unReset();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());
      ct.unReset();
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Initial count: " + ct.currentCount());

      // more tests...
     

   }
}

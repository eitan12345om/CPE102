import java.util.*;

public class Lab4 {

   public static void main(String[] argv) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> intList = new ArrayList<>();
      ArrayList<Double> dblList = new ArrayList<>();
      ArrayList<String> strList = new ArrayList<>();
      boolean done = false;

      while (!done) {
         System.out.print("Enter an int, double, any random text, or type \"quit\" to end: ");
         if (scanner.hasNextInt()) {
            intList.add(new Integer(scanner.nextInt()));
            scanner.nextLine();
         } else if (scanner.hasNextDouble()) {
            dblList.add(new Double(scanner.nextDouble()));
            scanner.nextLine();
         } else {
            String temp = scanner.nextLine();
            if (temp.equals("quit")) {
               done = true;
            } else {
               strList.add(temp);
            }
         }
      }
      System.out.println("Integers:");
      for (int i=0; i<intList.size(); i++) {
         System.out.println("Integer[" + i + "] is " + intList.get(i));
      }
      System.out.println("Doubles:");
      for (int i=0; i<dblList.size(); i++) {
         System.out.println("Double[" + i + "] is " + dblList.get(i));
      }
      System.out.println("Other:");
      for (int i=0; i<strList.size(); i++) {
         System.out.println("Other[" + i + "] is " + strList.get(i));
      }
   }
}

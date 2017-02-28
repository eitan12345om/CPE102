import java.util.*;

public class OddEvenDescending implements Comparator<Integer> {

   public int compare(Integer o1, Integer o2) {
      if (o1 % 2 != 0) { // Checks if first is odd
         if (o2 % 2 != 0) { // Checks if second is odd
            return o2 - o1;
         } else {
            return -1;
         }
      } else {
         if (o2 % 2 != 0) {
            return 1;
         } 
         else {
            return o2 - o1;
         }
      }
   }
}

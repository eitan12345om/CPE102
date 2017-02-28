import java.util.*;

public class Explore {

   public static void main(String[] args) {
      LinkedList<String> strList = new LinkedList<>();   
      LinkedList<Integer> intList = new LinkedList<>();

      String[] tempStrList = new String[] {"hello", "hi there", "hey", "'sup", "sugar", "mama", "dada", "sister", "mister", "water", "fountain"};
      int[] tempIntList = new int[] {4, 3453, 31, 63, 786, 45, 23, 67, 97, 12, 65, 34, 45241, 45682, 7273};

      for (String s : tempStrList) {
         strList.add(s);
      }
      for (int i : tempIntList) {
         intList.add(i);
      }

      Iterator iterator = strList.iterator();

      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
      
      for (int i : intList) {
         System.out.println(i);
      }
   }
}

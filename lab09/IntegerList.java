import java.util.*;

public class IntegerList<Element> {

   // Instance Variables
   private ArrayList<Integer> elements;
   private Random rand = new Random();

   // Constructor
   public IntegerList(int size, int maxRandValue) {
      elements = new ArrayList<>();
      for (int i=0; i<size; i++) {
         elements.add(rand.nextInt(maxRandValue));
      }
   }

   // Methods
   public void sort() {
      Collections.sort(elements);
   }

   public void sort(Comparator<Integer> c) {
      Collections.sort(elements, c);   
   }

   public boolean isSorted(Comparator<Integer> c) {
      if (c == null) {
         for (int i=0; i<elements.size()-1; i++) {
            if (elements.get(i).compareTo(elements.get(i+1)) > 0) {
               return false;
            }
         }
         return true;
      } else {
         for (int i=0; i<elements.size()-1; i++) {
            if (c.compare(elements.get(i), elements.get(i+1)) > 0) {
               return false;
            }
         }
         return true;
      }
   }

   public String toString() {
      String temp = "";
      for (int i=0; i<elements.size(); i++) {
         temp += elements.get(i) + "\n";
      }
      return temp;
   }

   public void mySLOsort() {
      int j, aNum;
      for (int i=1; i<elements.size(); i++) {
         j = i;
         while (j > 0 && elements.get(j-1) > elements.get(j)) {
            aNum = elements.get(j-1);
            elements.set(j-1, elements.get(j));
            elements.set(j, aNum);
            j--;
         }
      }
   }

   public void mySLOsort(Comparator<Integer> c) {
      int j, aNum;
      for (int i=1; i<elements.size(); i++) {
         j = i;
         while (j > 0 && (c.compare(elements.get(j-1), elements.get(j))) > 0) {
            aNum = elements.get(j-1);
            elements.set(j-1, elements.get(j));
            elements.set(j, aNum);
            j--;
         }
      }
   }

   public int binarySearch(int key) {
      int max = elements.size() - 1;
      int min = 0;
      while (true) {
         if (min > max) {
            return -1;
         }
         int mid = (max + min) / 2;
         if (key < elements.get(mid)) {
            max = mid - 1;
         }
         else if (key > elements.get(mid)) {
            min = mid + 1;
         }
         else {
            return mid;
         }
      }
   }

   public int recBinarySearch(int key) {
      return recBinarySearch(key, 0, elements.size() - 1);
   }

   private int recBinarySearch(int key, int min, int max) {
      if (min > max) {
         return -1;
      }
      int mid = (max + min) / 2;
      if (key < elements.get(mid)) {
         return recBinarySearch(key, min, mid - 1);
      }
      else if (key > elements.get(mid)) {
         return recBinarySearch(key, mid + 1, max);
      }
      else {
         return mid;
      } 
   }
}

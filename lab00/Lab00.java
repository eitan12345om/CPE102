public class Lab00 {
   
   public static void main(String[] args) {
      
      // declaring variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);
      
      // a list (make an array in java)
      int nums[] = {3, 6, -1, 2};
      for (int i=0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }

      // call a function
      int numFound = charCount(y, 'l');
      System.out.println("Found: " + numFound);

      // a counting for loop
      for (int i=1; i < 11; i++) {
         System.out.print(i + " ");
      }

     // printing extra line
     System.out.println();

   }

   public static int charCount(String s, char c) {
      
      int count = 0;

      for (int i=0; i < s.length(); i++) {
         if (s.charAt(i) == c) {
            count++;
         }
      }

      return count;
   }
}


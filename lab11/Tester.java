public class Tester {

   public static void main(String[] args) {
      Stack<String> stack = new Stack<>();
      stack.push("A");
      stack.push("B");
      stack.push("C");
      System.out.println(stack.pop());
      stack.push("D");
      for (int i=0; i < 3; i++) {
         System.out.println(stack.pop());
      }
   }
}

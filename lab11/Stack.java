import java.util.LinkedList;

public class Stack<Element> {

   // Rest of the class code here, Element can be
   // used as a type for parameters and return types.
   
   // Instance Variable
   private LinkedList<Element> myList = new LinkedList<>();

   // Constructor
   public Stack() {
   }

   public void push(Element e) {
      myList.add(e);
   }

   public Element pop() {
      return myList.removeLast();
   }
}

public class BasicLinkedList<E> implements BasicList<E> {

   // Instance Variables
   private Node head;
   private Node tail;
   private int size;

   // Constructor
   public BasicLinkedList() {
      this.size = 0;
   }

   // Methods
   public void add(E element) {
      Node newNode = new Node(element);
      if (size == 0) {
         head = newNode;
         tail = newNode;
         size++;
      } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
         size++;
      }   
   }

   public void add(int index, E element) {
      if (index < 0 || index > size) {
         throw new java.lang.IndexOutOfBoundsException();
      }
      Node newNode = new Node(element);
      if (index == 0) {
         if (size > 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
         } else {
            head = newNode;
            tail = newNode;
         }
         size++;
      } else if (index == size) {
         add(element);
      } else {
         Node temp = head;
         for (int i=0; i<index; i++) {
            temp = temp.next;
         }
         newNode.prev = temp.prev;
         temp.prev.next = newNode;
         temp.prev = newNode;
         newNode.next = temp;
         size++;
      }
   }

   public BasicListIterator<E> basicListIterator() {
      return new TejasInterator();
   }

   public void clear() {
      size = 0;
      head = null;
      tail = null;
   }

   public boolean contains(E element) {
      if (size == 0) {
         return false;
      }
      Node newNode = head;
      for (int i=0; i<size; i++) {
         if (newNode.element.equals(element)) {
            return true;
         }
         newNode = newNode.next;
      }
      return false;
   }

   public E get(int index) {
      if (index < 0 || index >= size) {
         throw new java.lang.IndexOutOfBoundsException();
      }
      Node newNode = head;
      for (int i=0; i<size; i++) {
         if (i == index) {
            return newNode.element;
         }
         newNode = newNode.next;
      }
      return null;
   }

   public int indexOf(E element) {
      if (size > 0) {
         Node newNode = head;
         for (int i=0; i<size; i++) {
	    if (newNode.element.equals(element)) {
	       return i;
	    }
	    newNode = newNode.next;
         }
      }
      throw new java.util.NoSuchElementException();
   }

   public java.util.Iterator<E> iterator() {
      return new TejasInterator();
   }

   public E remove(int index) {
      if (index < 0 || index >= size) {
         throw new java.lang.IndexOutOfBoundsException();
      }
      if (index == 0) {
         Node temp = head;
         if (size == 1) {
            clear();
            return temp.element;
         } else {
            head = head.next;
	    head.prev = null;
	    size--;
	    return temp.element;
         }
      }
      if (index == size-1) {
         Node temp = tail;
	 tail = tail.prev;
	 tail.next = null;
	 size--;
	 return temp.element;
      }
      Node newNode = head;
      for (int i=0; i<index; i++) {
         newNode = newNode.next;
      }
      newNode.prev.next = newNode.next;
      newNode.next.prev = newNode.prev;
      size--;
      return newNode.element;
   }

   public E set(int index, E element) {
      if (index < 0 || index >= size) {
         throw new java.lang.IndexOutOfBoundsException();
      } 
      E elTemp;
      Node newNode = head;
      for (int i=0; i<index; i++) {
         newNode = newNode.next;
      }
      elTemp = newNode.element; 
      newNode.element = element;
      return elTemp;
   }

   public int size() {
      return size;
   }

   // Inner Classes
   private class Node {
      
      // Instance Variables
      public Node next;
      public Node prev;
      public E element;

      // Constructor
      public Node(E element) {
         this.element = element;
      }
   }

   private class TejasInterator implements BasicListIterator<E> {
   
      // Instance Variable
      private Node node = null;

      // Methods
      public boolean hasNext() { // Come back
     //    if (node.next != null) {
     //       return true;
     //    }
         return false;
      }

      public E next() { // Come back
         return null;
      }

      public boolean hasPrevious() { // Come back
         return false;
      }

      public E previous() { // Come back
         return null;
      }

      public void remove() { // Come back
         throw new UnsupportedOperationException();
      }
   }
} 

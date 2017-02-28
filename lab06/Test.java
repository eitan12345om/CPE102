public class Test {

   public static void main(String[] args) {
      Animal a = new Animal(3);
      Animal b = new Animal(4);
      Animal c = new Animal(4);
      Person d = new Person(2, "James");
      Person e = new Person(2, "James");
      Person f = new Person(2, "Sharon");
      Student g = new Student(2, "James", 4.0);
      Student h = new Student(2, "Mr. Smith", 3.5);
      Student i = new Student(2, "James", 4.0);
      Student j = new Student(2, "Robert", 4.0);

      System.out.println("a == b: " + a.equals(b)); 
      System.out.println("a == c: " + a.equals(c)); 
      System.out.println("b == c: " + b.equals(c)); 
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      System.out.println("c: " + c);

      System.out.println("d == e: " + d.equals(e)); 
      System.out.println("d == f: " + d.equals(f)); 
      System.out.println("e == f: " + e.equals(f)); 
      System.out.println("d: " + d);
      System.out.println("e: " + e);
      System.out.println("f: " + f);
   
      System.out.println("g == h: " + g.equals(h)); 
      System.out.println("g == i: " + g.equals(i)); 
      System.out.println("g == j: " + g.equals(j)); 
      System.out.println("h == i: " + h.equals(i)); 
      System.out.println("h == j: " + h.equals(j)); 
      System.out.println("i == j: " + i.equals(j)); 
      System.out.println("g: " + g);
      System.out.println("h: " + h);
      System.out.println("i: " + i);
      System.out.println("j: " + j);
   }
}

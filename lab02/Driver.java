import java.util.Scanner;

public class Driver {

   public static void main(String[] args) {
      
      // Declare and construct a Scanner object to read from the command-line
      Scanner scanner = new Scanner(System.in);
      
      // Prompt for a name
      System.out.print("What is your name? ");
      
      // Read the name using the scanner
      String name = scanner.nextLine();

      // Construct a greeter object
      Greeter greeter = new Greeter(name);
      
      // Get the greeting and save it to a String
      String greeting = greeter.greet();

      // Display the greeting to the command-line
      System.out.println(greeting);
   
   }

}

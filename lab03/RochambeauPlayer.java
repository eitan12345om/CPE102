import java.util.Random;

public class RochambeauPlayer extends java.lang.Object {

   private String name;
   private int wins;
   private int lastThrow;
   Random rand = new Random();  

   public RochambeauPlayer(String name) {  
      this.name = name;
   }

   public String getName() {  
      return name;
   }

   public int getWins() {  
      return wins;
   }

   public String lastThrow() {  
      if (lastThrow == 0) {
         return "Rock";
      } else if (lastThrow == 1) {
         return "Paper";
      } else if (lastThrow == 2) {
         return "Scissors";
      } else {
         return "No Throw";
      }  
   }

   public String toString() { 
      return (getWins() == 1) ? (name + " has 1 win.") : (name + " has " + getWins() + " wins.");
   }

   public void incrementWins() {  
      wins += 1;
   }

   public int makeThrow() {
      int num = rand.nextInt(3);
      int[] a_throw = {Rochambeau.ROCK, Rochambeau.PAPER, Rochambeau.SCISSORS};
      lastThrow = a_throw[num];
      return a_throw[num];
   }

   public int makeThrow(int throwType) {
      int[] a_throw = {Rochambeau.ROCK, Rochambeau.PAPER, Rochambeau.SCISSORS};
      lastThrow = a_throw[throwType];
      return a_throw[throwType];
   }

}

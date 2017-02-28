public class Rochambeau extends java.lang.Object {

   public static final int ROCK = 0;
   public static final int PAPER = 1;
   public static final int SCISSORS = 2;
   public static int[][] results = {{0, -1, 1},
                                    {1, 0, -1},
                                    {-1, 1, 0}};

   public Rochambeau() {
   }
   public static int getWinner(int throw1, int throw2) {
   
      return results[throw1][throw2];
   }

}

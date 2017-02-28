/**
 * A class for Square Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class Square {

   // Named Constants
   public static final int SQUARE_SIZE = 50;
   public static final int UP = 0;
   public static final int RIGHT = 1;
   public static final int DOWN = 2;
   public static final int LEFT = 3;

   // Instance variables
   private boolean[] walls;
   private boolean seen, inView;
   private int row, col;
   private Treasure treasure;

   // Constructors
   public Square(boolean up, boolean right, boolean down, boolean left,
                 int row, int col) {
      this.walls = new boolean[] {up, right, down, left};
      this.row = row;
      this.col = col;
      this.seen = false;
      this.inView = false;
      this.treasure = null;
   }

   // Methods
   public boolean wall(int direction) {
      return walls[direction];
   }

   public boolean seen() {
      return seen;
   }

   public boolean inView() {
      return inView;
   }

   public int row() {
      return row;
   }

   public int col() {
      return col;
   }

   public Treasure treasure() {
      return treasure;
   }

   public int x() {
      return col * SQUARE_SIZE;
   }
   
   public int y() {
      return row * SQUARE_SIZE;
   }

   public void setInView(boolean inView) {
      this.inView = inView;
      if (inView) {
         this.seen = true;
      }
   }

   public void setTreasure(Treasure t) {
      this.treasure = t; 
   }
   
   public void enter() { 
      if (treasure != null) {
         treasure.setFound();
      }
   }
}

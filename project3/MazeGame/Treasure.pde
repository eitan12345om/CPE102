/**
 * A class for Treasure Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class Treasure extends RandomOccupant {

   // Instance variables
   private boolean found;

   // Constructors
   public Treasure(Maze maze) {
      super(maze);
      this.found = false;
      super.location().setTreasure(this);
   }

   public Treasure(Maze maze, long seed) {
      super(maze, seed);
      this.found = false;
      super.location().setTreasure(this);
   }

   public Treasure(Maze maze, Square location) {
      super(maze, location);
      this.found = false;
      super.location().setTreasure(this);
   }

   // Methods
   public boolean found() {
      return found;
   }

   public void setFound() {
      found = true;
   }

   public void move() {
   }
} 

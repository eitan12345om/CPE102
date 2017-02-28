/**
 * A class for DrawableTreasure Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class DrawableTreasure extends Treasure implements Drawable {

   // Constructors
   public DrawableTreasure(Maze maze) {
      super(maze);
   }

   public DrawableTreasure(Maze maze, long seed) {
      super(maze, seed);
   }

   public DrawableTreasure(Maze maze, Square location) {
      super(maze, location);
   }

   // Methods
   public void draw() {
   }
}

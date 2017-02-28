/**
 * A class for DrawableMonster Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class DrawableMonster extends Monster implements Drawable {

   // Constructors
   public DrawableMonster(Maze maze) {
      super(maze);
   }

   public DrawableMonster(Maze maze, long seed) {
      super(maze, seed);
   }

   public DrawableMonster(Maze maze, Square location) {
      super(maze, location);
   }

   // Methods
   public void draw() {
   }   
}

/**
 * A class for DrawableMaze Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class DrawableMaze extends Maze implements Drawable {

   // Constructors
   public DrawableMaze(DrawableSquare[][] maze, int rows, int cols) {
      super(maze, rows, cols);
   }

   // Methods
   public void draw() {
      fill(0, 50, 50);
      rect(0, 0, 500, 500);
      
      for (int row=0; row<10; row++) {
         for (int col=0; col<10; col++) {
            ((Drawable)super.getSquare(row, col)).draw();
         }
      }
      
      for (int i=0; i<super.getNumRandOccupants(); i++) {
         ((Drawable)super.getRandomOccupant(i)).draw();
      }
      
      ((DrawableExplorer)super.getExplorer()).draw();
   }
}
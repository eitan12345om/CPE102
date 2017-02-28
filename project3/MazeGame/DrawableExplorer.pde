/**
 * A class for DrawableExplorer Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class DrawableExplorer extends Explorer implements Drawable {

   // Constructors
   public DrawableExplorer(Square location, Maze maze, String name) {
      super(location, maze, name);
   }

   // Methods
   public void draw() {
      Square s = super.location();
      
      pushMatrix();
      
      translate((int)s.x() + 25, (int)s.y() + 25);
      noStroke();
      
      // Head
      fill(120);
      ellipse(0, 0, 25, 25);
      
      // Eyes
      fill(255);
      ellipse(-5, 0, 10, 10);
      ellipse(5, 0, 10, 10);
      
      // Pupils
      fill(0);
      ellipse(-5, 0, 4, 4); 
      ellipse(5, 0, 4, 4);
      
      // Glasses
      stroke(0);
      noFill();
      rect(-10, -4, 9, 8);
      rect(0, -4, 9, 8);
      line(-10, -3, -11, -7);
      line(10, -4, 10, -7);
      
      // Hair
      noStroke();
      fill(59, 54, 0);
      ellipse(0, -8, 20, 8);
      
      // Mouth
      fill(0);
      ellipse(0, 8, 5, 2);
      
      popMatrix();
   }
}
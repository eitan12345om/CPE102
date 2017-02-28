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
      if (super.location().inView()) {
         Square s = super.location();
        
         pushMatrix();
         translate((int)s.x() + 25, (int)s.y() + 25);
         stroke(0);
         fill(255, 2, 2);
      
         // Horns
         triangle(-10, 0, 0, 0, -10, -17);
         triangle(9, 0, -2, 0, 9, -17);
      
         // Head
         ellipse(0, 0, 25, 25);
      
         // Eyes
         fill(255);
      
         pushMatrix();
         rotate(PI/4);
         ellipse(-3, 4, 8, 6);
         popMatrix();
      
         pushMatrix();
         rotate(-PI/4);
         ellipse(3, 4, 8, 6);
         popMatrix();
      
         // Pupils
         fill(0);
         ellipse(-5, 0, 4, 4); 
         ellipse(5, 0, 4, 4);

         popMatrix();
      }
   }   
}
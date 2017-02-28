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
      if (super.location().seen()) {
         pushMatrix();
         Square s = super.location();
         translate((int)s.x() + 25, (int)s.y() + 25);
         if (!super.found()) {
            stroke(0);
      
            // Head
            fill(250);
            ellipse(0, 0, 25, 25);
      
            // Eyes
            fill(255);
            ellipse(-5, 0, 10, 10);
            ellipse(5, 0, 10, 10);
      
            // Pupils
            fill(0);
            ellipse(-5, 0, 4, 4); 
            ellipse(5, 0, 4, 4);
      
            // Mouth
            fill(0);
            arc(0, 7, 8, 5, 0, PI);
      
            // Halo
            noStroke();
            fill(248, 254, 0);
            ellipse(-1, -19, 20, 6);
         
            popMatrix();
         } else {
            stroke(0);
            fill(0);
      
            // Head
            ellipse(0, 0, 25, 25);
      
            // Halo
            noStroke();
            ellipse(-1, -19, 20, 6);

            popMatrix();
         }
      }
   }
}
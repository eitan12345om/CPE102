/**
 * A class for DrawableSquare Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

public class DrawableSquare extends Square implements Drawable {

   // Constructors
   public DrawableSquare(boolean up, boolean right, boolean down, boolean left,
                         int row, int col) {
      super(up, right, down, left, row, col);
   }

   // Methods
   public void draw() {
      if (super.seen()) {
         if (super.inView()) {
            pushMatrix();
            translate((int)super.x(), (int)super.y());
            
            fill(0, 220, 220);
            rect(0, 0, 50, 50);
            
            fill(0);
            // Decoration - up
            if (super.wall(Square.UP)) {
               for (int i=0; i<10; i++) {
                  arc(3+i*5, 0, 5, 5, 0, PI);
               }
            }
      
            // Decoration - left
            if (super.wall(Square.LEFT)) {
               for (int i=0; i<10; i++) {
                  arc(0, 3+i*5, 5, 5, -HALF_PI, HALF_PI);
               }
            }
      
            // Decoration - right
            if (super.wall(Square.RIGHT)) {
               for (int i=0; i<10; i++) {
                  arc(50, 3+i*5, 5, 5, HALF_PI, PI + HALF_PI);
               }
            }
      
            // Decoration - down
            if (super.wall(Square.DOWN)) {
               for (int i=0; i<10; i++) {
                  arc(3+i*5, 50, 5, 5, -PI, 0);
               }
            }
            
            popMatrix();
         } else {
            pushMatrix();
            translate((int)super.x(), (int)super.y());
            fill(0, 90, 90);
            rect(0, 0, 50, 50);
            
            fill(0);
            // Decoration - up
            if (super.wall(Square.UP)) {
               for (int i=0; i<10; i++) {
                  arc(3+i*5, 0, 5, 5, 0, PI);
               }
            }
      
            // Decoration - left
            if (super.wall(Square.LEFT)) {
               for (int i=0; i<10; i++) {
                  arc(0, 3+i*5, 5, 5, -HALF_PI, HALF_PI);
               }
            }
      
            // Decoration - right
            if (super.wall(Square.RIGHT)) {
               for (int i=0; i<10; i++) {
                  arc(50, 3+i*5, 5, 5, HALF_PI, PI + HALF_PI);
               }
            }
      
            // Decoration - down
            if (super.wall(Square.DOWN)) {
               for (int i=0; i<10; i++) {
                  arc(3+i*5, 50, 5, 5, -PI, 0);
               }
            }
            
            popMatrix();
         }
      } 
   }
}
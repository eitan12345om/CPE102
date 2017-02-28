/**
 * A class for Explorer Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

import java.awt.event.KeyEvent;

public class Explorer extends Occupant {

   // Instance variables
   private String name;
   private Maze maze;

   // Constructors
   public Explorer(Square location, Maze maze, String name) {
      super(location);
      this.name = name;
      this.maze = maze;
      this.maze.lookAround(this.location());
   }

   // Methods
   public String name() {
      return name;
   }

   public void move(int key) {
      int row = super.location().row();
      int col = super.location().col();
      if (KeyEvent.VK_LEFT == key || KeyEvent.VK_KP_LEFT == key) {
         int direction = Square.LEFT;
         col--;
         if (!super.location().wall(direction)) {
            this.moveTo(maze.getSquare(row, col));   
         }
      } 
      else if (KeyEvent.VK_UP == key || KeyEvent.VK_KP_UP == key) {
         int direction = Square.UP;
         row--;
         if (!super.location().wall(direction)) {
            this.moveTo(maze.getSquare(row, col));   
         }
      } 
      else if (KeyEvent.VK_RIGHT == key || KeyEvent.VK_KP_RIGHT == key) {
         int direction = Square.RIGHT;
         col++;
         if (!super.location().wall(direction)) {
            this.moveTo(maze.getSquare(row, col));   
         }
      } 
      else if (KeyEvent.VK_DOWN == key || KeyEvent.VK_KP_DOWN == key) {
         int direction = Square.DOWN;
         row++;
         if (!super.location().wall(direction)) {
            this.moveTo(maze.getSquare(row, col));   
         }
      } 
   }

   public void moveTo(Square s) {
      super.moveTo(s);
      s.enter();
      maze.lookAround(s); 
   }
}

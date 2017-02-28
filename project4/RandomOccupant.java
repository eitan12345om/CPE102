/**
 * An abstract class for RandomOccupants
 *
 * @author Eitan Simler
 * @version Project3
 */

import java.util.Random;
import java.util.Scanner;

abstract class RandomOccupant extends Occupant {

   // Instance variables
   private Random rand = new Random();
   private Maze maze;

   // Constructors
   public RandomOccupant(Maze maze) {
      this.maze = maze;
      int row = rand.nextInt(maze.rows());
      int col = rand.nextInt(maze.cols());
      this.moveTo(maze.getSquare(row, col));
   }

   public RandomOccupant(Maze maze, long seed) {
      this.maze = maze;
      rand.setSeed(seed);
      int row = rand.nextInt(maze.rows());
      int col = rand.nextInt(maze.cols());
      this.moveTo(maze.getSquare(row, col));
   }

   public RandomOccupant(Maze maze, Square location) {
      super(location);
      this.maze = maze;
   }

   // Methods
   public void move() {
      int row = super.location().row();
      int col = super.location().col();
      boolean done = false;
      int direction = 0;
      while (!done) {
         direction = rand.nextInt(4);
         if (!super.location().wall(direction)) {
            done = true;
         }
      }
      if (direction == Square.UP) {
         row--;
      }
      else if (direction == Square.RIGHT) {
         col++;
      }
      else if (direction == Square.DOWN) {
         row++;
      }
      else {
         col--;
      }
      super.moveTo(maze.getSquare(row, col));
   }

   public void toObject(Scanner input) {
      int row = input.nextInt();
      int col = input.nextInt();
      moveTo(maze.getSquare(row, col));
   }
}

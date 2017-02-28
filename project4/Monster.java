/**
 * A class for Maze Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

import java.util.Scanner;

public class Monster extends RandomOccupant {

   // Constructors
   public Monster(Maze maze) {
      super(maze);
   }

   public Monster(Maze maze, long seed) {
      super(maze, seed);
   }

   public Monster(Maze maze, Square location) {
      super(maze, location);
   } 
}

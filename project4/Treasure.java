/**
 * A class for Treasure Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

import java.util.Scanner;

public class Treasure extends RandomOccupant {

   // Instance variables
   private boolean found;

   // Constructors
   public Treasure(Maze maze) {
      super(maze);
      this.found = false;
      super.location().setTreasure(this);
   }

   public Treasure(Maze maze, long seed) {
      super(maze, seed);
      this.found = false;
      super.location().setTreasure(this);
   }

   public Treasure(Maze maze, Square location) {
      super(maze, location);
      this.found = false;
      super.location().setTreasure(this);
   }

   // Methods
   public boolean found() {
      return found;
   }

   public void setFound() {
      found = true;
   }

   public void move() {
   }

   public void moveTo(Square newLoc) {
      if (super.location() != null) {
         super.location().setTreasure(null);
      }
      super.moveTo(newLoc);
      newLoc.setTreasure(this);
   }

   public String toText(char delimiter) {
      return (super.toText(delimiter) + delimiter + found);
   }

   public void toObject(Scanner input) {
      super.toObject(input);
      this.found = input.nextBoolean();
   }
} 

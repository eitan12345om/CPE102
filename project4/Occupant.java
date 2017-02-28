/**
 * An abstract class for Occupant Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

import java.util.Scanner;

abstract class Occupant implements DelimitedTextIO {

   // Instance variables
   private Square square;

   // Constructors
   public Occupant() {
   }

   public Occupant(Square start) {
      this.square = start;
   }

   // Methods
   public Square location() {
      return square;
   }

   public void moveTo(Square newLoc) {
      this.square = newLoc;
   }

   public String toText(char delimiter) {
      return (getClass().getName() + delimiter + square.row() + delimiter
             + square.col());
   }

   public void toObject(Scanner input) {} // Come back!
}

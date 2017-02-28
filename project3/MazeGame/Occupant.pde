/**
 * An abstract class for Occupant Objects
 *
 * @author Eitan Simler
 * @version Project3
 */

abstract class Occupant {

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
}

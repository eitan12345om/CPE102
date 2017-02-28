/**
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * 
 * @author Eitan Simler 
 * @version Project3
 */

import java.util.*;

public class Maze {
   
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] squares;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /**
    * Constructor for objects of class Maze
    */
   public Maze(Square[][] squares, int rows, int cols) {
      this.squares = squares;      
      this.rows = rows;
      this.cols = cols;
      randOccupants = new ArrayList<RandomOccupant>();		
   }
	
   // QUERIES
   public Square getSquare(int row, int col) {
      return squares[row][col];
   }

   public int rows() {
      return rows;
   }

   public int cols() {
      return cols;
   }

   public String explorerName() {
      return explorer.name();
   }

   public Explorer getExplorer() {
      return explorer;
   }
    
   public RandomOccupant getRandomOccupant(int index) {
      return randOccupants.get(index);
   }

   public int getNumRandOccupants() {
      return randOccupants.size();
   }
	
   // COMMANDS
   public void addRandomOccupant(RandomOccupant ro) {
      randOccupants.add(ro);   
   }
	
   public void setExplorer(Explorer e) {
      explorer = e;
   }
	
   public void explorerMove(int key) {
      explorer.move(key);
   }
	
   public void randMove() {
      for (RandomOccupant r : randOccupants) {
         r.move();
      }   
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *    it is in the same location as the Explorer, return
    *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus() {
      if (this.foundAllTreasures()) {
         return this.EXPLORER_WIN;
      } else {
         for (RandomOccupant r : randOccupants) {
            if (r instanceof Monster) {
               if (r.location() == explorer.location()) {
                  return this.MONSTER_WIN;
               }
            }
         }
         return this.ACTIVE;
      } 
   }
	
   private boolean foundAllTreasures() {
      for (RandomOccupant r : randOccupants) {
         if (r instanceof Treasure) {
            if (!((Treasure)r).found()) {
               return false;
            }
         }
      }  
      return true;
   }
    
   public void lookAround(Square s) {
      int row = s.row();
      int col = s.col();
      Square temp;
      int tempRow, tempCol;

      // Clear what was previously in view
      resetInView();
        
      // Set the current square so that we are viewing it (obviously)
      s.setInView(true);
      
      for (int i=0; i<4; i++) {
         if (!s.wall(i)) {
            if (i == Square.UP || i == Square.DOWN) {
               temp = this.getSquare(row-1+i, col);
               temp.setInView(true);
               tempRow = temp.row();
               tempCol = temp.col();
               if (!temp.wall(Square.RIGHT)) {
                  this.getSquare(tempRow, tempCol+1).setInView(true);
               }
               if (!temp.wall(Square.LEFT)) {
                  this.getSquare(tempRow, tempCol-1).setInView(true);
               } 
            } else {
               temp = this.getSquare(row, col+2-i);
               temp.setInView(true);
               tempRow = temp.row();
               tempCol = temp.col();
               if (!temp.wall(Square.UP)) {
                  this.getSquare(tempRow-1, tempCol).setInView(true);
               }
               if (!temp.wall(Square.DOWN)) {
                  this.getSquare(tempRow+1, tempCol).setInView(true);
               }  
            }
         }
      }
   }
    
   private void resetInView() {
      for (int i = 0; i<rows; i++) {
         for (int j = 0; j<cols; j++) {
            squares[i][j].setInView(false);
         }
      }
   }
}

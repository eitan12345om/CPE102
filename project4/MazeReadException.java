public class MazeReadException extends Exception {

   // Instance Variables
   private String line;
   private int lineNumber;

   // Constructor
   public MazeReadException(String message, String line, int lineNumber) {
      super(message);
      this.line = line;
      this.lineNumber = lineNumber;
   }

   // Methods
   public String getLine() {
      return line;
   }

   public int getLineNum() {
      return lineNumber;
   }
}

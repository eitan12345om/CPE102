public class CartesianPoint implements Point {
   
   private double xCoordinate;
   private double yCoordinate;

   public CartesianPoint(double xCoordinate, double yCoordinate) {
    
      this.xCoordinate = xCoordinate;   
      this.yCoordinate = yCoordinate;     
   }

   public double angle() {
      return Math.atan2(yCoordinate, xCoordinate);
   }
   public double distanceFrom(Point other) {
      return Math.sqrt(Math.pow(xCoordinate - other.xCoordinate(), 2) + Math.pow(yCoordinate - other.yCoordinate(), 2));
   }
   public double radius() {
      return Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
   }
   public Point rotate90() {
      return new CartesianPoint(-yCoordinate, xCoordinate);
   }
   public double xCoordinate() {
      return xCoordinate; 
   }
   public double yCoordinate() {
      return yCoordinate;
   }

}

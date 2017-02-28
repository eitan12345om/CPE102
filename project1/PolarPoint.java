public class PolarPoint implements Point {
   
   private double radius;
   private double angle;

   public PolarPoint(double radius, double angle) {
    
      this.radius = radius;   
      this.angle = angle;     
   }

   public double angle() {
      return angle;
   }
   public double distanceFrom(Point other) {
      return Math.sqrt(Math.pow(radius, 2) + Math.pow(other.radius(), 2) - 2 * radius * other.radius() * Math.cos(angle - other.angle())); 
   }
   public double radius() {
      return radius;
   }
   public Point rotate90() {
      return new PolarPoint(radius, angle + Math.PI / 2);
   }
   public double xCoordinate() {
      return radius * Math.cos(angle);
   }
   public double yCoordinate() {
      return radius * Math.sin(angle);
   }

}

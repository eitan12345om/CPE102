public class Monster {
  
   // Instance Variables
   private PVector direction;
   private double x, y;
   
   // Constructor
   public Monster(double x, double y) {
      this.x = x;
      this.y = y;
      direction = new PVector(0,0);
   }
   
   // Methods
   public void draw() {
      pushMatrix();
      translate((int)x, (int)y);
      
      noStroke();
      
      // Head
      fill(120);
      ellipse(0, 0, 25, 25);
      
      // Eyes
      fill(255);
      ellipse(-5, 0, 10, 10);
      ellipse(5, 0, 10, 10);
      
      // Pupils
      fill(0);
      ellipse(-5, 0, 4, 4); 
      ellipse(5, 0, 4, 4);
      
      // Glasses
      stroke(0);
      noFill();
      rect(-10, -4, 9, 8);
      rect(0, -4, 9, 8);
      line(-10, -3, -11, -7);
      line(10, -4, 10, -7);
      
      // Hair
      noStroke();
      fill(59, 54, 0);
      ellipse(0, -8, 20, 8);
      
      // Mouth
      fill(0);
      ellipse(0, 8, 5, 2);
      
      popMatrix();
   }
   
   public double getX() {
      return this.x;
   }
   
   public double getY() {
      return this.y;
   }
   
   public void move() {
      this.x += direction.x;
      this.y += direction.y;
   }
   
   public void setVector(PVector direction) {
      this.direction = direction;
   }
}
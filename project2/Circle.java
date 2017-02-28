/**
 * A Circle Class
 *
 * @author Eitan Simler
 * @version Program 2
 */

import java.awt.*;

public class Circle implements Shape {
   
   private double radius;
   private Point position;
   private Color color;
   private boolean filled;

   public Circle(double radius, Point position, Color color, boolean filled) {
      this.radius = radius;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }
   
   public double getRadius() {
      return radius;
   } 
   
   public void setRadius(double radius) {
      this.radius = radius;
   }

   public Point getPosition() {
      return position;
   }
   
   public boolean equals(Object other) {
      if (other == null) {
         return false;
      }
      if (this.getClass() != other.getClass()) {
         return false;
      }
      
      Circle otter = (Circle) other;
      
      return radius == otter.radius && position.equals(otter.position)
          && color.equals(otter.color) && filled == otter.filled; 
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public Color getColor() {
      return color;     
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public boolean getFilled() {
      return filled;
   }

   public void setFilled(boolean filled) {
      this.filled = filled;
   }

   public void move(Point point) {
      position.x += point.x;
      position.y += point.y;
   }
}

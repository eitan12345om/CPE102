/**
 * A Triangle Class
 *
 * @author Eitan Simler
 * @version Program 2
 */

import java.awt.*;

public class Triangle implements Shape {

   private Point a, b, c;
   private Color color;
   private boolean filled;

   public Triangle(Point a, Point b, Point c, Color color, boolean filled) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.color = color;
      this.filled = filled;
   }

   public Point getVertexA() {
      return a; 
   }

   public void setVertexA(Point point) {
      this.a = point;
   }
   
   public Point getVertexB() {
      return b; 
   }

   public void setVertexB(Point point) {
      this.b = point;
   }
   
   public Point getVertexC() {
      return c; 
   }

   public void setVertexC(Point point) {
      this.c = point;
   }

   public boolean equals(Object other) {
      if (other == null) {
         return false;
      }
      if (this.getClass() != other.getClass()) {
         return false;
      }
      
      Triangle otter = (Triangle) other;
      
      return a.equals(otter.a) && b.equals(otter.b) && c.equals(otter.c)
          && color.equals(otter.color) && filled == otter.filled;
   }

   public double getArea() {
      double AB = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2)); 
      double AC = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2)); 
      double BC = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(c.y - b.y, 2));
      double s = (AB + AC + BC) / 2;

      return Math.sqrt(s * (s - AB) * (s - AC) * (s - BC));
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
      a.x += point.x;
      a.y += point.y;
      b.x += point.x;
      b.y += point.y;
      c.x += point.x;
      c.y += point.y;
   }
}

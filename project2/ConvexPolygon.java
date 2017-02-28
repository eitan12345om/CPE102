/**
 * A Convex Polygon Class
 *
 * @author Eitan Simler
 * @version Program 2
 */

import java.awt.*;
import java.util.ArrayList;

public class ConvexPolygon implements Shape {

   private Point[] vertices;
   private Color color;
   private boolean filled;

   public ConvexPolygon(Point[] vertices, Color color, boolean filled) {
      for (int i=0; i<vertices.length; i++) {
         this.vertices = vertices;
      }
      this.color = color;
      this.filled = filled;
   }

   public Point getVertex(int index) {
      return vertices[index];     
   }

   public void setVertex(int index, Point point) {
      vertices[index].x = point.x;
      vertices[index].y = point.y;
   }

   public boolean equals(Object other) {
      if (other == null) {
         return false;
      }
      if (this.getClass() != other.getClass()) {
         return false;
      }
      
      ConvexPolygon otter = (ConvexPolygon) other;
      
      for (int i=0; i<vertices.length; i++) {
         if (!vertices[i].equals(otter.getVertex(i))) {
            return false;
         }
      }
      return color.equals(otter.color) && filled == otter.filled;
   }

   public double getArea() {
      int part1 = 0;
      int part2 = 0;

      for (int i=0; i<vertices.length - 1; i++) {
         part1 += vertices[i].x * vertices[i+1].y;
         part2 += vertices[i+1].x * vertices[i].y;
      }
      part1 += vertices[vertices.length - 1].x * vertices[0].y;
      part2 += vertices[0].x * vertices[vertices.length - 1].y;
      return (part1 - part2) / 2;
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
      for (Point vertex : vertices) {
         vertex.x += point.x;
         vertex.y += point.y;
      }
   }
}

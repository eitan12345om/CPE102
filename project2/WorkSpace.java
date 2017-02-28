/**
 * A Workspace Class
 *
 * @author Eitan Simler
 * @version Program 2
 */

import java.util.ArrayList;
import java.awt.*;

public class WorkSpace {

   private ArrayList<Shape> a_list;
   
   public WorkSpace() {  
      a_list = new ArrayList<Shape>();
   }

   public void add(Shape shape) {
      a_list.add(shape);
   }
 
   public Shape remove(int index) {
      if (index < 0 || index >= a_list.size()) {
         return null;
      }
      return a_list.remove(index);
   }

   public Shape get(int index) {
     return a_list.get(index);
   }
 
   public int size() {
      return a_list.size();
   }

   public ArrayList<Circle> getCircles() {
      ArrayList<Circle> temp = new ArrayList<Circle>();
      for (Shape shape : a_list) {
         if (shape instanceof Circle) {
            temp.add((Circle)shape);
         }
      }
      return temp;
   }

   public ArrayList<Rectangle> getRectangles() {
      ArrayList<Rectangle> temp = new ArrayList<Rectangle>();
      for (Shape shape : a_list) {
         if (shape instanceof Rectangle) {
            temp.add((Rectangle)shape);
         }
      }
      return temp;
   }

   public ArrayList<Triangle> getTriangles() {
      ArrayList<Triangle> temp = new ArrayList<Triangle>();
      for (Shape shape : a_list) {
         if (shape instanceof Triangle) {
            temp.add((Triangle)shape);
         }
      }
      return temp;
   }

   public ArrayList<ConvexPolygon> getConvexPolygons() {
      ArrayList<ConvexPolygon> temp = new ArrayList<ConvexPolygon>();
      for (Shape shape : a_list) {
         if (shape instanceof ConvexPolygon) {
            temp.add((ConvexPolygon)shape);
         }
      }
      return temp;
   }

   public ArrayList<Shape> getShapesByColor(Color color) {
      ArrayList<Shape> temp = new ArrayList<Shape>();
      for (Shape shape : a_list) {
         if (shape.getColor().equals(color)) {
            temp.add(shape);
         }
      }
      return temp;
   }
   
   public double getAreaOfAllShapes() {
      double s = 0;
      for (Shape shape : a_list) {
         s += shape.getArea();
      }
      return s;
   } 
}

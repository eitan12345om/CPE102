/**
 * A shape interface
 *
 * @author Eitan Simler
 * @version Program 2
 */


import java.awt.*;

/**
 * This is an interface for the different shape classes requiring the classes
 * to have at least these functions.
 */
public interface Shape {
   
   /**
    * Calculates and returns the area of the object.
    *
    * @return returns the area of the shape in the form of a double.
    */
   double getArea();
   
   /**
    * This function determines the color of the given shape.
    *
    * @return returns a Color object which corresponds to the color of the
    * shape.
    */
   Color getColor();
   
   /**
    * This function changes the color of the object to that given as
    * a parameter.
    *
    * @param color This color determines the new color for the given shape.
    */
   void setColor(Color color);
   
   /**
    * This function determines whether the given shape is filled.
    *
    * @return Returns true if the object is filled with color, otherwise false.
    */
   boolean getFilled();
   
   /**
    * This function sets the filled state of the object.
    *
    * @param filled This boolean value determines whether the shape is filled
    * or not.
    */
   void setFilled(boolean filled);
   
   /**
    * This function moves the shape by the x and y amounts specified in
    * the Point.
    *
    * @param point This determines how much to move the location of the
    * object.
    */
   void move(Point point);
}

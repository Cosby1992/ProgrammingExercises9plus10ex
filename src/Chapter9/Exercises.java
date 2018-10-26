package Chapter9;

public class Exercises {

    /* Exercise 9.1 (Read below and see classes Rectangle and RectangleTest)
        Design a class named Rectangle to represent a rectangle. The class contains:
        ■ Two double data fields named width and height that specify the width and height of the rectangle.
        The default values are 1 for both width and height.
        ■ A no-arg constructor that creates a default rectangle.
        ■ A constructor that creates a rectangle with the specified width and height.
        ■ A method named getArea() that returns the area of this rectangle.
        ■ A method named getPerimeter() that returns the perimeter.

         Draw the UML diagram for the class and then
         implement the class. Write a test program that creates two Rectangle objects—one with width 4 and
         height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter
         of each rectangle in this order
     */


    /* Exercise 9.9
        (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have the same length and all
        angles have the same degree (i.e., the polygon is both equilateral and equiangular).
        Design a class named RegularPolygon that contains:
        ■ A private int data field named n that defines the number of sides in the polygon with default value 3.
        ■ A private double data field named side that stores the length of the side with default value 1.
        ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
        ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
        ■ A no-arg constructor that creates a regular polygon with default values.
        ■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
        ■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
        ■ The accessor and mutator methods for all data fields.
        ■ The method getPerimeter() that returns the perimeter of the polygon.
        ■ The method getArea() that returns the area of the polygon.

        The formula for computing the area of a regular polygon is Area =
        (n * s^2) / (4 * tan(PI/n).

        Draw the UML diagram for the class and then implement the class.
        Write a test program that creates three RegularPolygon objects, created using the no-arg
        constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
        For each object, display its perimeter and area.

     */

    public static void main(String[] args) {

        //Creating a rectangle and showing it's area in the console

        Rectangle rect = new Rectangle();

        System.out.println("The area of the rectangle is " + rect.getArea());


        //Creating 3 Regular polygons and showing their area and perimeter
        RegularPolygon regPol1 = new RegularPolygon();
        RegularPolygon regPol2 = new RegularPolygon(6, 4);
        RegularPolygon regPol3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The area of the polygon is " + regPol1.getArea() + " and the perimeter is " + regPol1.getPerimeter());
        System.out.println("The area of the polygon is " + regPol2.getArea() + " and the perimeter is " + regPol2.getPerimeter());
        System.out.println("The area of the polygon is " + regPol3.getArea() + " and the perimeter is " + regPol3.getPerimeter());
    }



}

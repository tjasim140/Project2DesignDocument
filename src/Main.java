//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
}
//LinearEquation class
//
//Instance Variables:
//private int x - This variable represents the x-coordinate
//private int y - represents the y-coordinate
//private int x2 - This variable represents the second x-coordinate
//private int y2 - represents the second y-coordinate\
//private int xNew - the variable the user would input to return corresponding coordinate point
//
//Constructor
//	public LinearEquation(int x, int y, int x2, int y2)
//
//Methods
//public double slope()
//This method will find the slope between two points following the equation m = y2 - y / x2 - x
//
//public double yInt()
//This method will find the y-intercept for the equation by using the slope found and substituting one of the given coordinates to solve for b in y=mx+b
//Returns value of b
//
//public double distance()
//This method will find the distance between the two given points by using the distance formula
//Will utilize Math class to input variables into equation
//
//public double newX()
//takes x coordinate inputs it in created equation to solve for y, then returns value in coordinate format rounded to the nearest hundredth using string format
//
//public String toString()
//This method will display all relevant information about this instance including:
//X and Y coordinate information
//Slope Intercept Form equation
//
//EquationRunner.java
//
//Step 1: Ask user to enter first coordinate point
//Step 2: Ask user to enter second coordinate point
//Step 3: Using substring method of Class String, would separate the coordinate values from the coordinate format
//Step 4: From the Integer class, using parse.Int the strings will be converted to integer values
//Step 5: Then the values would be placed in the constructor LinearEquation(int x , int y, int x2, int y2)
//Step 6: Each method would be called on the object constructed
//Step 7: All values are returned rounded to the nearest hundredth
//Step 8: When asked for newX when the method is called, the user would input a new X value that can be a double and a new coordinate point would be returned rounded to the nearest hundredth
//Step 9: Using toString method, all calculated information is formatted as a String
// Step 10: In the EquationRunner Class the string will be printed with a println statement
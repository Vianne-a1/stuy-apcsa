// Collaborators: Tiffany Yang, Vedant Kothari

/*
* Directions:
* 1. Continue working on yesterday's folder
* 2. Copy the file Point.java from the apcsa_material repo to your folder
* 3. Write a toString() method that returns the coordinate with this format "(2.0, 4.0)"
* 4. Write the Point constructor that receives a Point as paramether
* 5. Write the method: public static double distance(Point a, Point b) in Point
* 6. Write the method: public double distanceTo(Point other) non-static in Point
* 7. Write the method: public static double distance(Point a, Point b) in Driver
* 8. Add test cases to your main and verify the output
*/

public class Driver {

  /*
   * Reuse the code from the Point class
   * Calculate the distance between two points
   */
  public static double distance(Point a, Point b) {
    return Point.distance(a, b);
  }

  public static void main(String[] args) {
    Point point1 = new Point(4, 6);
    Point point2 = new Point(-2, 4);

    // Using the distance method in the Driver class
    System.out.println(distance(point1, point2));

    // Using the distance method in the Point class
    System.out.println(Point.distance(point1, point2));

    // Using the distanceTo method in the Point class
    System.out.println(point1.distanceTo(point2));
  }
}


/*
 * There are 3 different distance method called in the main method:
 * 1. distance(point1, point2)
 * 2. Point.distance(point1, point2)
 * 3. point1.distanceTo(point2)
 * 
 * For each of those methods respond the following questions:
 * 1. Where is the method implemented (which class)? Justify your answer.
 * 
 * 1. The 1st method is implmented in line 11 of Driver.
 * 2. The 2nd method is implmented in line 12 in the Point class.
 * 3. The 3rd method is implmented in line 13 in the point1 class.
 * 
 * 2. Is the method static or non-static? Justify your answer.
 * 
 * The first 2 are static and the last one is nonstatic because it is called by
 * an object.
 */

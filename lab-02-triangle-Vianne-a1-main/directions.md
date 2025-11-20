### Write the Triangle class

Instance variables: There are 3 instance variables which are Point objects:

- v1 Point
- v2 Point
- v3 Point

Constructors:

- Triangle( double x1, double y1, double x2, double y2, double x3, double y3)

- Triangle( Point v1, Point v2, Point v3) 

 Methods:
 
 - getVertex: Receives one parameter: 1, 2, 3 and returns the corresponding vertex v1, v2 or v3.
   
   ```Point getVertex(int v)```
   
- setVertex: Takes an int that is: 1, 2, 3 and a Point object. It replaces the corresponding vertex v1, v2, or v3 with the specified Point. v is 1, 2, or 3.
  
  ```void setVertex(int v,Point p)```
  
 - toString: Returns a string in the format { v1, v2, v3 } Replace v1, v2, v3 with the toString of the Point object. The output should look like this "{(1.0, 2.0), (10.0, 2.5), (-2, 4.8)}"
   
   ```String toString()```
   
 - getPerimeter: Returns a double that is the perimeter of the Triangle
   
   ```double getPerimeter()```

### Test Cases

- Create multiple triangles to test your code, more than 3 cases.
- Test each method on different triangles
- Change each vertex, and test your methods
- Check the perimeter calculation

### ADITIONAL FEATURES WILL BE ADDED SOON.

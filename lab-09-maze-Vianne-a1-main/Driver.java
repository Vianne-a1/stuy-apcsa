import java.io.FileNotFoundException;

public class Driver{
  public static void main(String[]args){

    Maze car;
    car = new Maze(8, 8);
    System.out.println(car.toString()); 
    
    //files do not require an extension (.txt or .dat)
    String filename = "files/maze5";
    
    if(args.length > 0){
      filename = args[0];
    }

    try{
      Maze m;
      m = new Maze(filename);
      m.setAnimate(true);
      System.out.println("Number of steps from S to E: " + m.solve());
      System.out.println(m);
    }catch(FileNotFoundException e){
      System.out.println("File not found: " + filename);
    }
    Maze maze = new Maze(25, 25);
// Carve the maze
    maze.carveMaze(1,1);

    System.out.println("Maze:");
    System.out.println(maze);
    System.out.println("Number of steps from S to E: " + maze.solve());
    System.out.println(maze);
}
  }

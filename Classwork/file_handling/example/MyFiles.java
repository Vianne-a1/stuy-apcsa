import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner

public class MyFiles {
  public static void main(String[] args) {
  	createFile();
  	readFile();
  	writeFile();
  }
  
  public static void createFile() {
    try {
      File myFile = new File("filename.txt");
      if (myFile.createNewFile()) {
        System.out.println("File created: " + myFile.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  

  public static void writeFile() {
    try {
      FileWriter myWriter = new FileWriter("writeme.txt");
      myWriter.write("This is a test.\nAnother test.");
      myWriter.close();
      System.out.println("Successfully!!!");
    } catch (IOException e) {
      System.out.println("Error!!!");
      e.printStackTrace();
    }
  }

  //Interver.parseInt(str)
  public static void readFile() {
    try {
      File file = new File("readme.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
        System.out.println(line);
      }
      input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }

  }

}


import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        try {
            // Bronze problem
            String bronzeInputFilename = "files/makelake.1.in"; // Replace with the actual input file name + path
            long bronzeResult = Bronze.solve(bronzeInputFilename);
            System.out.println("Bronze problem result: " + bronzeResult);

            // Silver problem
            String silverInputFilename = "files/ctravel.2.in"; // Replace with the actual input file name + path
            long silverResult = Silver.solve(silverInputFilename);
            System.out.println("Silver problem result: " + silverResult);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

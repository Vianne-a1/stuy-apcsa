import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){

        try{
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int row = 1;
    int column = 1;
    File mf = new File("/workspaces/apcsa-assignments-Vianne-a1/Classwork/Advent_of_code_2016/Steps.txt");
    Scanner steps = new Scanner(mf);
    while(steps.hasNextLine()){
        String line = steps.nextLine();
        //System.out.print(line);
        for (int i = 0; i < line.length(); i ++){
            char target = line.charAt(i);
            if (target == 'U'){
                if (row != 0){
                    row --;
                }
                //row = Math.abs(row);
            }
            else if (target == 'D'){
                if (row != 2){
                    row ++;
                }
            }
            else if (target == 'R'){
                if (column != 2){
                    column ++;
                }
            }
            else if (target == 'L'){
                if (column != 0){
                    column --;
                }
            }
            }
            //System.out.println(row);
            //System.out.println(column);
            //row = Math.abs(row);
            //column = Math.abs(column);
            int start = keypad[row][column];
        System.out.println(start);
        }



    steps.close();

        }

catch(IOException e) {
    System.out.print("Wrong");
    e.printStackTrace();
}

}
}
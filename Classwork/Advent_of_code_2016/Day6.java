import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day6{
    public static void main(String[] args){
        try{
            File totallyworkinginfo = new File("/workspaces/apcsa-assignments-Vianne-a1/Classwork/Advent_of_code_2016/Day6.txt");
            Scanner scan = new Scanner(totallyworkinginfo);

            char[][] ikwhatimdoing = new char[650][8];

            int r = 0;
            while (scan.hasNextLine()){
                String yep = scan.nextLine();
                char[] yay = yep.toCharArray();
                ikwhatimdoing[r++] = yay;
            }

            for (int y = 0; y < 8; y ++){
                //String line = scan.nextLine();
                int max = 0;
                char target = 'a';
                for (int i = 0; i < 650; i ++){
                    char sub = ikwhatimdoing[i][y];
                    int count = 0;
                    for (int x = 0; x < 650; x ++){
                        char current = ikwhatimdoing[x][y];
                        if (sub == current){
                            count ++;
                        }
                    }
                    if (count > max){
                        max = count;
                        target = sub;
                        //System.out.println(target);
                    }
                }
                System.out.print(target);
            }

            scan.close();
    }



catch(IOException e) {
    System.out.print("Wrong");
    e.printStackTrace();
}
    }
}
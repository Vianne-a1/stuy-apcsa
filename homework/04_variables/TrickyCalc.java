/* Create a file TrickyCalc.java and copy the following code inside. Run the program. Create a file answers.txt or answers.md and respond to the following questions:
What do you notice about the mySum value?
What is the value of checkResult, and why do we get that result?
*/

public class TrickyCalc{
   public static void main(String[] args){
       double mySum = 0.1 + 0.1 +0.1;
       double tmp = 0.3;
       boolean checkResult = mySum == tmp;

       System.out.println("0.1 + 0.1 + 0.1 = " + mySum);
       System.out.println(mySum + " == " + tmp + " is " + checkResult);
   }
}

/*
Results: 
0.1 + 0.1 + 0.1 = 0.30000000000000004
0.30000000000000004 == 0.3 is false

  */

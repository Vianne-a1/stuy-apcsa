/* Go inside the folder homework, and create a folder 04_variables. Inside this folder, you will write the following programs:

Write a Java program (Temperature.java) to convert temperature from Fahrenheit to Celsius degrees. You must use variables.
Output:

50.0 degrees Fahrenheit is equal to 10.0 Celsius
*/

public class Temperature {
    public static void main(String[] args) {
        double F = 50.0;
        double diff = (F - 32.0);
        double quo = 5 * diff;
        double Cels = quo / 9;
        System.out.print(F + " degreees Fahrenheit is equal to " + Cels + " Celsius");
    }
}

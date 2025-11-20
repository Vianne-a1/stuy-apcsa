public class exempt{
    public static void main(String[] args) {
    try{
        int a = 0;
    int b = 0;
    int c = a/b;
    }
    catch(ArithmeticException c){
        System.out.println("Error Division by zero");
     c.printStackTrace();
    }
}
}
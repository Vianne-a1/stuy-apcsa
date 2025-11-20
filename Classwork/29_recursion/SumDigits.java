public class SumDigits{
    public static int main(int n){
        int sum;
        if (n<10){
return n;
        }
        else{
            sum =+ n%10;
            main(n/10);
        }
        return sum;
    }

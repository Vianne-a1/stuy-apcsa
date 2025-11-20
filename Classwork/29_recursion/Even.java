public class Even{
    public static boolean main(int n){
    if ((n/2) == 0){
    return true;}
    if ((n/2) == 1){
    return false;}
    else main(n/2);
    return (main(5));      
}}
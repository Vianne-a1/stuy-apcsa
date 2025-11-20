public class Driver {
    public static void main(String[] args) {

        RationalNumber q = new RationalNumber(3, 5);
        RationalNumber r = new RationalNumber(2, 3);
        RationalNumber s = new RationalNumber(5, 9);
        RationalNumber t = new RationalNumber(50, 81);
        System.out.println("Expected 2/9: " + q.multiply(r).multiply(s));
        System.out.println("Expected 81/50: " + q.divide(r).divide(s));
        System.out.println("Expected 1: " + q.divide(r).divide(s).multiply(t));
        RealNumber two = new RealNumber(2.0);
        System.out.println("Expected 0.81 : " + q.divide(r).divide(s).divide(two));
    }
}
public class hanoiSpicy{

    public static void hanoi(int n, char sourceRod, char destinationRod, char auxiliaryRod) {
        arraylist something here to make the rod arrays i'm so sleepy oml
        
        if (n == 1) {
            System.out.println("Move ring " + n + " from source " + sourceRod + " to destination " + destinationRod);
            System.out.println("Current State of rods");
            System.out.println("Rod A:" + roda);
            System.out.println("Rod B:" + rodb);
            System.out.println("Rod C:" + rodc);
        } else {
            hanoi(n - 1, sourceRod, auxiliaryRod, destinationRod);
            System.out.println("Move ring " + n + " from source " + sourceRod + " to destination " + destinationRod);
            hanoi(n - 1, auxiliaryRod, destinationRod, sourceRod);
        }
    }

    public static void main(String[] args) {
        int numberOfRings = 3; // Change this to the desired number of rings
        char sourceRod = 'A';
        char destinationRod = 'C';
        char auxiliaryRod = 'B';

        hanoi(numberOfRings, sourceRod, destinationRod, auxiliaryRod);

        
    }
}

//recursion
//random class (basic methods and how to generate random number within certain range

//not sorting or inheritance) for sa
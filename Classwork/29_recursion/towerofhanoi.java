public class towerofhanoi {

    public static void hanoi(int n, char sourceRod, char destinationRod, char auxiliaryRod) {
        if (n == 1) {
            System.out.println("Move ring " + n + " from source " + sourceRod + " to destination " + destinationRod);
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


//p n n>1 n-1


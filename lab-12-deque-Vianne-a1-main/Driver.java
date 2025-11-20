public class Driver {
    public static void main(String[] args) {

        //CHAT GPT'D DRIVER!!!!!!! (Sorry I'm using AI for Drivers recently, I have a math test tmr and I kinda need to relearn the whole unit tonight :/)
        // Create an integer deque
        MyDeque<Integer> intDeque = new MyDeque<>(10);
        
        // Add elements to the deque
        for (int i = 1; i <= 5; i++) {
            intDeque.addFirst(i);
            intDeque.addLast(i + 5);
        }
        
        // Display the deque
        System.out.println("Integer Deque:");
        System.out.println("Size: " + intDeque.size());
        System.out.println("Contents: " + intDeque);
        System.out.println("First Element: " + intDeque.getFirst());
        System.out.println("Last Element: " + intDeque.getLast());
        
        // Remove elements from the deque
        int removedFirst = intDeque.removeFirst();
        int removedLast = intDeque.removeLast();
        
        // Display the deque after removal
        System.out.println("\nAfter removing first and last elements:");
        System.out.println("Size: " + intDeque.size());
        System.out.println("Contents: " + intDeque);
        System.out.println("First Element Removed: " + removedFirst);
        System.out.println("Last Element Removed: " + removedLast);
        
        // Create a string deque
        MyDeque<String> stringDeque = new MyDeque<>(10);
        
        // Add elements to the string deque
        stringDeque.addFirst("Hello");
        stringDeque.addLast("World");
        
        // Display the string deque
        System.out.println("\nString Deque:");
        System.out.println("Size: " + stringDeque.size());
        System.out.println("Contents: " + stringDeque);
        System.out.println("First Element: " + stringDeque.getFirst());
        System.out.println("Last Element: " + stringDeque.getLast());
    }
}

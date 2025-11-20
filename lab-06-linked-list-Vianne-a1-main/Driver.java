public class Driver {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        // Testing add method
        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println("Original List: " + myList.toString());

        // Testing size method
        System.out.println("Size: " + myList.size());

        // Testing get method
        System.out.println("Element at index 1: " + myList.get(1));

        // Testing add(index, element) method
        myList.add(1, "D");
        System.out.println("List after adding 'D' at index 1: " + myList.toString());

        // Testing set method
        String oldValue = myList.set(2, "E");
        System.out.println("List after setting 'E' at index 2: " + myList.toString());
        System.out.println("Original value at index 2: " + oldValue);

        // Testing contains method
        System.out.println("Contains 'B'? " + myList.contains("B"));

        // Testing remove(index) method
        String removedValue1 = myList.remove(1);
        System.out.println("List after removing element at index 1: " + myList.toString());
        System.out.println("Removed value: " + removedValue1);

        // Testing remove(element) method
        myList.remove("C");
        System.out.println("List after removing element 'C': " + myList.toString());

        // Testing toStringReversed method
        System.out.println("Reversed List: " + myList.toStringReversed());
        System.out.println("\n-------------------------------------------------\n");

        MyLinkedList list2 = new MyLinkedList();

        // Testing add method
        list2.add("X");
        list2.add("Y");
        list2.add("Z");
        System.out.println("Original List: " + list2.toString());

        // Testing size method
        System.out.println("Size: " + list2.size());

        // Testing get method
        System.out.println("Element at index 1: " + list2.get(1));

        // Testing add(index, element) method
        list2.add(1, "W");
        System.out.println("List after adding 'W' at index 1: " + list2.toString());

        // Testing set method
        String oldValue2 = list2.set(2, "V");
        System.out.println("List after setting 'V' at index 2: " + list2.toString());
        System.out.println("Original value at index 2: " + oldValue2);

        // Testing contains method
        System.out.println("Contains 'Y'? " + list2.contains("Y"));

        // Testing remove(index) method
        String removedValue2 = list2.remove(1);
        System.out.println("List after removing element at index 1: " + list2.toString());
        System.out.println("Removed value: " + removedValue2);

        // Testing remove(element) method
        list2.remove("Z");
        System.out.println("List after removing element 'Z': " + list2.toString());

        // Testing toStringReversed method
        System.out.println("Reversed List: " + list2.toStringReversed());
        System.out.println("\n-------------------------------------------------\n");


        // Adding a more Readable test case
        MyLinkedList ReadableList = new MyLinkedList();

        // Adding elements
        ReadableList.add("One");
        ReadableList.add("Two");
        ReadableList.add("Three");

        // Displaying the list
        System.out.println("Readable List: " + ReadableList.toString());

        // Testing add(index, element) method
        ReadableList.add(1, "Inserted");
        System.out.println("List after adding 'Inserted' at index 1: " + ReadableList.toString());

        // Testing set method
        String oldReadableValue = ReadableList.set(2, "Modified");
        System.out.println("List after setting 'Modified' at index 2: " + ReadableList.toString());
        System.out.println("Original value at index 2: " + oldReadableValue);

        // Testing contains method
        System.out.println("Contains 'Two'? " + ReadableList.contains("Two"));

        // Testing remove(element) method
        ReadableList.remove("Three");
        System.out.println("List after removing element 'Three': " + ReadableList.toString());

        // Testing toStringReversed method
        System.out.println("Reversed List: " + ReadableList.toStringReversed());
        System.out.println("\n-------------------------------------------------\n");
    }
}

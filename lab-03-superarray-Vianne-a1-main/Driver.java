public class Driver {
    public static void main(String[] args) {
        // Create a SuperArray with an initial capacity of 5
        SuperArray superArray = new SuperArray(5);
System.out.println("Case #1");
        // Add elements to the SuperArray
        superArray.add("A");
        superArray.add("B");
        superArray.add("C");
        superArray.add("D");
        superArray.add("F");

        // Test the toString method
        System.out.println("SuperArray: " + superArray.toString());

        // Test the size method
        System.out.println("Size of SuperArray: " + superArray.size());

        // Test the get method
        System.out.println("Element at index 2: " + superArray.get(2));

        // Test the set method
        System.out.println("Replacing element at index 3: " + superArray.set(3, "G"));
        System.out.println("SuperArray after set: " + superArray.toString());

        // Test the remove method
        System.out.println("Removed element at index 1: " + superArray.remove(1));
        System.out.println("SuperArray after remove: " + superArray.toString());

        // Test the indexOf method
        System.out.println("Index of 'C': " + superArray.indexOf("C"));

        // Test the lastIndexOf method
        System.out.println("Last index of 'B': " + superArray.lastIndexOf("B"));

        // Test the add method with an index
        superArray.add(2, "E");
        System.out.println("SuperArray after adding 'E' at index 2: " + superArray.toString());

        // Test the remove method by target value
        System.out.println("Remove 'A': " + superArray.remove("A"));
        System.out.println("SuperArray after remove by target: " + superArray.toString());
//case 2
System.out.println("Case #2");
        SuperArray Fruits = new SuperArray(5);

        Fruits.add("Apple");
         Fruits.add("Banana");
         Fruits.add("Cherry");
         Fruits.add("Date");
         Fruits.add("Fig");

        System.out.println("1. Size of SuperArray: " + Fruits.size());
        System.out.println("2. SuperArray: " + Fruits.toString());

        int indexToGet = 2;
        System.out.println("3. Element at index " + indexToGet + ": " + Fruits.get(indexToGet));

        int indexToSet = 3;
        String newValue = "Grape";
        String oldValue = Fruits.set(indexToSet, newValue);
        System.out.println("4. Set element at index " + indexToSet + " to " + newValue + ", previous value was: " + oldValue);

        int indexToRemove = 1;
        String removedValue = Fruits.remove(indexToRemove);
        System.out.println("5. Removed element at index " + indexToRemove + ": " + removedValue);

        System.out.println("6. Updated SuperArray: " + Fruits.toString());

        String valueToRemove = "Cherry";
        boolean removedByValue = Fruits.remove(valueToRemove);
        System.out.println("7. Removed element with value '" + valueToRemove + "': " + removedByValue);

        System.out.println("8. Updated SuperArray: " + Fruits.toString());

        String targetValue = "Date";
        int indexOfValue = Fruits.indexOf(targetValue);
        System.out.println("9. Index of value '" + targetValue + "': " + indexOfValue);

        int lastIndexOfValue = Fruits.lastIndexOf(targetValue);
        System.out.println("10. Last index of value '" + targetValue + "': " + lastIndexOfValue);

        int indexToAdd = 1;
        String valueToAdd = "Blueberry";
        Fruits.add(indexToAdd, valueToAdd);

        System.out.println("11. Updated SuperArray: " + Fruits.toString());
    }
    }

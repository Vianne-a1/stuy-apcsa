import java.util.ArrayList;

public class StudyAtHome {
    public static void main(String[] args) {
        // Create an ArrayList to store the to-do list items
        ArrayList<String> toDoList = new ArrayList<>();

        // Add to-do list items
        toDoList.add("Review the lessons");
        toDoList.add("Drink water");
        toDoList.add("Work on the lab");

        // Changing element 1
        toDoList.set(1, "Do homework");

        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList.get(0));

        // Remove item 0 and move everything down
        toDoList.remove(0);

        System.out.println("Here's the next thing to do: " + toDoList.get(0));
    }
}

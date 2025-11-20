
import java.util.ArrayDeque;

public class Frontier {
    private ArrayDeque<int[]> frontier; // Replace ? with the type you want for your frontier

    public Frontier() { 
        frontier = new ArrayDeque<>();
    }

    public void add(int[] location) {
        frontier.add(location);
    }

    public int[] remove() {
        return frontier.remove();
    }

    public int size() {
        return frontier.size();
    }
}

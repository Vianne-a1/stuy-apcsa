import java.util.HashSet;

public class Day1P2 {
    public static void main(String[] args) {
        String instructions = "R2, L1, R2, R1, R1, L3, R3, L5, L5, L2, L1, R4, R1, R3, L5, L5, R3, L4, L4, R5, R4, R3, L1, L2, R5, R4, L2, R1, R4, R4, L2, L1, L1, R190, R3, L4, R52, R5, R3, L5, R3, R2, R1, L5, L5, L4, R2, L3, R3, L1, L3, R5, L3, L4, R3, R77, R3, L2, R189, R4, R2, L2, R2, L1, R5, R4, R4, R2, L2, L2, L5, L1, R1, R2, L3, L4, L5, R1, L1, L2, L2, R2, L3, R3, L4, L1, L5, L4, L4, R3, R5, L2, R4, R5, R3, L2, L2, L4, L2, R2, L5, L4, R3, R1, L2, R2, R4, L1, L4, L4, L2, R2, L4, L1, L1, R4, L1, L3, L2, L2, L5, R5, R2, R5, L1, L5, R2, R4, R4, L2, R5, L5, R5, R5, L4, R2, R1, R1, R3, L3, L3, L4, L3, L2, L2, L2, R2, L1, L3, R2, R5, R5, L4, R3, L3, L4, R2, L5, R5";

        int blocksAway = calculateBlocksAway(instructions);
        System.out.println("Blocks away from the starting point to the first location visited twice: " + blocksAway);
    }

    private static int calculateBlocksAway(String instructions) {
        String[] moves = instructions.split(", ");
        int x = 0, y = 0, direction = 0;
        HashSet<String> visitedLocations = new HashSet<>();

        for (String move : moves) {
            char turn = move.charAt(0);
            int distance = Integer.parseInt(move.substring(1));

            direction = (turn == 'R') ? (direction + 1) % 4 : (direction + 3) % 4;

            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                }

                String location = x + "," + y;
                if (!visitedLocations.add(location)) {
                    return Math.abs(x) + Math.abs(y);
                }
            }
        }
        return -1; // No location visited twice
    }
}

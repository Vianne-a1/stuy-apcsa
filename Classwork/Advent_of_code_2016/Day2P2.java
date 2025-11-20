import java.util.HashMap;

public class Day2P2 {
    public static void main(String[] args) {
        String instructions = "LLRRLLRLDDUURLLRDUUUDULUDLUULDRDDDULLLRDDLLLRRDDRRUDDURDURLRDDULRRRLLULLULLRUULDLDDDUUURRRRURURDUDLLRRLDLLRRDRDLLLDDRRLUDDLDDLRDRDRDDRUDDRUUURLDUDRRLULLLDRDRRDLLRRLDLDRRRRLURLLURLRDLLRUDDRLRDRRURLDULURDLUUDURLDRURDRDLULLLLDUDRLLURRLRURUURDRRRULLRULLDRRDDDULDURDRDDRDUDUDRURRRRUUURRDUUDUDDDLRRUUDDUUDDDUDLDRDLRDUULLRUUDRRRDURLDDDLDLUULUDLLRDUDDDDLDURRRDRLLRUUUUDRLULLUUDRLLRDLURLURUDURULUDULUDURUDDULDLDLRRUUDRDDDRLLRRRRLDRRRD";

        String codePart2 = calculateBathroomCode(instructions, getKeypadPart2());
        System.out.println("Bathroom Code (Part 2): " + codePart2);
    }

    private static String calculateBathroomCode(String instructions, HashMap<Character, String> keypad) {
        StringBuilder code = new StringBuilder();
        int currentRow = 2;
        int currentCol = 0;

        for (char instruction : instructions.toCharArray()) {
            String possibleMoves = keypad.get(instruction);
            for (char move : possibleMoves.toCharArray()) {
                switch (move) {
                    case 'U':
                        if (currentRow > 0) {
                            currentRow--;
                        }
                        break;
                    case 'D':
                        if (currentRow < 4) {
                            currentRow++;
                        }
                        break;
                    case 'L':
                        if (currentCol > 0) {
                            currentCol--;
                        }
                        break;
                    case 'R':
                        if (currentCol < 4) {
                            currentCol++;
                        }
                        break;
                }
            }
            code.append(keypad.get(instruction).charAt(currentRow * 5 + currentCol));
        }

        return code.toString();
    }

    private static HashMap<Character, String> getKeypadPart2() {
        // Keypad configuration for Part 2
        HashMap<Character, String> keypad = new HashMap<>();
        keypad.put('1', "00100");
        keypad.put('2', "01230");
        keypad.put('3', "04560");
        keypad.put('4', "07890");
        keypad.put('5', "0ABC0");
        keypad.put('6', "12D34");
        keypad.put('7', "25E67");
        keypad.put('8', "38F9A");
        keypad.put('9', "4BCD0");
        keypad.put('0', "567E0");
        keypad.put('A', "89AFB");
        keypad.put('B', "CDGHE");
        keypad.put('C', "0DHI0");
        keypad.put('D', "ABCFE");
        keypad.put('E', "9D0HG");
        keypad.put('F', "BCGEH");
        keypad.put('G', "CD0F0");
        keypad.put('H', "E9GBI");
        keypad.put('I', "0H0C0");
        return keypad;
    }
}

public class Day1{

    public static void main(String[] args) {
        String str = "R2, L1, R2, R1, R1, L3, R3, L5, L5, L2, L1, R4, R1, R3, L5, L5, R3, L4, L4, R5, R4, R3, L1, L2, R5, R4, L2, R1, R4, R4, L2, L1, L1, R190, R3, L4, R52, R5, R3, L5, R3, R2, R1, L5, L5, L4, R2, L3, R3, L1, L3, R5, L3, L4, R3, R77, R3, L2, R189, R4, R2, L2, R2, L1, R5, R4, R4, R2, L2, L2, L5, L1, R1, R2, L3, L4, L5, R1, L1, L2, L2, R2, L3, R3, L4, L1, L5, L4, L4, R3, R5, L2, R4, R5, R3, L2, L2, L4, L2, R2, L5, L4, R3, R1, L2, R2, R4, L1, L4, L4, L2, R2, L4, L1, L1, R4, L1, L3, L2, L2, L5, R5, R2, R5, L1, L5, R2, R4, R4, L2, R5, L5, R5, R5, L4, R2, R1, R1, R3, L3, L3, L4, L3, L2, L2, L2, R2, L1, L3, R2, R5, R5, L4, R3, L3, L4, R2, L5, R5";

        int xcor = 0;
        int ycor = 0;
        int angle = 0;

        // Converting using String.split() method with comma as a delimiter
        String[] arr = str.split(", ");
        for (String element : arr) {
            int steps = Integer.parseInt(element.substring(1));
            switch (element.charAt(0)) {
                case 'L':
                    angle += 270;
                    break;
                case 'R':
                    angle += 90;
                    break;
            }
            if ((angle % 360) == 0) {
                ycor += steps;
            }
            if ((angle % 360) == 90) {
                xcor += steps;
            }
            if ((angle % 360) == 180) {
                ycor -= steps;
            }
            if ((angle % 360) == 270) {
                xcor -= steps;
            }
        }

        System.out.println(xcor + " " + ycor);
        System.out.println(Math.abs(xcor) + " " + Math.abs(ycor));
        System.out.println(Math.abs(xcor) + Math.abs(ycor));
        System.out.print(xcor + ycor);
    }
}
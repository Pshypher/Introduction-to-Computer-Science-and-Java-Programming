package section_1_2.creative_exercises;

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);

        int midValueA = Math.max(a, b);
        int midValueB = Math.max(a, c);
        int midValueC = Math.max(b, c);
        int middle = Math.min(midValueA, midValueB);
        middle = Math.min(middle, midValueC);

        int maximum = Math.max(a, b);
        maximum = Math.max(maximum, c);

        System.out.println(minimum + " < " + middle + " < " + maximum);
    }
}

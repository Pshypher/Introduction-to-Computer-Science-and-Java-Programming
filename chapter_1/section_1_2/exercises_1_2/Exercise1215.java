package section_1_2.exercises_1_2;

public class Exercise1215 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean withPossibleTriangleSides;
        withPossibleTriangleSides = (a + b) > c && (a + c) > b && (b + c) > a;
        System.out.print("Has possible side lengths of a triangle? " + withPossibleTriangleSides);
    }
}

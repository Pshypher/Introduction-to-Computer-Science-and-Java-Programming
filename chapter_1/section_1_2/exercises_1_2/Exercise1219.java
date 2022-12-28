package section_1_2.exercises_1_2;

public class Exercise1219 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int range = b - a;
        long result = Math.round(Math.random() * range) + a;
        System.out.println("Random number between " + a + " and " + b + ": " + result);
    }
}

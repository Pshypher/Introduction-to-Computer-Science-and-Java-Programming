package section_1_2.exercises_1_2;

public class Exercise1222 {
    private static final double GRAVITATIONAL_CONSTANT = 9.80665;

    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double result = x0 + (v0 * t) - (GRAVITATIONAL_CONSTANT * t * t / 2);
        System.out.println("Displacement after " + t + " seconds from initial position " + x0 +
                " at an initial velocity of " + v0 + " meters per second: " + result);
    }
}

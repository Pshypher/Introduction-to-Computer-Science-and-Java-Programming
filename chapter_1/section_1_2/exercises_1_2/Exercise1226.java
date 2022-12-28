package section_1_2.exercises_1_2;

public class Exercise1226 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        System.out.println("r: " + r + ", \u03B8: " + theta + " at cartesian coordinate (" + x + ", " + y + ")");
    }
}

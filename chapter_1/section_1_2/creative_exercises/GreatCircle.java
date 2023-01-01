package section_1_2.creative_exercises;

public class GreatCircle {
    public static void main(String[] args) {
        double y1 = Math.toRadians(Double.parseDouble(args[0]));
        double x1 = Math.toRadians(Double.parseDouble(args[1]));
        double y2 = Math.toRadians(Double.parseDouble(args[2]));
        double x2 = Math.toRadians(Double.parseDouble(args[3]));

        double distance = 60 * Math.toDegrees(
                Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println("Distance between (" + Math.toDegrees(x1) + ", " + Math.toDegrees(y1) +
                ") and (" + Math.toDegrees(x2) + ", " + Math.toDegrees(y2) + "): " + distance);
    }
}

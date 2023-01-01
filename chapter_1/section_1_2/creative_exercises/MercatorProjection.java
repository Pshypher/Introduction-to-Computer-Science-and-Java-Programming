package section_1_2.creative_exercises;

public class MercatorProjection {
    public static void main(String[] args) {
        double center = Double.parseDouble(args[0]);
        double longitude = Double.parseDouble(args[1]);
        double latitude = Double.parseDouble(args[2]);

        double x = longitude - center;
        double y = 1.0 / 2.0 * Math.log((1 + Math.sin(latitude)) / (1 - Math.sin(latitude)));

        System.out.println("\u039B: " + longitude + ", \u03C6: " + latitude +
                " corresponds to x: " + x + ", y: " + y);
    }
}

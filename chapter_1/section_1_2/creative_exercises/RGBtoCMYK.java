package section_1_2.creative_exercises;

public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = Math.max(r / 255.0, g / 255.0);
        w = Math.max(w, b / 255.0);
        double k = 1 - w;

        double c = (w - (r / 255.0)) / w;
        double m = (w - (g / 255.0)) / w;
        double y = (w - (b / 255.0)) / w;

        System.out.println("Cyan: " + c + ", Magenta: " + m + ", Yellow: " + y + ", Black: " + k);
    }
}

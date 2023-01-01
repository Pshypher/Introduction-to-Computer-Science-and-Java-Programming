package section_1_2.exercises;

public class Exercise1218 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Euclidean distance of point (" + x + ", " + y + ") from (0, 0): " + distance);
    }
}

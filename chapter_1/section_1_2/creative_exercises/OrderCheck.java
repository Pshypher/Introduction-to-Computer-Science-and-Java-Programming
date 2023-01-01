package section_1_2.creative_exercises;

public class OrderCheck {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean isOrdered = (x > y && y > z) || (x < y && y < z);
        System.out.println("Is " + x + ", " + y + ", " + z + " strictly ordered? " + isOrdered);
    }
}

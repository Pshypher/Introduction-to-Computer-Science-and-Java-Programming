package section_1_2.exercises_1_2;

public class Exercise1220 {
    private static final int DICE_RANGE = 5;

    public static void main(String[] args) {
        int dice_a = (int) (Math.round(Math.random() * DICE_RANGE) + 1);
        int dice_b = (int) (Math.round(Math.random() * DICE_RANGE) + 1);

        int total = dice_a + dice_b;
        System.out.println(dice_a + " + " + dice_b + " = " + total);
    }
}

package section_1_2.creative_exercises;

public class DragonCurves {
    public static void main(String[] args) {
        String zeroOrder = "F";
        String firstOrder = zeroOrder + "L" + zeroOrder;
        String rFirstOrder = zeroOrder + "R" + zeroOrder;
        String secondOrder = firstOrder + "L" + rFirstOrder;
        String rSecondOrder = firstOrder + "R" + rFirstOrder;
        String thirdOrder = secondOrder + "L" + rSecondOrder;
        String rThirdOrder = secondOrder + "R" + rSecondOrder;
        String fourthOrder = thirdOrder + "L" + rThirdOrder;
        String rFourthOrder = thirdOrder + "R" + rThirdOrder;
        String fifthOrder = fourthOrder + "L" + rFourthOrder;

        System.out.println("Zero order: " + zeroOrder);
        System.out.println("First order: " + firstOrder);
        System.out.println("Second order: " + secondOrder);
        System.out.println("Third order: " + thirdOrder);
        System.out.println("Fourth order: " + fourthOrder);
        System.out.println("Fifth order: " + fifthOrder);
    }
}

package section_1_2.exercises;

public class Exercise1214 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean isEvenlyDivided = (a % b == 0) || (b % a == 0);
        System.out.println(a + " % " + b + " = 0 or " + b + " % " + a + " = 0; " +
                "is evenly divisible: " + isEvenlyDivided);
    }
}

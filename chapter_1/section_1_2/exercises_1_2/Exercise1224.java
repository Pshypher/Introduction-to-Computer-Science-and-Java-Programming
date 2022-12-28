package section_1_2.exercises_1_2;

public class Exercise1224 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);

        double interest = P * Math.exp(r * t);
        System.out.println("Compound interest with principal " + P + " at a rate of " + r
                + " after " + t + " years is " + interest);
    }
}

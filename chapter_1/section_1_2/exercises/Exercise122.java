package section_1_2.exercises;

public class Exercise122 {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double result = Math.pow(Math.sin(theta), 2) +
                Math.pow(Math.cos(theta), 2);
        System.out.println("Math.sin(" + args[0] + ")^2 + Math.cos(" + args[0] +
                ")^2 = " + result);
    }
}

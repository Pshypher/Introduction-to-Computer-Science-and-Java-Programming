package section_1_2.creative_exercises;

public class UniformRandomNumber {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);
        minimum = Math.min(minimum, d);
        minimum = Math.min(minimum, e);

        double maximum = Math.max(a, b);
        maximum = Math.max(maximum, c);
        maximum = Math.max(maximum, d);
        maximum = Math.max(maximum, e);

        double average = (a + b + c + d + e) / 5;

        System.out.println("Minimum: " + minimum + ", maximum: " + maximum + " average: " + average);
    }
}

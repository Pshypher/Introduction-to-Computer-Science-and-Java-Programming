package section_1_2.exercises_1_2;

public class RandomGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double r = Math.sin(2 * Math.PI * v) * Math.pow((-2 * Math.log(u)), (1.0 / 2.0));
        System.out.println("Gaussian number: " + r);
    }
}

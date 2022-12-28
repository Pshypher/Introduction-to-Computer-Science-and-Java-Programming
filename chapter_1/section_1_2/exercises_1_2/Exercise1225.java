package section_1_2.exercises_1_2;

public class Exercise1225 {
    public static void main(String[] args) {
        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);
        double wind_chill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);

        System.out.println("Wind chill at " + temperature + " fahrenheit and " + velocity +
                " miles per hour = " + wind_chill);
    }
}

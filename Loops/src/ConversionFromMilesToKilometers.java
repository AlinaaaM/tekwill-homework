public class ConversionFromMilesToKilometers {
    public static void main(String[] args) {
        final double MILES_KILOMETERS = 1.609;
        System.out.println("MILES        KILOMETERS");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "          " + (i + MILES_KILOMETERS));
        }
    }
}

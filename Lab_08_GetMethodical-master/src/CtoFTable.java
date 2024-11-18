public class CtoFTable {

    public static void main(String[] args) {
        // Header for the table
        System.out.printf("%-10s %-10s %n", "Celsius", "Fahrenheit");
        System.out.printf("------------------------- %n");

        // Loop from -100 to 100 Celsius and print the corresponding Fahrenheit values
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d %-10.2f %n", celsius, fahrenheit);
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

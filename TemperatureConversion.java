import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value: ");c
        double temperature = scanner.nextDouble();

        System.out.println("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.printf("%.2f °C = %.2f °F%n", temperature, celsiusToFahrenheit(temperature));
                System.out.printf("%.2f °C = %.2f K%n", temperature, celsiusToKelvin(temperature));
                break;
            case 'F':
                System.out.printf("%.2f °F = %.2f °C%n", temperature, fahrenheitToCelsius(temperature));
                System.out.printf("%.2f °F = %.2f K%n", temperature, fahrenheitToKelvin(temperature));
                break;
            case 'K':
                System.out.printf("%.2f K = %.2f °C%n", temperature, kelvinToCelsius(temperature));
                System.out.printf("%.2f K = %.2f °F%n", temperature, kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid unit entered!");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
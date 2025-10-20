import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            sc.close();
            return;
        }

        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura original: %.2f °C%n", celsius);
        System.out.printf("Convertida para Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Convertida para Kelvin: %.2f K%n", kelvin);

        sc.close();
    }
}
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Calcula a temperatura em Celsius usando a fórmula C = (5 * (F - 32) / 9)
        double temperaturaCelsius = (5 * (temperaturaFahrenheit - 32)) / 9;

        // Imprime as temperaturas em Fahrenheit e Celsius
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", temperaturaFahrenheit);
        System.out.printf("Temperatura correspondente em Celsius: %.2f°C%n", temperaturaCelsius);

        // Fecha o scanner
        scanner.close();
    }
}
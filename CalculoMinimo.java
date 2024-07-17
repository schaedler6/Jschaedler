import java.util.Scanner;

public class CalculoMinimo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Define o valor do salário mínimo
        double salarioMinimo = 1293.20;

        // Solicita e lê o valor do salário do usuário
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        // Calcula quantos salários mínimos o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Imprime o resultado na tela
        System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        // Fecha o scanner
        scanner.close();
    }
}
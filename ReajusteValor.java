import java.util.Scanner;

public class ReajusteValor {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê um valor do usuário
        System.out.print("Digite um valor: ");
        // Verifica se a entrada é um número válido
        if (scanner.hasNextDouble()) {
            double valor = scanner.nextDouble();
            // Calcula o valor com reajuste de 5%
            double valorReajustado = valor * 1.05;
            // Imprime o valor reajustado na tela
            System.out.printf("O valor com reajuste de 5%% é: %.2f%n", valorReajustado);
        } else {
            System.out.println("Por favor, insira um valor numérico válido.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
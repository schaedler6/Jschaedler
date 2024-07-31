import java.util.Scanner;

public class SomaAB {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor de A
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        // Solicita e lê o valor de B
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Solicita e lê o valor de C
        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        // Calcula a soma de A e B
        int soma = a + b;

        // Exibe a soma de A e B
        System.out.println("A soma entre A e B é: " + soma);

        // Verifica se a soma é menor que C e exibe a mensagem correspondente
        if (soma < c) {
            System.out.println("A soma é menor que C.");
        } else {
            System.out.println("A soma não é menor que C.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
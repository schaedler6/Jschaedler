import java.util.Scanner;

public class SomaOuMultiplica {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os valores de A e B do usuário
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Declara a variável C
        int c;

        // Verifica se A e B são iguais
        if (a == b) {
            // Se A e B forem iguais, soma os dois valores
            c = a + b;
            System.out.println("Os valores são iguais. A soma de A e B é: " + c);
        } else {
            // Se A e B forem diferentes, multiplica os dois valores
            c = a * b;
            System.out.println("Os valores são diferentes. A multiplicação de A e B é: " + c);
        }

        // Fecha o scanner
        scanner.close();
    }
}
import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor de A
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        // Solicita e lê o valor de B
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Imprime os valores antes da troca
        System.out.println("Antes da troca:");
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        // Realiza a troca dos valores
        int temp = a;
        a = b;
        b = temp;

        // Imprime os valores após a troca
        System.out.println("Depois da troca:");
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        // Fecha o scanner
        scanner.close();
    }
}
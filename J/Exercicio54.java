import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Trocar valores
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
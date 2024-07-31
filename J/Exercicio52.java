import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("\nSoma dos números: " + soma);
    }
}
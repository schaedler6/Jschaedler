import java.util.Scanner;

public class Exercicio51 {
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

        int i = num1;
        int soma = 0;
        while (i <= num2) {
            System.out.print(i + " ");
            soma += i;
            i++;
        }
        System.out.println("\nSoma dos números: " + soma);
    }
}
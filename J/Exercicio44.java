import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        System.out.println("Informe 5 números:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
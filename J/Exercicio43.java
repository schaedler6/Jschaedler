import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int i = 1;
        System.out.println("Informe 5 números:");
        while (i <= 5) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            i++;
        }
        System.out.println("O maior número é: " + maior);
    }
}
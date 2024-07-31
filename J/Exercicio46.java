import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.println("Informe 5 números:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            soma += num;
        }
        double media = (double) soma / 5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
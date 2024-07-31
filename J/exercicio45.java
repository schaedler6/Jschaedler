import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        System.out.println("Informe 5 números:");
        while (i <= 5) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            soma += num;
            i++;
        }
        double media = (double) soma / 5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}

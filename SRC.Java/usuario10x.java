import java.util.Scanner;

public class usuario10x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos 10 números é: " + soma);
        scanner.close();
    }
}
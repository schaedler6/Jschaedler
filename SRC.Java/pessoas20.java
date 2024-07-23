import java.util.Scanner;

public class pessoas20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        System.out.println("A soma das idades é: " + somaIdades);
        scanner.close();
    }
}
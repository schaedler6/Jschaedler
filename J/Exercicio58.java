import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }
    }
}
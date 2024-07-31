import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
            System.out.println("O menor número é: " + num2);
        } else if (num1 < num2) {
            System.out.println("O maior número é: " + num2);
            System.out.println("O menor número é: " + num1);
        } else {
            System.out.println("Os dois números são iguais: " + num1);
        }
    }
}
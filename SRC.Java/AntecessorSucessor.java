import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê um número do usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula o antecessor e o sucessor do número
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Imprime o antecessor e o sucessor na tela
        System.out.println("O antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);

        // Fecha o scanner
        scanner.close();
    }
}
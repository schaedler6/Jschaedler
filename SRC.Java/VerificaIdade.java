import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o nome da pessoa
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Solicita e lê a idade da pessoa
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa é maior ou menor de idade
        String resultado = (idade >= 18) ? "maior de idade" : "menor de idade";

        // Imprime o nome da pessoa e se ela é maior ou menor de idade
        System.out.printf("%s é %s.%n", nome, resultado);

        // Fecha o scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class soma10x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Função para imprimir o nome 10 vezes
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        imprimirNome(nome, 10);
        
        // Função para ler e contar maiores de idade
        int contadorMaioresIdade = lerIdades(scanner, 0, 0);
        System.out.println("Número de pessoas maiores de idade: " + contadorMaioresIdade);
        
        scanner.close();
    }

    public static void imprimirNome(String nome, int vezes) {
        if (vezes > 0) {
            System.out.println(nome);
            imprimirNome(nome, vezes - 1);
        }
    }

    public static int lerIdades(Scanner scanner, int contador, int maioresIdade) {
        if (contador == 20) {
            return maioresIdade;
        }
        
        System.out.print("Digite a idade da pessoa " + (contador + 1) + " (máximo 110 anos): ");
        int idade = scanner.nextInt();
        
        if (idade < 0 || idade > 110) {
            System.out.println("Idade inválida. Por favor, insira uma idade entre 0 e 110 anos.");
            return lerIdades(scanner, contador, maioresIdade);
        }
        
        if (idade >= 18) {
            maioresIdade++;
        }
        
        return lerIdades(scanner, contador + 1, maioresIdade);
    }
}
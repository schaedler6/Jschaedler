import java.util.Scanner;

public class media7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
       
        System.out.println(); // Linha em branco para separar as duas partes

        // Parte 2: Cálculo da Média das Notas
        System.out.println("Cálculo da Média das Notas:");

        // Solicita e lê o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        scanner.nextLine(); // Consumir a nova linha restante
        String nome = scanner.nextLine();

        // Solicita e lê as quatro notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprime o nome do aluno e a média das notas
        System.out.printf("A média das notas do aluno %s é: %.2f%n", nome, media);

        // Verifica se o aluno foi aprovado ou reprovado
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        // Fecha o scanner
        scanner.close();
    }
}
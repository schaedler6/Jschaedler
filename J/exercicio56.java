import java.util.Scanner;

public class exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Informe a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Informe a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Informe a nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.print("Informe a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();
            media = (media * 4 + notaRecuperacao) / 5;
            System.out.println("Nova média: " + media);

            if (media >= 7) {
                System.out.println("Aluno aprovado na recuperação!");
            } else {
                System.out.println("Aluno não aprovado.");
            }
        }
    }
}


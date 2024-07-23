import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lendo as notas do aluno 1
        System.out.println("Digite as notas do aluno 1:");
        System.out.print("Nota 1: ");
        double nota1Aluno1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2Aluno1 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double nota3Aluno1 = entrada.nextDouble();
        calcularEImprimirMedia(nota1Aluno1, nota2Aluno1, nota3Aluno1, 1);

        // Lendo as notas do aluno 2
        System.out.println("Digite as notas do aluno 2:");
        System.out.print("Nota 1: ");
        double nota1Aluno2 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2Aluno2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double nota3Aluno2 = entrada.nextDouble();
        calcularEImprimirMedia(nota1Aluno2, nota2Aluno2, nota3Aluno2, 2);

        // Lendo as notas do aluno 3
        System.out.println("Digite as notas do aluno 3:");
        System.out.print("Nota 1: ");
        double nota1Aluno3 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2Aluno3 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double nota3Aluno3 = entrada.nextDouble();
        calcularEImprimirMedia(nota1Aluno3, nota2Aluno3, nota3Aluno3, 3);

        // Fecha o scanner
        entrada.close();
    }

    public static void calcularEImprimirMedia(double nota1, double nota2, double nota3, int aluno) {
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;
        System.out.printf("A média do aluno %d é: %.2f%n", aluno, media);
    }
}
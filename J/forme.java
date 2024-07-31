import java.util.Scanner;

public class forme {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Arrays para armazenar as notas dos alunos
        double[] notasAluno1 = new double[3];
        double[] notasAluno2 = new double[3];
        double[] notasAluno3 = new double[3];

        // Lendo as notas do aluno 1
        System.out.println("Digite as notas do aluno 1:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno1[i] = entrada.nextDouble();
        }

        // Lendo as notas do aluno 2
        System.out.println("Digite as notas do aluno 2:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno2[i] = entrada.nextDouble();
        }

        // Lendo as notas do aluno 3
        System.out.println("Digite as notas do aluno 3:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno3[i] = entrada.nextDouble();
        }

        // Calculando e mostrando as médias
        double mediaAluno1 = calcularMedia(notasAluno1);
        System.out.printf("A média do aluno 1 é: %.2f%n", mediaAluno1);

        double mediaAluno2 = calcularMedia(notasAluno2);
        System.out.printf("A média do aluno 2 é: %.2f%n", mediaAluno2);

        double mediaAluno3 = calcularMedia(notasAluno3);
        System.out.printf("A média do aluno 3 é: %.2f%n", mediaAluno3);

        // Fecha o scanner
        entrada.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
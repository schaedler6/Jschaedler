public class CalculoMedias {
    public static void main(String[] args) {
        // Definindo as notas dos alunos
        double[] notasAluno1 = {7.5, 8.0, 6.5};
        double[] notasAluno2 = {9.0, 8.5, 7.0};
        double[] notasAluno3 = {6.0, 7.5, 8.0};

        // Calculando e mostrando as médias
        double mediaAluno1 = calcularMedia(notasAluno1);
        System.out.printf("A média do aluno 1 é: %.2f%n", mediaAluno1);

        double mediaAluno2 = calcularMedia(notasAluno2);
        System.out.printf("A média do aluno 2 é: %.2f%n", mediaAluno2);

        double mediaAluno3 = calcularMedia(notasAluno3);
        System.out.printf("A média do aluno 3 é: %.2f%n", mediaAluno3);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
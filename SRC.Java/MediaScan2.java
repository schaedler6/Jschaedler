import java.util.Scanner;

public class MediaScan2 {
    public static void main(String[] args) {
        // Declaração das médias de Maria
        String nome1 = "Maria";
        double nota11BimestreM = 9.6;
        double nota21BimestreM = 7.7;
        double nota32BimenstrM = 6.7;
        double nota42BimestreM = 4.8;

        // Calcular a média final
        double mediaFinalM = (nota11BimestreM + nota21BimestreM + nota32BimenstrM + nota42BimestreM) / 4;

        // Determinar a situação do aluno
        String situacaoM = mediaFinalM >= 7 ? "Aprovado" : "Reprovado";

        // Exibir o boletim escolar
        System.out.println("************************");
        System.out.println("Boletim Escolar");
        System.out.println("Nome do Aluno: " + nome1);
        System.out.println("Média Final: " + mediaFinalM);
        System.out.println("Situação: " + situacaoM);
        System.out.println("************************");
    }
}
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 0;
        double somaNotas = 0;
        double nota = 0;
        int contadorFilmes = 0;

        System.out.println("Digite as notas dos filmes (entre 0 e 10). Digite um número negativo para encerrar a entrada.");

        while (nota >= 0) {
            System.out.print("Digite uma nota: ");
            nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            } else {
                somaNotas += nota;
                totalNotas++;
                contadorFilmes++;
            }

            if (contadorFilmes == 4) {
                double media = somaNotas / totalNotas;
                System.out.println("A média das notas dos últimos 4 filmes é: " + media);
                somaNotas = 0;
                totalNotas = 0;
                contadorFilmes = 0;
            }
        }

        // Calcular e exibir a média final se houver menos de 10 filmes na última rodada
        if (contadorFilmes > 0) {
            double media = somaNotas / totalNotas;
            System.out.println("A média das notas dos últimos " + contadorFilmes + " filmes é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}
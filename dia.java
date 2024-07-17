import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número do dia da semana
        System.out.print("Digite um número para o dia da semana (1-7): ");
        int dia = scanner.nextInt();

        // Verifica e imprime o nome do dia da semana
        switch (dia) {
            case 1:
                System.out.println("O dia é domingo");
                break;
            case 2:
                System.out.println("O dia é segunda-feira");
                break;
            case 3:
                System.out.println("O dia é terça-feira");
                break;
            case 4:
                System.out.println("O dia é quarta-feira");
                break;
            case 5:
                System.out.println("O dia é quinta-feira");
                break;
            case 6:
                System.out.println("O dia é sexta-feira");
                break;
            case 7:
                System.out.println("O dia é sábado");
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
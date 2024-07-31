import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade mínima: ");
        int quantidadeMinima = scanner.nextInt();
        System.out.print("Informe a quantidade máxima: ");
        int quantidadeMaxima = scanner.nextInt();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;

        System.out.println("Estoque médio: " + estoqueMedio);
    }
}
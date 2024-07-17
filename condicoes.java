import java.util.Scanner;

public class condicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor do produto
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Exibe as opções de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais (10% de juros)");

        // Solicita e lê a escolha da forma de pagamento
        System.out.print("Digite o código da forma de pagamento: ");
        int codigoPagamento = scanner.nextInt();

        // Calcula o valor final a ser pago de acordo com a forma de pagamento escolhida
        double valorFinal;

        switch (codigoPagamento) {
            case 1:
                valorFinal = valorProduto * 0.85;
                break;
            case 2:
                valorFinal = valorProduto * 0.90;
                break;
            case 3:
                valorFinal = valorProduto;
                break;
            case 4:
                valorFinal = valorProduto * 1.10;
                break;
            default:
                System.out.println("Código de pagamento inválido.");
                return; // Encerra o programa se o código for inválido
        }

        // Imprime o valor final a ser pago
        System.out.printf("O valor final a ser pago é: R$ %.2f%n", valorFinal);

        // Fecha o scanner
        scanner.close();
    }
}
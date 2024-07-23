import java.util.Scanner;

public class CalculoSalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor da hora-aula
        System.out.print("Digite o valor da hora-aula: ");
        double valorHoraAula = scanner.nextDouble();

        // Solicita e lê o número de aulas lecionadas no mês
        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = scanner.nextInt();

        // Solicita e lê o percentual de desconto do INSS
        System.out.print("Digite o percentual de desconto do INSS (em %): ");
        double percentualINSS = scanner.nextDouble();

        // Calcula o salário bruto
        double salarioBruto = valorHoraAula * numeroAulas;

        // Calcula o valor do desconto do INSS
        double descontoINSS = salarioBruto * (percentualINSS / 100);

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - descontoINSS;

        // Imprime o salário líquido final
        System.out.printf("O salário líquido final é: R$ %.2f%n", salarioLiquido);

        // Fecha o scanner
        scanner.close();
    }
}
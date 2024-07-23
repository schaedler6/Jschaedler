import java.util.Scanner;

public class SalarioAumento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada do salário
        System.out.println("Digite o salário atual:");
        double salario = entrada.nextDouble();

        // Variáveis para armazenar o salário antigo e o novo salário
        double salarioAntigo = salario;
        double novoSalario;

        // Cálculo do novo salário com base nas condições
        if (salario > 5000) {
            novoSalario = salario * 1.10; // Aumento de 10%
        } else if (salario <= 4000) {
            novoSalario = salario * 1.30; // Aumento de 30%
        } else {
            novoSalario = salario; // Sem aumento para salários entre 4000 e 5000
        }

        // Mostrar o salário antigo e o novo salário com aumento
        System.out.println("Salário antigo: R$ " + salarioAntigo);
        System.out.println("Salário com aumento: R$ " + novoSalario);

        // Fechar o scanner
        entrada.close();
    }
}

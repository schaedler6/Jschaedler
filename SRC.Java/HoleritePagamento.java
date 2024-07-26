import java.util.Scanner;

public class HoleritePagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto = 0;

        while (salarioBruto != -1) {
            System.out.print("Digite o salário bruto ou -1 para sair: ");
            salarioBruto = entrada.nextDouble();

            if (salarioBruto != -1) {
                double irrf = salarioBruto * 0.15;
                double inss;
                
                if (salarioBruto <= 1500) {
                    inss = salarioBruto * 0.09;
                } else {
                    inss = salarioBruto * 0.11;
                }

                double salarioLiquido = salarioBruto - irrf - inss;

                System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
                System.out.printf("IRRF (15%%): R$ %.2f%n", irrf);
                System.out.printf("INSS (%.0f%%): R$ %.2f%n", (salarioBruto <= 1500 ? 9.0 : 11.0), inss);
                System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
                System.out.println("--------------------------------------");
            }
        }

        entrada.close();
        System.out.println("Sistema encerrado.");
    }
}
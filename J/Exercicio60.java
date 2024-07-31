import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("Informe o código do operário: ");
            int codigo = scanner.nextInt();

            System.out.print("Informe o número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            double salarioBase = horasTrabalhadas * 10.0;
            double salarioExcedente = 0.0;

            if (horasTrabalhadas > 50) {
                int horasExcedentes = horasTrabalhadas - 50;
                salarioExcedente = horasExcedentes * 20.0;
            }

            double salarioTotal = salarioBase + salarioExcedente;

            System.out.println("Salário total: R$ " + salarioTotal);
            System.out.println("Salário excedente: R$ " + salarioExcedente);

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'S' && resposta != 's');
    }
}
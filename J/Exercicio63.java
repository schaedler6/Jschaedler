import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C;
        double N, E = 0, Precohora = 10, PrecoExedente = 2;
        boolean continuar = true;
        char texto;

        do {
            E = 0;

            System.out.println("Digite o código do operário:");
            C = entrada.nextInt();

            System.out.println("Digite o número de horas trabalhadas:");
            N = entrada.nextDouble();

            if (N > 50) {
                E = N - 50;
            }

            System.out.println("\nID: " + C + "\nSalário: " + (N * Precohora)
                    + "\nSalário Excedente: " + (E * PrecoExedente) + "\nSalário Total: "
                    + (E * PrecoExedente + N * Precohora));
            
            System.out.println("\n\nDeseja encerrar o programa? (s/N)");
            texto = entrada.next().charAt(0);
            if (texto == 's' || texto == 'S') {
                continuar = false;
            }
        } while (continuar);

        entrada.close();
    }
}
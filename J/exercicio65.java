import java.util.Scanner;

public class exercicio65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char letra;

        do {
            System.out.print("DIGITE UM NUMERO INTEIRO: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O NUMERO É PAR.\n");
            } else {
                System.out.println("O NUMERO É IMPAR.\n");
                if (numero < 0) {
                    System.out.println("O NUMERO É NEGATIVO.\n");
                } else {
                    System.out.println("O NUMERO É POSITIVO.\n");
                }
            }

            System.out.println("DESEJA SAIR? (S/N)?");
            letra = entrada.next().charAt(0);

            if (letra == 's' || letra == 'S') {
                parar = true;
            }
        } while (parar == false);

        entrada.close();
    }
}
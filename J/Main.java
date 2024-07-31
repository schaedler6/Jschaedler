import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        int idade, menos = 0, mais = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua idade?");
            idade = lerdados.nextInt();

            if (idade < 21) {
                menos++;
            } else {
                mais++;
            }
        }

        System.out.println("Menores de 21 anos: " + menos);
        System.out.println("Maiores de 21 anos: " + mais);

        lerdados.close();
    }
}
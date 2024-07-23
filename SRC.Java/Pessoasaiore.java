import java.util.Scanner;

public class Pessoasaiore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaioresIdade = 0;
        
        for (int i = 0; i < 20; i++) {
            int idade = -1;
            while (idade < 0 || idade > 100) {
                System.out.print("Digite a idade da pessoa " + (i + 1) + " (máximo 100 anos): ");
                idade = scanner.nextInt();
                if (idade < 0 || idade > 100) {
                    System.out.println("Idade inválida. Por favor, insira uma idade entre 0 e 100 anos.");
                }
            }
            
            if (idade >= 18) {
                contadorMaioresIdade++;
            }
        }
        
        System.out.println("Número de pessoas maiores de idade: " + contadorMaioresIdade);
        scanner.close();
    }
}
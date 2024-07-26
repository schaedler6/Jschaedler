import java.util.Scanner;

public class pessoa10x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = 1000; // Integer.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consome a linha pendente
            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + idadeMaisNova);
        scanner.close();
    }
}
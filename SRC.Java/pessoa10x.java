import java.util.Scanner;

public class pessoa10x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        scanner.close();
    }
}
import java.util.Scanner;

public class OrdenaTresValores {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê três valores inteiros diferentes do usuário
        System.out.print("Digite o primeiro valor inteiro: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro valor inteiro: ");
        int c = scanner.nextInt();

        // Fecha o scanner
        scanner.close();

        // Verifica se os valores são diferentes
        if (a == b || a == c || b == c) {
            System.out.println("Os valores devem ser diferentes.");
            return;
        }

        // Ordena os valores em ordem decrescente
        int maior, meio, menor;
        
        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }

        // Imprime os valores em ordem decrescente
        System.out.println("Os valores em ordem decrescente são: " + maior + ", " + meio + ", " + menor);
    }
}
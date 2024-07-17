import java.util.Scanner;

public class 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("8: ");
        int numero = scanner.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        scanner.close();
    }
}
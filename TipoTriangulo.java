import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os valores dos três lados do triângulo
        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verifica se os valores formam um triângulo válido
        if (isTrianguloValido(lado1, lado2, lado3)) {
            // Determina o tipo do triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Método para verificar se os lados formam um triângulo válido
    public static boolean isTrianguloValido(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
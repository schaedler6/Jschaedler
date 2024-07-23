import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Cálculo do IMC
        System.out.println("Cálculo do IMC e da Média das Notas:");

        // Solicita e lê o peso do usuário
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Solicita e lê a altura do usuário (em metros)
        System.out.print("Digite a sua altura (em metros, por exemplo, 1.79): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / Math.pow(altura, 2);

        // Imprime o IMC e a condição do usuário de acordo com o IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Condição: Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Condição: Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Condição: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Condição: Obesidade grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Condição: Obesidade grau III (mórbida)");
        }

        System.out.println(); // Linha em branco para separar as duas partes

        // Parte 2: Cálculo da Média das Notas
        System.out.println("Cálculo da média das notas:");

        // Definindo automaticamente as três notas
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 9.0;

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Imprime as notas e a média das notas
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Nota 3: %.2f%n", nota3);
        System.out.printf("A média das notas é: %.2f%n", media);

        // Fecha o scanner
        scanner.close();
    }
}
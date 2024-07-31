import java.util.Scanner;

public class PromptComplexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao prompt complexo!");

        // 1. Leia um número inteiro e imprima sua tabuada
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 2. Leia um texto e imprima suas palavras em ordem alfabética
        System.out.print("Informe um texto: ");
        String texto = scanner.next();
        String[] palavras = texto.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            for (int j = i + 1; j < palavras.length; j++) {
                if (palavras[i].compareTo(palavras[j]) > 0) {
                    String temp = palavras[i];
                    palavras[i] = palavras[j];
                    palavras[j] = temp;
                }
            }
        }
        System.out.println("Palavras em ordem alfabética:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        // 3. Leia um número real e imprima sua raiz quadrada
        System.out.print("Informe um número real: ");
        double numeroReal = scanner.nextDouble();
        double raizQuadrada = Math.sqrt(numeroReal);
        System.out.println("Raiz quadrada de " + numeroReal + " = " + raizQuadrada);

        // 4. Leia um caractere e imprima sua tabela ASCII
        System.out.print("Informe um caractere: ");
        char caractere = scanner.next().charAt(0);
        System.out.println("Tabela ASCII do caractere '" + caractere + "':");
        for (int i = 0; i < 256; i++) {
            System.out.print((char) i + " - " + i + "\t");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("Obrigado por utilizar o prompt complexo!");
    }
}
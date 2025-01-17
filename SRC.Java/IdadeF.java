import java.util.Scanner;

public class IdadeF {
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        int habitante, idade, filhos, contador = 0, totalfilhos = 0, percentual = 0;
        int menor21 = 0, maior21 = 0;
        float salario, total = 0; 
        double media, mediafilhos, maiorSalario = 0;
        int porcentagem;

        System.out.println("Programa IdadeF");
        System.out.println("----------------------");
        System.out.println("Este programa coleta informações sobre o salário, idade e número de filhos de habitantes.");
        System.out.println("Depois, ele calcula a média do salário, a média do número de filhos, o maior salário,");
        System.out.println("a porcentagem de habitantes que recebem salário menor que R$1000 e a distribuição etária.");
        System.out.println("----------------------");

        for (habitante = 1; habitante <= 3; habitante++) {
            System.out.printf("Habitante %d%n", habitante);
            System.out.print("Qual sua idade? ");
            idade = lerdados.nextInt();
            System.out.print("Qual seu salário? R$ ");
            salario = lerdados.nextFloat();
            System.out.print("Quantos filhos tem? ");
            filhos = lerdados.nextInt();
            System.out.println("----------------------");

            contador++;
            total += salario;
            totalfilhos += filhos;

            if (idade <= 21) {
                menor21++;
            } else {
                maior21++;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 1000) {
                percentual++;
            }
        }

        lerdados.close();

        media = total / contador;
        mediafilhos = (double) totalfilhos / contador;
        porcentagem = (percentual * 100) / contador;

        System.out.printf("A média do salário é R$: %.2f%n", media);
        System.out.printf("A média do número de filhos é: %.2f%n", mediafilhos);
        System.out.printf("O maior salário é R$: %.2f%n", maiorSalario);
        System.out.printf("A porcentagem de habitantes que recebem salário menor que R$1000 é: %d%%%n", porcentagem);
        System.out.printf("Número de habitantes com idade menor ou igual a 21 anos: %d%n", menor21);
        System.out.printf("Número de habitantes com idade maior que 21 anos: %d%n", maior21);
    }
}
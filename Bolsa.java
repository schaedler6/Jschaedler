import java.util.Scanner;

public class Bolsa  {
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        int habitante, filhos, contador = 0, totalfilhos = 0, percentual = 0;
        float salario, total = 0; 
        double media, mediafilhos, maiorSalario = 0;
        int porcentagem;

        for (habitante = 1; habitante <= 3; habitante++) {
            System.out.println(habitante + " - Qual seu salário?");
            salario = lerdados.nextFloat();
            System.out.println(habitante + " - Quantos filhos tem?");
            filhos = lerdados.nextInt();

            contador++;
            total += salario;
            totalfilhos += filhos;
            
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
        porcentagem = (percentual * 1000) / contador;

        System.out.println("A média do salário é R$: " + media);
        System.out.println("A média do número de filhos é: " + mediafilhos);
        System.out.println("O maior salário é R$: " + maiorSalario);
        System.out.println("A porcentagem de habitantes que recebem salário menor que R$100 é: " + porcentagem + "%");
    }
}
import java.util.Scanner;

public class familia {
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        int totalHabitantes = 3;  // Número de habitantes a serem lidos
        int totalFilhos = 0;      // Acumulador para o total de filhos
        int contador = 0;         // Contador de habitantes processados
        int percentual = 0;       // Contador de habitantes com salário menor que 1000
        float salario, totalSalarios = 0;  // Variáveis para cálculo de salários
        double mediaSalario, mediaFilhos, maiorSalario = 0;  // Variáveis para médias e maior salário
        int porcentagem;  // Variável para a porcentagem de habitantes com salário menor que 1000

        // Mensagem inicial
        System.out.println("Programa Família");
        System.out.println("----------------------");
        System.out.println("Este programa coleta informações sobre o salário e número de filhos de habitantes.");
        System.out.println("Depois, ele calcula a média do salário, a média do número de filhos, o maior salário");
        System.out.println("e a porcentagem de habitantes que recebem salário menor que R$1000.");
        System.out.println("----------------------");

        // Loop para ler os dados de cada habitante
        for (int habitante = 1; habitante <= totalHabitantes; habitante++) {
            System.out.printf("Habitante %d%n", habitante);
            System.out.print("Qual seu salário? R$ ");
            salario = lerdados.nextFloat();
            System.out.print("Quantos filhos tem? ");
            int filhos = lerdados.nextInt();
            System.out.println("----------------------");

            // Acumulação dos dados
            contador++;
            totalSalarios += salario;
            totalFilhos += filhos;

            // Determinação do maior salário
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            // Contagem de habitantes com salário menor que 1000
            if (salario < 1000) {
                percentual++;
            }
        }

        // Fechamento do Scanner
        lerdados.close();

        // Cálculo das médias
        mediaSalario = totalSalarios / contador;
        mediaFilhos = (double) totalFilhos / contador;

        // Cálculo da porcentagem de habitantes com salário menor que 1000
        porcentagem = (percentual * 100) / contador;

        // Impressão dos resultados
        System.out.printf("A média do salário é R$: %.2f%n", mediaSalario);
        System.out.printf("A média do número de filhos é: %.2f%n", mediaFilhos);
        System.out.printf("O maior salário é R$: %.2f%n", maiorSalario);
        System.out.printf("A porcentagem de habitantes que recebem salário menor que R$1000 é: %d%%%n", porcentagem);
    }
}
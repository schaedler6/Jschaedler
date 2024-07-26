public class Lanches2407 {
    public static void main(String[] args) {
        // Variáveis para armazenar os preços e quantidades dos lanches
        double precoXSalada = 3.45;
        int quantidadeXSalada = 2;
        double precoXTudo = 9.43;
        int quantidadeXTudo = 3;
        double imposto = 3.5 / 100;

        // Variáveis para armazenar os totais
        double totalXSalada = 0;
        double totalXTudo = 0;
        double totalSemImposto = 0;
        double totalComImposto = 0;

        // Contador para o loop while
        int contador = 0;

        // Calculo dos totais utilizando while
        while (contador < 1) {
            totalXSalada = precoXSalada * quantidadeXSalada;
            totalXTudo = precoXTudo * quantidadeXTudo;
            totalSemImposto = totalXSalada + totalXTudo;
            totalComImposto = totalSemImposto + (totalSemImposto * imposto);

            // Incrementa o contador para sair do loop
            contador++;
        }

        // Exibindo os totais
        System.out.printf("Total sem imposto: R$ %.2f%n", totalSemImposto);
        System.out.printf("Total com imposto: R$ %.2f%n", totalComImposto);
    }
}
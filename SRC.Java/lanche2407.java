public class lanche2407 {
    public class Lanches2407 {
        public static void main(String[] args) {
            // Definindo os valores e quantidades
            double precoXSalada = 3.45;
            int quantidadeXSalada = 2;
            double precoXTudo = 9.43;
            int quantidadeXTudo = 3;
            double imposto = 0.035;
    
            // Variáveis para armazenar os totais
            double totalSemImposto = 0;
            double totalComImposto = 0;
    
            // Contador para o loop while
            int contador = 0;
    
            while (contador < 2) {
                if (contador == 0) {
                    totalSemImposto += quantidadeXSalada * precoXSalada;
                    totalSemImposto += quantidadeXTudo * precoXTudo;
                    totalComImposto = totalSemImposto * (1 + imposto);
                }
                contador++;
            }
    
            // Exibindo os totais
            System.out.printf("Total sem imposto: R$ %.2f%n", totalSemImposto);
            System.out.printf("Total com imposto: R$ %.2f%n", totalComImposto);
        }
    }
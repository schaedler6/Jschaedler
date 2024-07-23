public class Boleto1 {
    public static void main(String[] args) {
      // Declaração de Variáveis
      double valorPrincipal = 1000.0;
      double taxaJurosDia = 0.0014; // 0.14% convertido para decimal
      int diasAtraso = 32;
      double taxaJurosMes = 0.02; // 2% convertido para decimal
  
      // Cálculo de Juros Diários
      double jurosDiarios = valorPrincipal * taxaJurosDia * diasAtraso;
  
      // Cálculo de Juros Mensais
      double mesesAtraso = diasAtraso / 32.0;
      double jurosMensais = valorPrincipal * taxaJurosMes * mesesAtraso;
  
      // Cálculo do Valor Total com Juros
      double valorComJuros = valorPrincipal + jurosDiarios + jurosMensais;
  
      // Exibição do Resultado
      System.out.printf("O valor do boleto com juros é: R$ %.2f%n", valorComJuros);
    }
  }
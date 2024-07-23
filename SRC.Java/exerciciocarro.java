import java.util.Scanner;

public class exerciciocarro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o valor do produto");
        double valor = entrada.nextDouble();

        if(valor >= 50) {
            double novoValor = valor - (valor * 0.10);
            System.out.println("valor original: " + valor);
            System.out.println("Novo valor com desconto: R$ " + novoValor);

        }else{
            System.out.println("Não há valor com desconto para este produto."+valor);
        }
    }
}

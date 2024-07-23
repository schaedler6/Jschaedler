import java.util.Scanner;

public class exercico11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite um numero");
        int numero = entrada.nextInt();

        if(numero % 5 == 0 && numero % 2 == 0) {
            
            System.out.println("o numero é par e múltiplo de cinco " + numero);
        

        }else{
            System.out.println("o numero não atende aos criterios");
        }
    }
}


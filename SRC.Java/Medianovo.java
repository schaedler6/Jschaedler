import java.util.Scanner;

public class Medianovo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite um numero: ");
        int numero = entrada.nextInt();
        if(numero > 0){
            System.out.println("numero é possitivo" + numero);
        }else if (numero == 0) {
            System.out.println("numero é neutro" + numero);
        }else{
            System.out.println("numero é negativo" + numero);
        }
        entrada.close();
    }
}

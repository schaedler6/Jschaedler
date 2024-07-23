import java.util.Scanner;

public class Aula7 {
    
    public static void main(String[] args) {
        int codigo, senha;
        Scanner dadosDeEntrada = new Scanner(System.in); 

        System.out.print ("insira o código de acesso:");
        codigo = dadosDeEntrada.nextInt();

        if(codigo ==1234) {
            System.out.print ("insira a senha de acesso:");
            senha = dadosDeEntrada.nextInt();
               if(senha == 9999) {
               System.out.println("acesso permitido");
                } else {
                System.out.println("senha incorreta");
            
                } 
            }else {
                System.out.println("codigo incorreto");   
            }
            dadosDeEntrada.close();
    }
}
 


import java.util.Scanner;

public class exemplo62 {
    public static void main(String[] args) {
        String sexo;
        Scanner dados = new Scanner(System.in);
        
        do {
            System.out.println("Qual o seu sexo: f - feminino, m - masculino");
            sexo = dados.next();
        } while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
        
        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Sexo feminino escolhido");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Sexo masculino escolhido");
        }
        
        dados.close();
    }
}
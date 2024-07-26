import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int nota;
        System.out.println("nota: ");
        nota = dados.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Digite a nota do aluno (entre 0 e 10): ");
            nota = dados.nextInt();

         
        }

       
    }
}
import java.util.Scanner;

public class MediaScan {
public static void main(String[]args) {
    Scanner entradaNotas = new Scanner(System.in);
    Scanner entradaNome = new Scanner(System.in);
    int nota1, nota2, nota3;
    String nome;
    int media;
    // recebe a nome e sua 1° nota
    System.out.println("Digite seu nome: ");
    nome = entradaNome.next();
    System.out.println("Digite sua 1° nota: ");
    nota1 = entradaNotas.nextInt();
    // recebe a 2° nota
    System.out.println("Digite sua 2° nota: ");
    nota2 = entradaNotas.nextInt();
    // recebe a 3° nota
    System.out.println("Digite sua 3° nota" );
    nota3= entradaNotas.nextInt();
    // calcula a média
    media =(nota1 + nota2 + nota3) / 3;
    System.out.println("A média do aluno" + nome + "é" + media);
    // mostra a situação do aluno
    if ((media >= 0) && (media <4) ){
        System.out.println("nota E");
        } else if ((media >= 4) && (media <5)) {
            System.out.println("nota D");
            } else if (media >= 7) {
                System.out.println("nota C");
                } else if (media >= 8) {
                    System.out.println("nota B");
                    } else if (media >= 10) {
                        System.out.println("nota A");
                    }
                    entradaNotas.close();
                    entradaNome.close();
    
}

    
}

public class Nota {
    public static void main(String[] args) {
        String nomeJaspion = "Jaspion";
        String nomeTiririca = "Tiririca";
        double notaJ1 = 10; // Primeira nota do Jaspion
        double notaJ2 = 8;  // Segunda nota do Jaspion
        double notaT1 = 10; // Primeira nota do Tiririca
        double notaT2 = 8;  // Segunda nota do Tiririca
        double mediaJ;      // Média do Jaspion
        double mediaT;      // Média do Tiririca

        // Calculando a média de Jaspion
        mediaJ = (notaJ1 + notaJ2) / 2;
        System.out.println(nomeJaspion); // Mostrando o nome do aluno
        System.out.println(mediaJ);      // Mostrando a média do Jaspion

        // Calculando a média de Tiririca
        mediaT = (notaT1 + notaT2) / 2;
        System.out.println(nomeTiririca); // Mostrando o nome do aluno
        System.out.println(mediaT);       // Mostrando a média do Tiririca
    }
}
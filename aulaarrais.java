public class aulaarrais {
    public static void main(String[] args) {
        String[] nomes = {"Jaspion", "Tiririca"};
        double[][] notas = {{10, 8}, {10, 8}};

        for (int i = 0; i < nomes.length; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Média: " + media);
            System.out.println();
        }
    }
}
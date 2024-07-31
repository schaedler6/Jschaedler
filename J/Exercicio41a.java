public class Exercicio41a {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Números de 1 a 20, um abaixo do outro:");
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        System.out.println("\nNúmeros de 1 a 20, um ao lado do outro:");
        i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // adiciona uma quebra de linha no final
    }
}
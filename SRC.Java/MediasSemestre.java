public class MediasSemestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das médias de Carlos
        String nome1 = "Carlos";
        double nota1BimestreC, nota2BimestreC, nota3BimestreC;

        // Declaração das médias de Maria
        String nome2 = "Maria";
        double nota1BimestreM, nota2BimestreM, nota3BimestreM;

        // Entrada de dados para Carlos
        System.out.println("Digite as notas de " + nome1 + ":");
        System.out.print("1º Bimestre: ");
        nota1BimestreC = scanner.nextDouble();
        System.out.print("2º Bimestre: ");
        nota2BimestreC = scanner.nextDouble();
        System.out.print("3º Bimestre: ");
        nota3BimestreC = scanner.nextDouble();

        // Cálculo da média de Carlos
        double mediaFinalC = (nota1BimestreC + nota2BimestreC + nota3BimestreC) / 3;

        // Entrada de dados para Maria
        System.out.println("Digite as notas de " + nome2 + ":");
        System.out.print("1º Bimestre: ");
        nota1BimestreM = scanner.nextDouble();
        System.out.print("2º Bimestre: ");
        nota2BimestreM = scanner.nextDouble();
        System.out.print("3º Bimestre: ");
        nota3BimestreM = scanner.nextDouble();

        // Cálculo da média de Maria
        double mediaFinalM = (nota1BimestreM + nota2BimestreM + nota3BimestreM) / 3;

        // Fechamento do scanner
        scanner.close();

        // Impressão dos resultados de Carlos
        System.out.println("\nMédias de " + nome1 + ":");
        System.out.println("1º Bimestre: " + nota1BimestreC);
        System.out.println("2º Bimestre: " + nota2BimestreC);
        System.out.println("3º Bimestre: " + nota3BimestreC);
        System.out.println("Média Final: " + mediaFinalC);
        if (mediaFinalC >= 7) {
            System.out.println("Status: Aprovado");
        } else if (mediaFinalC == 4) {
            System.out.println("Status: Conselho");
        } else {
            System.out.println("Status: Reprovado");
        }

        // Impressão dos resultados de Maria
        System.out.println("\nMédias de " + nome2 + ":");
        System.out.println("1º Bimestre: " + nota1BimestreM);
        System.out.println("2º Bimestre: " + nota2BimestreM);
        System.out.println("3º Bimestre: " + nota3BimestreM);
        System.out.println("Média Final: " + mediaFinalM);
        if (mediaFinalM >= 7) {
            System.out.println("Status: Aprovado");
        } else if (mediaFinalM == 4) {
            System.out.println("Status: Conselho");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}
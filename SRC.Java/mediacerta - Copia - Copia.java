at Notas.main(mediacerta.java:2){
    public static void main(String[] args) {
        String jaspionName = "Jaspion";
        String tiriricaName = "Tiririca";
        double jaspionNota1 = 10; // Primeira nota do Jaspion
        double jaspionNota2 = 8;  // Segunda nota do Jaspion
        double tiriricaNota1 = 10; // Primeira nota do Tiririca
        double tiriricaNota2 = 8;  // Segunda nota do Tiririca

        // Calculating and printing Jaspion's average
        double jaspionAverage = calculateAverage(jaspionNota1, jaspionNota2);
        System.out.println("Name: " + jaspionName);
        System.out.println("Average: " + jaspionAverage);

        // Calculating and printing Tiririca's average
        double tiriricaAverage = calculateAverage(tiriricaNota1, tiriricaNota2);
        System.out.println("Name: " + tiriricaName);
        System.out.println("Average: " + tiriricaAverage);
    }

    private static double calculateAverage(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }
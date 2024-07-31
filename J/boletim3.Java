public class Boletim3 {
    public static void main(String[] args) {
        // Declaro as variáveis
        String nome1="Pikachu", nome2="TOM", nome3="Jerry";
        double nota1P=3, nota2P=4, nota3P=6, nota1T=7, nota2T=6, nota3T=7, nota1J=5, nota2J=6, nota3J=7;
        double media1P, media1T, media1J;

        // Calculando as médias
        media1P = (nota1P+nota2P+nota3P)/3;
        media1T = (nota1T+nota2T+nota3T)/3;
        media1J = (nota1J+nota2J+nota3J)/3;
        // Imprimir as notas
        System.out.println("******************");
        System.out.println(nome1);
        System.out.println(" A media do Pickachu é: " + media1P);
        System.out.println("******************");

        System.out.println(" A media do TOM é: " + media1T);
        System.out.println(" A media do Jerry é: " + media1J);



    }
}
public class boletim33 {
    public static void main(String[] args) {
         // declaração das medias do Tiririca
        String nome1 ="Tiririca";
        double nota11BimestreT = 10;
        double nota21BimestreT = 9;
        double nota32BimenstreT = 7;
        double nota42BimestreT = 9;
        double media1BimestreT;
        double media2BimestreT;
        double mediaFinalT;
        // declaração das medias do Jaspion
        String nome2 ="Jaspion";
        double nota11BimestreJ = 8;
        double nota21BimestreJ = 9;
        double nota32BimenstreJ = 8;
        double nota42BimestreJ= 9;
        double media1BimestreJ;
        double media2BimestreJ;
        double mediaFinalJ;

        media1BimestreT = (nota11BimestreT+nota21BimestreT) /2;
        media2BimestreT = (nota32BimenstreT+nota42BimestreT) /2;
        mediaFinalT = (media1BimestreT+media2BimestreT) /2;
        media1BimestreJ = (nota11BimestreJ+nota21BimestreJ) /2;
        media2BimestreJ = (nota32BimenstreJ+nota42BimestreJ) /2;
        mediaFinalJ = (media1BimestreJ+media2BimestreJ) /2;
       
        System.out.println("************************");
        System.out.println("Boletim Escolar ");
        System.out.println(" Nome do Aluno " + nome1);
        System.out.println("media do 1° Bimestre: " + media1BimestreT);
        System.out.println("media do 2° Bimestre: " + media2BimestreT);
        System.out.println("media final : " + mediaFinalT);
        System.out.println("************************");

        System.out.println("************************");
        System.out.println("Boletim Escolar ");
        System.out.println(" Nome do Aluno " + nome2);
        System.out.println("media do 1° Bimestre: " + media1BimestreJ);
        System.out.println("media do 2° Bimestre: " + media2BimestreJ);
        System.out.println("media final : " + mediaFinalJ);
        System.out.println("************************");
        
    }
}

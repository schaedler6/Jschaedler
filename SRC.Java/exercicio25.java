import java.util.Scanner; 
exercico25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero para multiplicar por 3: ");
        n = ler.nextInt();
        while(n<100) {
            n  *=3;
            System.out.println(n);
        }

    }

}
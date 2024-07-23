
import java.util.Scanner;
import java.util.InputMismatchException;

public class Peso2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite sua altura em metros (exemplo: 1.79): ");
            double altura = entrada.nextDouble();

            System.out.print("Digite seu peso em kg: ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("Seu IMC é: %.2f\n", imc);

            if (imc > 40.0) {
                System.out.println("Obesidade grau III");
                System.out.println("Aqui o sinal é vermelho, com forte probabilidade de já existirem doenças muito graves associadas. O tratamento deve ser ainda mais urgente.");
            } else if (imc >= 35.0 && imc <= 40.0) {
                System.out.println("Obesidade grau II");
                System.out.println("Mesmo que seus exames aparentem estar normais, é hora de se cuidar, iniciando mudanças no estilo de vida com o acompanhamento próximo de profissionais de saúde.");
            } else if (imc >= 30.0 && imc <= 35.0) {
                System.out.println("Obesidade grau I");
                System.out.println("Sinal de alerta! Chegou na hora de se cuidar, mesmo que seus exames sejam normais. Vamos dar início a mudanças hoje! Cuide de sua alimentação. Você precisa iniciar um acompanhamento com nutricionista e/ou endocrinologista.");
            } else if (imc >= 25.0 && imc <= 30.0) {
                System.out.println("Sobrepeso");
                System.out.println("Ele é, na verdade, uma pré-obesidade e muitas pessoas nessa faixa já apresentam doenças associadas, como diabetes e hipertensão. Importante rever hábitos e buscar ajuda antes de, por uma série de fatores, entrar na faixa da obesidade pra valer.");
            } else if (imc >= 18.6 && imc <= 25.0) {
                System.out.println("Normal");
                System.out.println("Que bom que você está com o peso normal! E o melhor jeito de continuar assim é mantendo um estilo de vida ativo e uma alimentação equilibrada.");
            } else if (imc < 18.6) {
                System.out.println("Abaixo do normal");
                System.out.println("Procure um médico. Algumas pessoas têm um baixo peso por características do seu organismo e tudo bem. Outras podem estar enfrentando problemas, como a desnutrição. É preciso saber qual é o caso.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            entrada.close();
        }
    }
}
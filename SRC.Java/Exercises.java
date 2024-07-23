Exercises.java
import java.util.Scanner;

public class Exercises {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Exercise 1: Calculating the final cost of a car
    System.out.print("Enter the cost of the car from the factory: ");
    double custoDeFabrica = scanner.nextDouble();
    double porcentagemDistribuidor = custoDeFabrica * 0.28;
    double impostos = custoDeFabrica * 0.45;
    double custoFinal = custoDeFabrica + porcentagemDistribuidor + impostos;
    System.out.println("The final cost of the car is: " + custoFinal);

    // Exercise 2: Calculating the number of minimum wages
    System.out.print("Enter the minimum wage: ");
    double salarioMinimo = scanner.nextDouble();
    System.out.print("Enter the user's salary: ");
    double salarioUsuario = scanner.nextDouble();
    double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
    System.out.println("The user earns " + quantidadeSalariosMinimos + " minimum wages.");

    // Exercise 3: Calculating the salary with a 10% increase
    System.out.print("Enter the salary: ");
    double salario = scanner.nextDouble();
    double reajuste = salario * 0.10;
    double salarioReajustado = salario + reajuste;
    System.out.println("The salary with a 10% increase is: " + salarioReajustado);

    // Exercise 4: Calculating the salary with a conditional increase
    System.out.print("Enter the salary: ");
    double salarioCondicao = scanner.nextDouble();
    double aumento;
    if (salarioCondicao < 1000.00) {
      aumento = salarioCondicao * 0.30;
    } else {
      aumento = salarioCondicao * 0.10;
    }
    double salarioReajustadoCondicao = salarioCondicao + aumento;
    System.out.println("The salary with a conditional increase is: " + salarioReajustadoCondicao);

    // Exercise 5: Reading and printing the full name
    System.out.print("Enter your first name: ");
    String primeiroNome = scanner.next();
    System.out.print("Enter your second name: ");
    String segundoNome = scanner.next();
    String fullName = primeiroNome + " " + segundoNome;
    System.out.println("Your full name is: " + fullName);
  }
}
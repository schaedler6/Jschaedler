import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Calculando o custo final de um carro
        double factoryCost = 80000.0;

        double distributorPercentage = 0.28;
        double taxPercentage = 0.45;

        double distributorCost = factoryCost * distributorPercentage;
        double taxCost = factoryCost * taxPercentage;
        double finalCost = factoryCost + distributorCost + taxCost;

        System.out.println("O custo final do carro para o consumidor é: " + finalCost);

        // 2. Calculando o número de salários mínimos
        double minimumWage = 1412.0;
        double userSalary = 3800.0;

        double numberOfMinimumWages = userSalary / minimumWage;

        System.out.println("O usuário ganha " + numberOfMinimumWages + " salários mínimos.");

        // 3. Calculando o salário com um aumento de 10%
        double salary = 3800.0;

        double increasePercentage = 0.10;
        double increasedSalary = salary * (1 + increasePercentage);

        System.out.println("O salário com um aumento de 10% é: " + increasedSalary);

        // 4. Calculando o salário com um aumento condicional
        double conditionalSalary = 3800.0;

        double conditionalIncreasePercentage;
        if (conditionalSalary < 1000.00) {
            conditionalIncreasePercentage = 0.30;
        } else {
            conditionalIncreasePercentage = 0.10;
        }

        double conditionalIncreasedSalary = conditionalSalary * (1 + conditionalIncreasePercentage);

        System.out.println("O salário com o aumento condicional é: " + conditionalIncreasedSalary);

        // 5. Lendo e imprimindo o nome completo
        String firstName = "Sidinei";
        String secondName = "Schaedler";

        String fullName = firstName + " " + secondName;

        System.out.println("Seu nome completo é: " + fullName);
    }
}
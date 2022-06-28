package l3a;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Salário");
        double salario = input.nextDouble();
        double vinte = salario * 20 / 100;
        double quintze = salario * 15 / 100;
        double dez = salario * 10 / 100;
        double cinco = salario * 5 / 100;

        if (salario <= 280) {
            System.out.println(" Salário antes do reajuste " + salario);
            System.out.println(" Percentual de aumento foi de 20%");
            System.out.println(" O valor do aumento aplicado " + vinte);
            System.out.println(" O novo salario após o aumento " + (salario + vinte));

        } else if (salario > 280 && salario <= 700) {
            System.out.println(" Salário antes do reajuste " + salario);
            System.out.println(" Percentual de aumento foi de 15%");
            System.out.println(" O valor do aumento aplicado " + quintze);
            System.out.println(" O novo salario após o aumento " + (salario + quintze));


        } else if (salario > 700 && salario <= 1500) {
            System.out.println(" Salário antes do reajuste " + salario);
            System.out.println(" Percentual de aumento foi de 10%");
            System.out.println(" O valor do aumento aplicado " + dez);
            System.out.println(" O novo salario após o aumento " + (salario + dez));


        }
        if (salario > 1500) {
            System.out.println("  Salário antes do reajuste " + salario);
            System.out.println(" Percentual de aumento foi de 5%");
            System.out.println(" O valor do aumento aplicado " + cinco);
            System.out.println(" O novo salario após o aumento " + (salario + cinco));


        }


    }
}



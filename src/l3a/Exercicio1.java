package l3a;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        double numero2 = input.nextDouble();
        input.close();

        if (numero1 > numero2) {
            System.out.print("O primeiro número digitado foi o " +numero1 + " É  maior que o segundo número");



        } else if ( numero2 > numero1) {
            System.out.print("O segundo número digitado foi o  " +numero2 +  " O mesmo é  maior que o primeiro número");

        }else {
            System.out.println("Os números devem ser diferentes do que foi informados  ");
        }
    }


}



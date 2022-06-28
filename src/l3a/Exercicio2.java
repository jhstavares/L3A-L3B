package l3a;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro produto: ");
        double produto1 = input.nextDouble();
        System.out.print("Digite o valor do segundo produto: ");
        double produto2 = input.nextDouble();
        System.out.print("Digite o valor do três produto: ");
        double produto3 = input.nextDouble();
        input.close();


        if (produto1 < produto2 && produto2 < produto3) {
            System.out.print("Comprar o produto 1");

        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.print("Comprar o produto 2 ");

        }else {
            System.out.println("Comprar o produto 3");

    }

}

}


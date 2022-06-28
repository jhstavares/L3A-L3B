package l3b;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite primeiro número");
        int inicial = input.nextInt();

        System.out.println("Digite o último número");
        int fin = input.nextInt();

        int somaImpar = 0;

        if (inicial < 0) {
            System.out.println("Número invádo. Digite um número positivo para o programa funcioar");

        } else if (inicial > fin) {
            System.out.println("Intervalo de valores inválidos");


        } else {

            for (int i1 = inicial; i1 <= fin; i1++) {
                if (i1 % 2 != 0) {
                    somaImpar += i1;

                }
                System.out.println("A soma dos impares é: " + somaImpar);
            }
        }


    }
}

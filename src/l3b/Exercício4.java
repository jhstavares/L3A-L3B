package l3b;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Digite números inteiros positivos para efetuar uma soma");

        int nUmerosInteiros = input.nextInt();
        int vAlor = 0;
        int sOmar = 0;

        if (nUmerosInteiros > 0) {
            for (int i = 0; i < nUmerosInteiros; i++) {
                Scanner numeros = new Scanner(System.in);
                System.out.println("Digite um número");
                vAlor = input.nextInt();
                sOmar = sOmar + vAlor;

            }
            System.out.println(" O resultado da soma dos números inteiros positivos é: " + sOmar);


        } else {
            System.out.println("Número inválido");


        }


    }
}
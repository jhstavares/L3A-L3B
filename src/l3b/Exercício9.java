package l3b;

import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        input.close();

        int antecessor = numero;
        int resultado = antecessor;

        if (numero < 0)
            System.out.println("Número inválido");

        else {

            while (antecessor > 1) {
                resultado = resultado * (antecessor - 1);
                antecessor--;

                System.out.println(numero + " x " + antecessor + " = " + resultado);

            }

        }

        System.out.println("O resultado final é: " + resultado);


    }
}

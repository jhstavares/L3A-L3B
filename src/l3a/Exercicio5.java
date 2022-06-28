package l3a;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para aparecer o dia da semana: ");
        int diaSemana = input.nextInt();
        input.close();

        if (diaSemana == 1) {
            System.out.print(" 1-Domingo");

        } else if (diaSemana == 2) {
            System.out.print("2-Segunda");

        } else if (diaSemana == 3) {
            System.out.print("3-Terça");
        } else if (diaSemana == 4) {
            System.out.println("4-Quarta");

        } else if (diaSemana == 5) {
            System.out.println("5-Quinta");

        } else if (diaSemana == 6) {
            System.out.println("6-Sexta");

        } else if (diaSemana == 7) {
            System.out.println("7-Sábado ");

        }else{
            System.out.println("valor inválido");
        }
    }

}

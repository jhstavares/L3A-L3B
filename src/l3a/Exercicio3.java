package l3a;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nota1");
        double nota1 = input.nextDouble();
        System.out.print("Nota2");
        double nota2 = input.nextDouble();
        double media = ( nota1 + nota2) / 2;

        if (media >=7){
            System.out.println("Aprovado ");

        }if (media <7){
            System.out.println("Reprovado");

        }if (media==10){
            System.out.println("Aprovado com Distinção");
        }


    }
}

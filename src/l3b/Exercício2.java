package l3b;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de números você deseja tirar a média?");
        double qTdmediasdesejadas = scanner.nextInt();
        double valoresRcebidos = 0;
        double somasDOSvalores = 0;
        double media = 0;

        for (int i = 0; i < qTdmediasdesejadas; i++) {

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Digite um número");
            valoresRcebidos = scanner2.nextDouble();
            somasDOSvalores = somasDOSvalores + valoresRcebidos;


        }
        media = somasDOSvalores / qTdmediasdesejadas;
        System.out.println("A média é: " + media);


    }
}

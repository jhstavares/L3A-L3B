package l3b;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double auxiliar = 0;
        double maior = 0;
        double menor = 100000000;
        double[] quAntidadesDeNumerosDigitados = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(" Digite o " + (i + 1) + "º número e aperte o enter: ");
            quAntidadesDeNumerosDigitados[(int) i] = input.nextDouble();
            auxiliar = quAntidadesDeNumerosDigitados[(int) i];

            if (menor > auxiliar) {
                menor = quAntidadesDeNumerosDigitados[(int) i];

            }
            if (maior < auxiliar) {
                maior = quAntidadesDeNumerosDigitados[(int) i];


            }


        }
        System.out.println(" O maior é : " + maior + " O menor é : " + menor);

    }
}

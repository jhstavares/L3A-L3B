package l3b;

import java.util.Scanner;

public class Exercício7 {

    public static boolean primo(int numero) {

        if ((numero == 1) || (numero == 0))
            return (false);
        else {
            int i = 0;
            int fim = 0;
            fim = (int) Math.sqrt(numero);

            for (i = 2; i <= fim; i++) {
                if ((numero % i) == 0)
                    return (false);


            }
            return (true);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber se é um número posito: ");
        int numero = input.nextInt();

        if(primo(numero)){
            System.out.print(" O numero "+numero+" é primo.");

        }else {
            System.out.print(" O numero " +numero+ " não é primo.");
        }
    }
}




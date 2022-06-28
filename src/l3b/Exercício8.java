package l3b;

public class Exercício8 {
    public static void main(String[] args) {

        int somarImpar = 0;

        for (int i = 0; i <= 100 ; i++){
            if (i % 2 != 0) {
                somarImpar += i;

            }
        }
        System.out.print("A soma dos 50 primeiros números impares é: " +somarImpar);
    }
}

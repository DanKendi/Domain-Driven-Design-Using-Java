package Aula04.Exercicio16;

import java.util.Scanner;

public class Exercicio16DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        do {
            System.out.print("Digite um número positivo para obter sua tabuada: ");
            a = in.nextInt();
        } while (a <= 0);
        int i=1;
        do {
            System.out.printf("%d * %d = %d\n", a,i,(a*i));
            i++;
        } while (i < 11);

        in.nextInt();
    }
}

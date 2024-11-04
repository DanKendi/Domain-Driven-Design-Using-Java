package Aula04.Exercicio16;

import java.util.Scanner;

public class Exercicio16For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        for (int i = 0; i < 1; i++) {
            System.out.print("Digite um número positivo para obter sua tabuada: ");
            a = in.nextInt();
            if (a > 0) {
                break;
            } else {
                i--;
            }
        }
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", a, i, (a * i));
        }
        in.close();
    }
}

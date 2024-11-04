package Aula04.Exercicio14;

import java.util.Scanner;

public class Exercicio14For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Digite um número positivo: ");
                num = in.nextInt();
            }
            if (num > 0) {
                System.out.println("Valor aceito");
                break;
            } else {
                System.out.println("Erro!");
                System.out.print("Digite um número positivo: ");
                num = in.nextInt();
                if (i == 1) {
                    i--;
                }
            }
        }
        in.close();
    }
}

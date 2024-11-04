package Aula04.Exercicio14;

import java.util.Scanner;

public class Exercicio14DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um núemro positivo: ");
            num = in.nextInt();
        } while (num < 0);
        System.out.println("Valor Aceito!");
        in.close();
    }
}

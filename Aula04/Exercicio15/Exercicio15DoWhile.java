package Aula04.Exercicio15;

import java.util.Scanner;

public class Exercicio15DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Digite dois números, o primeiro precisa ser maior que o segundo.");

        System.out.print("Digite o primeiro número: ");
        a = in.nextInt();

        do {
            System.out.print("Digite o segundo número: ");
            b = in.nextInt();
        }while(b <= a);

        System.out.println("Valores aceitos.");
        System.out.printf("%d > %d", a,b);
        in.close();
    }
}

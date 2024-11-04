package Aula04.Exercicio15;

import java.util.Scanner;

public class Exercicio15For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=0, b=0;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Digite o primeiro número: ");
                a = in.nextInt();

                System.out.print("Digite o segundo número: ");
                b = in.nextInt();
            }
            if (b > a){
                System.out.println("Valores aceitos.");
                System.out.printf("%d > %d", a,b);
            }else {
                System.out.println("Erro!");
                System.out.printf("Digite um número maior que o anterior: ");
                b = in.nextInt();
                if (i == 1){
                    i--;
                }
            }
        }
        in.close();
    }
}

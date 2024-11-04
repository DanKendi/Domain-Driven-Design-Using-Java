package Aula04.Exercicio15;

import java.util.Scanner;

public class Exercicio15While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite um número qualquer: ");
        int a = in.nextInt();
        System.out.printf("Digite um número maior que o anterior: ");
        int b = in.nextInt();

        while (b < a){
            System.out.println("Erro!");
            System.out.printf("Digite um número maior que o anterior: ");
            b = in.nextInt();
        }
        System.out.println("Valores aceitos.");
        System.out.printf("%d > %d", a,b);
        in.close();
    }
}

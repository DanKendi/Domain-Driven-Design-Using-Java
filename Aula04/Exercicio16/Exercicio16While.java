package Aula04.Exercicio16;

import java.util.Scanner;

public class Exercicio16While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = in.nextInt();

        while (num < 0){
            System.out.println("Erro!");
            System.out.print("Digite um número positivo: ");
            num = in.nextInt();
        }
        int i=1;
        System.out.println("");
        while (i < 11){
            System.out.println(num+" x "+ i +" = "+ (num*i));
            i++;
        }
        in.close();
    }
}
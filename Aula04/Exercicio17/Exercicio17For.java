package Aula04.Exercicio17;

import java.util.Scanner;

public class Exercicio17For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, maior = 0, menor = 0, soma = 0;
        double pos = 0, neg = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = in.nextInt();
            if (i == 0) {
                maior = num;
                menor = num;
            }

            if (num > maior)
                maior = num;

            if (num < menor)
                menor = num;

            if (num > 0)
                pos++;
            else
                neg++;

            soma += num;
        }
        pos = (pos / 5) * 100;

        neg = (neg / 5) * 100;

        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        System.out.println("A soma dos números foi: " + soma);
        System.out.println("A média dos números foi: " + (soma / 5));
        System.out.println("A porcentagem de números positivos é igual a: " + pos + "%");
        System.out.println("A porcentagem de números negativos é igual a: " + neg + "%");

        in.close();
    }
}
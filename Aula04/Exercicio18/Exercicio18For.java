package Aula04.Exercicio18;

import java.util.Scanner;

public class Exercicio18For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vezes = 0, maior = 0, menor = 0, soma = 0, num = 0;
        double pos = 0, neg = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a quantidade de números que deseja somar: ");
            vezes = in.nextInt();
            if (vezes < 21 && vezes > 0){
                break;
            }else {
                System.out.println("A quantidade de vezes precisa ser maior que 0 e menor que 20!");
                System.out.print("Digite a quantidade de números que deseja somar: ");
                vezes = in.nextInt();
                i--;
            }
        }
        for (int i = 0; i < vezes; i++) {
            System.out.print("Digite um número: ");
            num = in.nextInt();
            if (i == 0) {
                maior = num;
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }

            if (num > 0) {
                pos++;
            } else {
                neg++;
            }
            soma += num;
        }
        pos = (pos / vezes) * 100;

        neg = (neg / vezes) * 100;

        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        System.out.println("A soma dos números foi: " + soma);
        System.out.println("A média dos números foi: " + (soma / vezes));
        System.out.printf("A porcentagem de números positivos é igual a: %.2f%% \n", pos);
        System.out.printf("A porcentagem de números negativos é igual a: %.2f%% \n",neg);

        in.close();
    }
}

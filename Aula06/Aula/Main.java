package Aula06.Aula;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = -1;
        int i = 0;
        int contaOperacao;
        double valorOperacao;
        InfosCliente[] listaCliente = new InfosCliente[10];

        while (opcao != 0) {
            var menu = """
                    ----- Menu -----
                    Digite a opção desejada:
                    1- Cadastrar o Cliente
                    2- Depositar
                    3- Sacar
                    4- Consultar Saldo do Cliente
                    0- Sair""";


            System.out.println(menu);
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    InfosCliente c = new InfosCliente();
                    System.out.print("Digite o nome do Cliente: ");
                    c.nome = in.next();
                    System.out.print("Digite o número da conta: ");
                    c.conta = in.next();
                    System.out.print("Digite o número da agência: ");
                    c.agencia = in.next();
                    System.out.print("Digite o valor do saldo: ");
                    c.saldo = in.nextDouble();
                    listaCliente[i] = c;
                    i++;
                    break;
                case 2:
                    System.out.print("Digite a conta que deseja depositar: ");
                    contaOperacao = in.nextInt();
                    System.out.print("Digite a quantidade que deseja depositar: ");
                    valorOperacao = in.nextDouble();
                    while (valorOperacao <= 0) {
                        System.out.println("Valor de depósito inválido!");
                        System.out.print("Digite a quantidade que deseja depositar: ");
                        valorOperacao = in.nextDouble();
                    }
                    listaCliente[contaOperacao].depositar(valorOperacao);
                    break;
                case 3:
                    System.out.print("Digite a conta que deseja sacar: ");
                    contaOperacao = in.nextInt();
                    System.out.print("Digite a quantidade que deseja sacar: ");
                    valorOperacao = in.nextDouble();
                    while (valorOperacao <= 0) {
                        System.out.println("Valor de saque inválido!");
                        System.out.print("Digite a quantidade que deseja sacar: ");
                        valorOperacao = in.nextDouble();
                    }
                    listaCliente[contaOperacao].sacar(valorOperacao);
                    break;
                case 4:
                    System.out.print("Digite a conta que deseja consultar o saldo: ");
                    contaOperacao = in.nextInt();
                    System.out.println(listaCliente[contaOperacao].getInfosCliente());
                    break;
                case 0:
                    System.out.println("Fechando aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }//fim switch
        }//fim while
    }//fim psvm
}//fim Main

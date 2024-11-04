package Checkpoint02;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        int opcao, id, id_origem, id_destino, id_cliente = 0, indexCliente, numConta = 1;
        Cliente cli;
        double valor;
        Cliente cliente_origem = null;
        Cliente cliente_destino = null;
        boolean existeCliente = false;

        do {
            System.out.printf("===> Banco Macgyver Agência 4422 <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Criar cliente/conta \n" +
                    "2 - Depósito \n" +
                    "3 - Saque \n" +
                    "4 - Transferência \n" +
                    "5 - Consulta de saldo \n" +
                    "6 - Consulta de extrato \n" +
                    "7 - Sair\n\n");


            System.out.printf("Digite a opção desejada: ");
            opcao = sc.nextInt();


            if (opcao == 1) {
                Cliente cliente = new Cliente();


                id_cliente++;
                cliente.setId(id_cliente);

                System.out.print("Digite o seu nome: ");
                cliente.setNome(sc.next());


                System.out.print("Digite a seu idade: ");
                cliente.setIdade(sc.nextInt());

                ContaBancaria conta = new ContaBancaria();

                conta.setAgencia("4422");

                conta.setNumero("00"+numConta);
                numConta++;

                conta.setSaldo(0);

                cliente.setConta(conta);

                listaClientes.add(cliente);

                System.out.printf("Cliente incluído com sucesso!");
                System.in.read();
            }
            else if(opcao == 2) {
                System.out.println("Clientes cadastrados:");
                for(Cliente c: listaClientes) {
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() +" | Ag: "+ c.getConta().getAgencia() + " | Conta: "+ c.getConta().getNumero() + " | Saldo: " + c.getConta().getSaldo());
                }

                System.out.print("Digite o id do cliente para realizar o depósito: ");
                id = sc.nextInt();

                System.out.print("Digite o valor do depósito: ");
                valor = sc.nextDouble();

                existeCliente = false;
                for (Cliente c: listaClientes) {
                    if (c.getId() == id) {
                        c.getConta().Depositar(valor);
                        existeCliente = true;
                        break;
                    }
                }

                if (existeCliente)
                    System.out.print("Depósito realizado com sucesso!");
                else
                    System.out.print("Cliente não existente!");

                System.in.read();
            }
            else if(opcao == 3) {
                System.out.println("Clientes cadastrados:");
                for(Cliente c: listaClientes) {
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() + " | Saldo: " + c.getConta().getSaldo());
                }

                System.out.print("Digite o id do cliente para realizar o saque: ");
                id = sc.nextInt();

                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();

                existeCliente = false;
                for (Cliente c: listaClientes) {
                    if (c.getId() == id) {
                        c.getConta().Sacar(valor);
                        existeCliente = true;
                        break;
                    }
                }
                if (existeCliente)
                    System.out.print("Saque realizado com sucesso!");
                else
                    System.out.print("Cliente não existente!");

                System.in.read();
            }

            else if(opcao == 4) {
                System.out.println("Clientes cadastrados:");
                for(Cliente c: listaClientes) {
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() + " | Saldo: " + c.getConta().getSaldo());
                }

                System.out.print("Digite o id do cliente de origem: ");
                id_origem = sc.nextInt();

                System.out.print("Digite o id do cliente de destino: ");
                id_destino = sc.nextInt();

                for (Cliente c: listaClientes) {
                    if (c.getId() == id_origem) {
                        cliente_origem = c;
                        break;
                    }
                }

                for (Cliente c: listaClientes) {
                    if (c.getId() == id_destino) {
                        cliente_destino = c;
                        break;
                    }
                }

                System.out.print("Digite o valor da transferência: ");
                valor = sc.nextDouble();

                cliente_origem.getConta().Transferir(valor, cliente_destino, cliente_origem);

                System.out.print("Transferência realizada com sucesso!");

                System.in.read();
            }

            else if(opcao == 5) {
                System.out.println("Clientes cadastrados:");
                for(Cliente c: listaClientes) {
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome());
                }

                System.out.print("Digite o id do cliente para consultar o saldo: ");
                id = sc.nextInt();

                for (Cliente c: listaClientes) {
                    if (c.getId() == id) {
                        c.getConta().consultarSaldo();
                        break;
                    }
                }

                System.in.read();
            } else if (opcao == 6) {
                System.out.println("Clientes cadastrados:");
                for(Cliente c: listaClientes) {
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome());
                }

                System.out.print("Digite o id do cliente para consultar o extrato: ");
                id = sc.nextInt();
                for (Cliente c: listaClientes) {
                    if (c.getId() == id) {
                        c.getConta().consultarExtrato();
                        break;
                    }
                }
                System.in.read();
            }


        }while( (opcao >= 1) && (opcao <= 6) );
    }

}

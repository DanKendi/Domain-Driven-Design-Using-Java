package Aula07.Exemplo;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Cliente c3 = new Cliente();
//
//        c3.setId(3);
//        c3.setNome("Daniel");
//        c3.setTelefone("011 987456321");
//        c3.setSaldo(1500);
//        System.out.printf("Id: %d - Nome: %s - Tel: %s - Saldo: %.2f\n", c3.getId(), c3.getNome(), c3.getTelefone(), c3.getSaldo());

        Cliente c4 = new Cliente();

        System.out.print("Informe o id do cliente: ");
        c4.setId(in.nextInt());

        System.out.print("Informe o nome do cliente: ");
        c4.setNome(in.next());

        System.out.print("Informe o telefone do cliente: ");
        c4.setTelefone(in.next());

        c4.depositar(120);

        System.out.printf("Id: %d - Nome: %s - Tel: %s - Saldo: %.2f\n", c4.getId(), c4.getNome(), c4.getTelefone(), c4.getSaldo());

    }
}

package Aula06.Exemplo;

public class Programa {


    public static void main(String[] args) {
        // Usando construtor padrão
        Cliente c1 = new Cliente();
        c1.id = 2;
        c1.nome = "Lucas";
        c1.telefone = "011 987646487";
        c1.saldo = 100;

        Cliente c2 = new Cliente(1, "Joseffe", "011 987646487", 100);

        c1.depositar(100);
        c2.depositar(20);

        c1.sacar(5);
        c2.sacar(200);
        System.out.println(c1.getInformacoesCliente());
        System.out.println(c2.getInformacoesCliente());


    }

}

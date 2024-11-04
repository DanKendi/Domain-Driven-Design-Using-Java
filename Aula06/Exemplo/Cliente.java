package Aula06.Exemplo;

public class Cliente {
    public int id;
    public String nome;
    public String telefone;
    public double saldo;

    // Construtor não padrão (parâmetros)
    public Cliente(int id, String nome, String telefone, double saldo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    // Construtor padrão
    public Cliente() {

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public String getInformacoesCliente() {
        String info = "Nome: " + this.nome + " - Id: " + this.id + " - Tel: " + this.telefone + " - Saldo: " + this.saldo;
        return info;
    }
}

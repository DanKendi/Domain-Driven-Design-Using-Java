package Aula06.Aula;

public class InfosCliente {
    public String nome;
    public String conta;
    public String agencia;
    public double saldo;


    //    public InfosCliente(String nome, String conta, String agencia, double saldo){
//        this.nome = nome;
//        this.conta = conta;
//        this.agencia = agencia;
//        this.saldo = saldo;
//    }
    public InfosCliente() {

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }

    public String getInfosCliente() {
        String infos = "Nome: " + this.nome + " - Conta: " + this.conta + " - Agência: " + this.agencia + " - Saldo: " + this.saldo;
        return infos;
    }

}

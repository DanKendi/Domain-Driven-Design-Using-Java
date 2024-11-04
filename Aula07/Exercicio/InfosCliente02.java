package Aula07.Exercicio;

public class InfosCliente02 {
    private String nome;
    private String conta;
    private String agencia;
    private double saldo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public String getConta(){
        return conta;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return agencia;
    }

    public InfosCliente02() {

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

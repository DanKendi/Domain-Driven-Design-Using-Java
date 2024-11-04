package Aula07.Exemplo;

public class Cliente {
    //
    private int id;
    private String nome;
    private String telefone;
    private double saldo;

    //Método SET para escrita
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Método GET para leitura
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public double getSaldo(){
        return saldo;
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

}

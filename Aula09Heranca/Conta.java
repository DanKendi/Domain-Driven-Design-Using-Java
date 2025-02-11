package Aula09Heranca;

public class Conta {
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void Depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }else
            System.out.println("Valor inválido!!");
    }
}

package Checkpoint02;

import java.util.ArrayList;

public class ContaBancaria {
    private String agencia;
    private String numero;
    private double saldo;
    private ArrayList<String> extrato = new ArrayList<>();
    private final double limite;
    private boolean eTransferencia;
    private boolean transferenciaOk;

    ContaBancaria() {
        this.limite = 75;
    }

    ContaBancaria(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 75;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
        } else {
            this.saldo += valor;
            if (!transferenciaOk) {
                this.extrato.add("Depositado R$: " + valor);
            }
        }
    }

    public void Sacar(double valor) {
        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            if (eTransferencia) {
                transferenciaOk = true;
            } else {
                this.extrato.add("Saque R$: " + valor);
            }
        } else
            System.out.println("Saldo insuficiente para saque!");
    }

    public void Transferir(double valor, Cliente clienteDestino, Cliente clienteOrigem) {
        eTransferencia = true;
        Sacar(valor);
        if (transferenciaOk) {
            extrato.add("Transferido R$: " + valor + " para " + clienteDestino.getNome());
            clienteDestino.getConta().Depositar(valor);
            clienteDestino.getConta().extrato.add("Transferência de R$: " + valor + "de " + clienteOrigem.getNome());
        }
        eTransferencia = false;
        transferenciaOk = false;
    }

    public void consultarSaldo() {
        System.out.println("O seu saldo é R$ " + this.saldo);
    }

    public void consultarExtrato() {
        System.out.println("Resumo do Extrato: ");
        for (int i = 0; i < extrato.size(); i++) {
            System.out.println(extrato.get(i));
        }
    }

}

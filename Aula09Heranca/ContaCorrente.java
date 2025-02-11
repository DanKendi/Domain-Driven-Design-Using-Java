package Aula09Heranca;
// As heranças são passadas para as SubClasses e ela pode ser uma SuperClasse de outra.
public class ContaCorrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

package Contas;

public class ContaPoupanca extends ContaBancaria {

    double limite;

    // polimorfismo estatico ou de sobrecarga
    public ContaPoupanca(String numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    // polimorfismo estatico ou de sobrecarga
    public ContaPoupanca() {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {

    }

    @Override
    public void MostrarDadosConta() {

    }

    @Override
    public String toString() {
        return "Contas.ContaPoupanca{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }
}

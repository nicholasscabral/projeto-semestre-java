public class ContaPoupanca extends ContaBancaria {

    double limite;

    public ContaPoupanca(String numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
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
    public void DadosConta() {

    }
}

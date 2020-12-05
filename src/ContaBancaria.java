public abstract class ContaBancaria implements DadosConta {

    double saldo;
    String numeroConta;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void transferir(double valor, ContaBancaria conta);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }
}

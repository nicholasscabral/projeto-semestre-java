public class ContaCorrente extends ContaBancaria {

    double taxa;

    // polimorfismo estatico ou de sobrecarga
    public ContaCorrente(String numeroConta, double saldo, double taxa) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    // polimorfismo estatico ou de sobrecarga
    public ContaCorrente() {

    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) System.out.println("Operação recusada - Saldo insuficiente");
        else {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if (valor > saldo) System.out.println("Operação recusada - Saldo insuficiente");
        else {
            this.sacar(valor);
            conta.depositar(valor);
            System.out.println("Transferencia realizada");
        }
    }

    @Override
    public void DadosConta() {
        System.out.println("Dados da conta ={\n" +
                "   Numero: " + numeroConta + "\n" +
                "   Saldo: " + saldo + "\n" +
                "   Taxa:" + taxa + "\n}");
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxa=" + taxa +
                ", saldo=" + saldo +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }
}
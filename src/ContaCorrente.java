public class ContaCorrente extends ContaBancaria {

    int taxa;

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
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
        System.out.println("Dados da conta ={\n" +
                "   Numero: " + numeroConta + "\n" +
                "   Saldo: " + saldo + "\n" +
                "   Taxa:" + taxa + "\n}");
    }
}

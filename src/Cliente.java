import Contas.ContaBancaria;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class Cliente extends Pessoa implements MostrarDadosCliente {

    String tipoDeConta;
    ContaBancaria conta;

    public Cliente(String nome, String cpf, String tipoDeConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoDeConta = tipoDeConta;
    }

    public Cliente() {

    }

    @Override
    public void CriarConta(String numeroConta, double saldo, double taxa) {
        if (tipoDeConta.equals("Corrente")) new ContaCorrente(numeroConta, saldo, taxa);
        else if (tipoDeConta.equals("Poupanca")) new ContaPoupanca();
    }

    @Override
    public void ExcluirConta() {

    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    @Override
    public void MostrarDadosCliente() {
        System.out.println("Dados do cliente {\n" +
                "   Nome: " + nome + "\n" +
                "   Cpf: " + cpf + "\n" +
                "   Conta: ");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoDeConta='" + tipoDeConta + '\'' +
                ", conta=" + conta +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

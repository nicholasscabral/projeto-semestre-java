package Clientes;

import Contas.ContaBancaria;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

import java.util.Random;

public class Cliente extends Pessoa implements MostrarDadosCliente {

    String tipoDeConta;
    ContaBancaria conta;
    Random gerarRandom = new Random();

    public Cliente(String nome, String cpf, String tipoDeConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.CriarConta(tipoDeConta);
    }

    public Cliente() {

    }

    @Override
    public void CriarConta(String tipoDeConta) {
        if (tipoDeConta.equals("Corrente") || tipoDeConta.equals("corrente")) {
            String numeroConta = "";
            for (int i = 0; i < 12; i++) {
                numeroConta += String.valueOf(gerarRandom.nextInt(9));
            }
            this.conta = new ContaCorrente(numeroConta, 1000, 0.05);
        }
        else if (tipoDeConta.equals("Poupanca") || tipoDeConta.equals("poupanca")) {
            String numeroConta = "";
            for (int i = 0; i < 12; i++) {
                numeroConta += String.valueOf(gerarRandom.nextInt(9));
            }
            this.conta = new ContaPoupanca(numeroConta, 1000, 500);
        }
        //else System.out.println("Cliente cadastrado com conta nula");
    }

    @Override
    public void ExcluirConta() {
        this.conta = null;
    }

    public void transferir(double valor, Cliente cliente) {
        if (valor > conta.getSaldo()) System.out.println("Operação negada - Saldo insuficiente");
        else {
            this.conta.transferir(valor, cliente.conta);
            System.out.println("Tranferencia Realizada");
        }
    }

    public ContaBancaria getConta() {
        return conta;
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
                "   Conta: " + conta + "\n}");
    }

    @Override
    public String toString() {
        return "Clientes.Cliente{" +
                "tipoDeConta='" + tipoDeConta + '\'' +
                ", conta=" + conta +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

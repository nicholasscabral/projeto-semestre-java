package Clientes;

import Contas.ContaBancaria;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa implements MostrarDadosCliente {

    String tipoDeConta;
    ContaBancaria conta;
    Scanner input = new Scanner(System.in);
    Random gerarRandom = new Random();

    public Cliente(String nome, String cpf, String tipoDeConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoDeConta = tipoDeConta;
    }

    public Cliente() {

    }

    @Override
    public void CriarConta(String tipoDeConta) {
        if (tipoDeConta.equals("Corrente")) {
            String numeroConta = "";
            for (int i = 0; i < 12; i++) {
                numeroConta += String.valueOf(gerarRandom.nextInt(9));
            }
            System.out.println("saldo ");
            double saldo = input.nextDouble();
            System.out.println("taxa");
            double taxa = input.nextDouble();

            this.conta = new ContaCorrente(numeroConta, saldo, taxa);

        }
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
                conta + "\n}");
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

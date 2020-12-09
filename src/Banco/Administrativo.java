package Banco;

import Clientes.Cliente;

public class Administrativo extends Banco {

    @Override
    public Cliente CadastrarCliente(String nome, String cpf, String tipoDeConta) {
        return new Cliente(nome, cpf, tipoDeConta);
    }

    @Override
    public void RemoverCliente() {

    }

    @Override
    public void MostrarDadosBanco() {

    }
}

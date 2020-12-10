package Banco;

import Clientes.Cliente;

import java.util.ArrayList;

public abstract class Banco implements MostrarDadosBanco {
    public abstract Cliente CadastrarCliente(String nome, String cpf, String tipoDeConta);
    public abstract void RemoverCliente(ArrayList lista, Cliente cliente);

    @Override
    public String toString() {
        return super.toString();
    }
}

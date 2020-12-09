package Banco;

import Clientes.Cliente;

public abstract class Banco implements MostrarDadosBanco {
    public abstract Cliente CadastrarCliente(String nome, String cpf, String tipoDeConta);
    public abstract void RemoverCliente();

    @Override
    public String toString() {
        return super.toString();
    }
}

package Banco;

import Clientes.Cliente;
import java.util.ArrayList;

public class Administrativo extends Banco {

    @Override
    public Cliente CadastrarCliente(String nome, String cpf, String tipoDeConta) {
        return new Cliente(nome, cpf, tipoDeConta);
    }

    @Override
    public void RemoverCliente(ArrayList lista, Cliente cliente) {
        lista.remove(cliente);
    }

    @Override
    public void MostrarDadosBanco(int a, int b) {
        System.out.println("Dados do Banco {\n" +
                "   Numero de Clientes: " + a + "\n" +
                "   Numero de Contas: " + b + "\n}");
    }
}

package Clientes;

import java.util.ArrayList;

public class Clientes implements MostrarDadosCliente {

    ArrayList<Cliente> ListaDeClientes = new ArrayList<>();

    public Clientes(Cliente cliente) {
        this.addCliente(cliente);
    }

    public ArrayList<Cliente> getLista() {
        return ListaDeClientes;
    }

    public Clientes () {}

    public void addCliente(Cliente cliente) {
        ListaDeClientes.add(cliente);
    }

    @Override
    public void MostrarDadosCliente() {
        ListaDeClientes.forEach(Cliente::MostrarDadosCliente);
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "ListaDeClientes=" + ListaDeClientes +
                '}';
    }
}

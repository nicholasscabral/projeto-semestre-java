package Clientes;

import java.util.ArrayList;

public class Clientes implements MostrarDadosCliente {

    ArrayList<Cliente> ListaDeClientes = new ArrayList<>();

    public void addCliente(Cliente cliente) {
        ListaDeClientes.add(cliente);
    }

    @Override
    public void MostrarDadosCliente() {
        ListaDeClientes.forEach(Cliente::MostrarDadosCliente);
    }
}

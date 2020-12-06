package Clientes;

import java.util.ArrayList;

public class Clientes implements MostrarDadosCliente {

    ArrayList<Cliente> Clientes = new ArrayList<>();

    public void addCliente(Cliente cliente) {
        Clientes.add(cliente);
    }

    @Override
    public void MostrarDadosCliente() {
        Clientes.forEach(Cliente::MostrarDadosCliente);
    }
}

package Contas;

import java.util.ArrayList;

public class Contas implements MostrarDadosConta {

    ArrayList<ContaBancaria> ListaDeContas = new ArrayList();

    public Contas(ContaBancaria conta) {
        this.addConta(conta);
    }

    public Contas () {}

    public void addConta(ContaBancaria conta) {
        ListaDeContas.add(conta);
    }

    @Override
    public void MostrarDadosConta() {
        ListaDeContas.forEach(ContaBancaria::MostrarDadosConta);
    }

    @Override
    public String toString() {
        return "Contas{" +
                "ListaDeContas=" + ListaDeContas +
                '}';
    }
}

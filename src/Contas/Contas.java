package Contas;

import java.util.ArrayList;

public class Contas implements MostrarDadosConta {

    ArrayList<ContaBancaria> Contas = new ArrayList();

    public void addConta(ContaBancaria conta) {
        Contas.add(conta);
    }

    @Override
    public void MostrarDadosConta() {
        for (ContaBancaria conta : Contas) {
            conta.MostrarDadosConta();
        }
    }
}

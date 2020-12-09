package Banco;

public abstract class Banco implements MostrarDadosBanco {
    public abstract void CadastrarCliente();
    public abstract void RemoverCliente();

    @Override
    public String toString() {
        return super.toString();
    }
}

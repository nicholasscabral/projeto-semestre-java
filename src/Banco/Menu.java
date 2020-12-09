package Banco;

import Clientes.Clientes;
import Clientes.Cliente;
import Contas.Contas;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Administrativo gerencia = new Administrativo();
        Clientes ListaDeClientes = new Clientes();
        Contas ListaDeContas = new Contas();
        Scanner input = new Scanner(System.in);
        boolean refazer = true;
        int fazer;

        while (refazer) {
            System.out.println("O que deseja fazer? \n" +
                    "1- Cadastrar um cliente \n" +
                    "2- Excluir um cliente \n" +
                    "3- Ver lista de clientes");
            fazer = input.nextInt();
            if (fazer == 1) {
                System.out.println("Nome do cliente");
                String nome = input.next();

                System.out.println("CPF do cliente");
                String cpf = input.next();

                System.out.println("Tipo de conta");
                String tipoDeConta = input.next();

                Cliente cliente = gerencia.CadastrarCliente(nome, cpf, tipoDeConta);
                ListaDeClientes.addCliente(cliente);
                ListaDeClientes.MostrarDadosCliente();

                System.out.println("Deseja realizar outra operação");
                refazer = input.nextBoolean();
            }
            else if (fazer == 2) {

            }
        }
    }
}

package Banco;

import Clientes.Clientes;
import Clientes.Cliente;
import Contas.Contas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Administrativo gerencia = new Administrativo();

        Clientes Clientes = new Clientes();
        ArrayList<Cliente> ListaDeCliente = Clientes.getLista();

        Contas ListaDeContas = new Contas();

        Scanner input = new Scanner(System.in);
        boolean refazer = true;
        int fazer;

        Clientes.addCliente(new Cliente("nicholas", "101010", "Corrente"));
        Clientes.addCliente(new Cliente("Pedro", "202020", "Poupanca"));
        Clientes.addCliente(new Cliente("Joao", "303030", "Corrente"));

        while (refazer) {
            try {
                System.out.println("O que deseja fazer? \n" +
                        "1- Cadastrar um cliente \n" +
                        "2- Excluir um cliente \n" +
                        "3- Ver lista de clientes \n" +
                        "4- Ver lista de contas \n" +
                        "5- Sair");
                fazer = input.nextInt();
                if (fazer == 1) {
                    try {
                        System.out.println("Nome do cliente");
                        String nome = input.next();

                        System.out.println("CPF do cliente");
                        String cpf = input.next();

                        System.out.println("Tipo de conta");
                        String tipoDeConta = input.next();

                        Cliente cliente = gerencia.CadastrarCliente(nome, cpf, tipoDeConta);

                        Clientes.addCliente(cliente);
                        ListaDeContas.addConta(cliente.getConta());
                        System.out.println("Cliente Cadastrado.");

                        System.out.println("Deseja realizar outra operação");
                        refazer = input.nextBoolean();
                    } catch (InputMismatchException exception) {
                        System.out.println("fechando programa");
                        break;
                    }
                }
                else if (fazer == 2) {
                    System.out.println("CPF do cliente que deseja excluir");
                    String cpf = input.next();

                    for (Cliente cliente : ListaDeCliente){
                        String cpfCliente = cliente.getCpf();
                        if (cpfCliente.equals(cpf)) {
                            gerencia.RemoverCliente(ListaDeCliente, cliente);
                            System.out.println("Cliente de cpf: " + cpfCliente + " excluido com sucesso.");
                        }
                    }
                }
                else if (fazer == 3) {
                    Clientes.MostrarDadosCliente();
                    System.out.println("Deseja realizar outra operação");
                    refazer = input.nextBoolean();
                }
                else if (fazer ==4 ) {
                    ListaDeContas.MostrarDadosConta();
                    System.out.println("Deseja realizar outra operação");
                    refazer = input.nextBoolean();
                }
                else if (fazer == 5) {
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("cancelando execução o programa");
                break;
            }
        }
    }
}

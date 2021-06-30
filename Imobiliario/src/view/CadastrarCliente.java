package view;

import utils.Console;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

    private static ClienteController controller = ClienteController.retornarInstancia();
    private static Cliente cliente;

    public static void renderizar() {
        cliente = new Cliente();

        System.out.println("\n-----CADASTRO DE CLIENTE-----");
        cliente.setNome(Console.lerString("\nNome: "));

        cliente.setCpf(Console.lerString("\nCPF: "));

        cliente.setEmail(Console.lerString("\nEmail: "));

        cliente.setSalario(Console.lerFloat("\nSalario: "));

        cliente.setGarantia(Console.lerString("\nPossui forma de garantia? (SIM/NÃO)"));

        if (controller.cadastrar(cliente)) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Esse cliente ja existe");
        }

    }
}
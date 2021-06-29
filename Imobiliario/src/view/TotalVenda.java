package view;

import controllers.ComercioController;
import models.Comercio;
import models.Venda;

public class TotalVenda {
    private static ComercioController controller = ComercioController.retornarInstancia();

    public static void renderizar() {
        int contador = 0;
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR VENDAS -- \n");
        for (Comercio comercioCadastrada : controller.listarAluguel()) {
            if (comercioCadastrada instanceof Venda)
                contador++;
        }

        System.out.println("contador: " + contador);
    }
}
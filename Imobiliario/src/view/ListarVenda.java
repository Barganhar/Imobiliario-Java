package view;

import controllers.VendaController;
import models.Venda;

public class ListarVenda {
    public static void renderizar() {
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR VENDA -- \n");
        for (Venda vendaCadastrada : VendaController.listar()) {
            System.out.println(vendaCadastrada);
        }

    }
}

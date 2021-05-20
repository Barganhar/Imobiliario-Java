package view;

import controllers.VendaController;
import models.Venda;

public class TotalVenda {
    public static void renderizar() {
        System.out.println("\n".repeat(20));
        System.out.println("\n -- Total de vendas -- \n");
        for (Venda numeroVenda : VendaController.numero()) {
            System.out.println(numeroVenda);
        }
        System.out.println("\n -- Valor total de vendas -- \n");
        for (Venda valorVenda : VendaController.valor()) {
            System.out.println(valorVenda);
        }
    }
}
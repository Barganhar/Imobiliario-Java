package view;

import controllers.AluguelController;
import models.Aluguel;

public class TotalAluguel {
    public static void renderizar() {
        System.out.println("\n".repeat(20));
        System.out.println("\n -- Total de alguel -- \n");
        for (Aluguel numeroCadastrada : AluguelController.numero()) {
            System.out.println(numeroCadastrada);
        }
        System.out.println("\n -- Valor total de aluguel -- \n");
        for (Aluguel valorCadastrada : AluguelController.valor()) {
            System.out.println(valorCadastrada);
        }
    }
}
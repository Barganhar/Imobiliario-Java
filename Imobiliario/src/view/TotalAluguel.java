package view;

import controllers.ComercioController;
import models.Aluguel;
import models.Comercio;

public class TotalAluguel {

    private static ComercioController controller = ComercioController.retornarInstancia();

    public static void renderizar() {
        int contador = 0;
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR ALUGUEL -- \n");
        for (Comercio comercioCadastrada : controller.listarAluguel()) {
            if (comercioCadastrada instanceof Aluguel)
                contador++;
        }

        System.out.println("contador: " + contador);
    }
}
package view;

import controllers.ComercioController;
import models.Aluguel;
import models.Comercio;

public class TotalAluguel {

    private static ComercioController controller = ComercioController.retornarInstancia();

    public static void renderizar() {
        Double total = (double) 0;
        Double valor = (double) 0;
        int contador = 0;
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR ALUGUEL -- \n");
        for (Comercio comercioCadastrada : controller.listarAluguel()) {
            if (comercioCadastrada instanceof Aluguel)
                contador++;
            valor = comercioCadastrada.getValor();
            total = total + valor;
        }

        System.out.println("alugueis ativos: " + contador + "\ntotal a receber: " + total);
    }
}
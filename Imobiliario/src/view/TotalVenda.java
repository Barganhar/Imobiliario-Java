package view;

import controllers.ComercioController;
import models.Comercio;
import models.Venda;

public class TotalVenda {
    private static ComercioController controller = ComercioController.retornarInstancia();

    public static void renderizar() {
        Double total = (double) 0;
        Double valor = (double) 0;
        int contador = 0;
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR VENDAS -- \n");
        for (Comercio comercioCadastrada : controller.listarVenda()) {
            if (comercioCadastrada instanceof Venda) {
                valor = comercioCadastrada.getValor();
                total = total + valor;
                contador++;
            }
        }

        System.out.println("vendas feitas: " + contador + "\ntotal recebido: " + total);
    }

}
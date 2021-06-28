package view;

import controllers.ComercioController;
import models.Comercio;
import models.Venda;

public class ListarVenda {

    private static ComercioController controller = ComercioController.retornarInstancia();

    public static void renderizar() {
        System.out.println("\n".repeat(20));
        System.out.println("\n -- LISTAR VENDA -- \n");
        for(Comercio comercioCadastrada : controller.listar()) {
			if(comercioCadastrada instanceof Venda)
				System.out.println(comercioCadastrada);
		} 

    }
}

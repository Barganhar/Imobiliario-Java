package view;

import java.util.Scanner;
import controllers.ComercioController;

public class DevolucaoAluguel {
    private static Scanner sc = new Scanner(System.in);
    private static ComercioController controllerComercio = ComercioController.retornarInstancia();

    public static void renderizar() {
        System.out.println("\nInsira o Nome do inquilino que deseja operar a devolução: ");
        if (controllerComercio.deletar(sc.next())) {
            System.out.println("\n Casa devolvida com sucesso!");
        } else
            System.out.println("\n Aluguel solicitado não existe");

    }
}

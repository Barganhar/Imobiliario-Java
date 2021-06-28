package view;

import java.util.Scanner;
import controllers.AluguelController;

public class DevolucaoAluguel {
    private static Scanner sc = new Scanner(System.in);

    public static void renderizar() {
        System.out.println("\nInsira o Nome da casa que deseja devolver: ");
        if (AluguelController.deletar(sc.next())) {
            System.out.println("\n Casa devolvida com sucesso!");
        } else
            System.out.println("\n Aluguel solicitado não existe");

    }
}

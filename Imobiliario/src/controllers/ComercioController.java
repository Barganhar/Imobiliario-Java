// package controllers;

// import java.util.ArrayList;

// import models.Comercio;
// import models.Circulo;
// import models.Retangulo;
// import models.Triangulo;

// public class ComercioController {

// 	private static ArrayList<Comercio> comercios = new ArrayList<Comercio>();
//     private static ArrayList<Circulo> circulos = new ArrayList<Circulo>();
//     private static ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
//     private static ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();

// 	public static void cadastrar(Comercio comercio) {
// 		comercios.add(comercio);

//         if(comercio instanceof Retangulo){
//             retangulos.add((Retangulo) comercio);
//         }
//         if(comercio instanceof Triangulo) {
//             triangulos.add((Triangulo) comercio);
//         } 
//         if(comercio instanceof Circulo) {
//             circulos.add((Circulo) comercio);
//         }
// 	}

//     public static ArrayList<Comercio> listar() {
// 		return comercios;
// 	}

//     public static ArrayList<Comercio> listarVenda() {
// 		return comercios;
// 	}

//     public static ArrayList<Comercio> listarAluguel() {
// 		return comercios;
// 	}

package controllers;

import java.util.ArrayList;

import models.Comercio;
import view.IComercio;

public class ComercioController implements IComercio {

    // Singleton
    private static ComercioController controllerComercio;

    public static ComercioController retornarInstancia() {
        if (controllerComercio == null) {
            controllerComercio = new ComercioController();
        }
        return controllerComercio;
    }

    private ArrayList<Comercio> comercios = new ArrayList<Comercio>();

    @Override
    public boolean cadastrar(Comercio comercio) {
        for (Comercio comercioCadastrada : comercios) {
            if (comercioCadastrada.getCliente().equals(comercio.getCliente())) {
                return false;
            }
        }
        comercios.add(comercio);
        return true;
    }

    @Override
    public Comercio buscarPorCliente(String cliente) {
        for (Comercio comercioCadastrada : comercios) {
            if (comercioCadastrada.getCliente().equals(cliente)) {
                return comercioCadastrada;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Comercio> listar() {
        return comercios;
    }

}

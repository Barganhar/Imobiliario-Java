package view;

import java.util.ArrayList;
import models.Comercio;

public interface IComercio {
    public boolean cadastrar(Comercio c);

    public ArrayList<Comercio> listar();

    public Comercio buscarPorCliente(String Cliente);
}
package view;

import java.util.ArrayList;

import models.Aluguel;
import models.Comercio;
import models.Venda;

public interface IComercio {
    public boolean cadastrar(Comercio comercio);

    public ArrayList<Comercio> listar();

    public ArrayList<Aluguel> listarAluguel();

    public ArrayList<Venda> listarVenda();

    public Comercio buscarPorCasa(String casa);

    public Boolean deletar(String nome);
}
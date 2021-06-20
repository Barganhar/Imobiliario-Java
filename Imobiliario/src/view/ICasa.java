package view;

import java.util.ArrayList;
import models.Casa;

public interface ICasa {
    public boolean cadastrar(Casa c);

    public ArrayList<Casa> listar();

    public Casa buscarPorNome(String Nome);

    public Boolean deletar(String nome);

    public void alterar(String nome, int op, String newValue);

    public void alterar(String nome, int op, Double newValue);
}
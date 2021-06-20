package view;

import models.Corretor;
import java.util.ArrayList;

public interface ICorretor {
    public ArrayList<Corretor> listar();

    public boolean cadastrar(Corretor corretor);

    public Corretor buscarPorCpf(String cpf);

    public Boolean deletar(String cpf);

    public void alterar(String cpf, int op, String newValue);
}

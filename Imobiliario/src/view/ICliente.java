package view;

import models.Cliente;
import java.util.ArrayList;

public interface ICliente {
    public ArrayList<Cliente> listar();

    public boolean cadastrar(Cliente cliente);

    public Cliente buscarPorCpf(String cpf);

    public Boolean deletar(String cpf);

    public void alterar(String cpf, int op, String newValue);

    public void alterar(String cpf, int op, Float newValue);

}

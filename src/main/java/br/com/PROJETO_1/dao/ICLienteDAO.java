package br.com.PROJETO_1.dao;

import br.com.PROJETO_1.domain.Cliente;

import java.util.Collection;

public interface ICLienteDAO {

public Boolean cadastrar(Cliente cliente) ;
public void excluir  (Long cpf);
public void atualizar(Cliente cliente);

public Cliente consultar (Long cpf);

    public Collection<Cliente> buscarTodos();


}

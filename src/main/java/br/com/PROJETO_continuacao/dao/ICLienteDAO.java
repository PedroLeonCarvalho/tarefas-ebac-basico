package br.com.PROJETO_continuacao.dao;

import br.com.PROJETO_continuacao.domain.Cliente;

import java.util.Collection;

public interface ICLienteDAO {

public Boolean cadastrar(Cliente cliente) ;
public void excluir  (Long cpf);
public Cliente atualizar(Cliente cliente);
public Cliente consultar (Long cpf);

    public Collection<Cliente> buscarTodos();


}

package br.com.PROJETO_continuacao.domain;

import br.com.PROJETO_continuacao.dao.ICLienteDAO;

import java.util.Collection;

public class ClienteDaoMock implements ICLienteDAO {
    @Override
    public Boolean cadastrar (Cliente cliente) {
        return true;
    }

    @Override
    public void excluir(Long cpf) {
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
    return cliente;
    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente cliente = new Cliente();
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}

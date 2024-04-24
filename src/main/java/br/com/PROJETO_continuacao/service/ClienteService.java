package br.com.PROJETO_continuacao.service;

import br.com.PROJETO_continuacao.dao.ICLienteDAO;
import br.com.PROJETO_continuacao.domain.Cliente;
import br.com.PROJETO_continuacao.tests.IClienteService;

public class ClienteService implements IClienteService {

    ICLienteDAO clienteDAO;

    public ClienteService(ICLienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public ClienteService() {
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        clienteDAO.cadastrar(cliente);
        System.out.println("Cliente salvo");
        return true;
    }
    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return  clienteDAO.consultar(cpf);

    }

    @Override
    public boolean excluir(Long cpf) {
        clienteDAO.excluir(cpf);
        return true;
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        clienteDAO.atualizar(cliente);
        return cliente;

    }


}


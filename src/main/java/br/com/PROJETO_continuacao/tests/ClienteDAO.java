package br.com.PROJETO_continuacao.tests;

import br.com.PROJETO_continuacao.dao.ICLienteDAO;
import br.com.PROJETO_continuacao.domain.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ClienteDAO implements ICLienteDAO{

    List<Cliente> lista = new ArrayList<>();

    @Override
    public Boolean cadastrar(Cliente cliente) {
        lista.add(cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
       lista.removeIf(cliente -> cliente.getCpf() == cpf);

    }

    @Override
    public Cliente atualizar(Cliente cliente) {
       var cpf = cliente.getCpf();
       var clienteEncontrado = lista.stream().filter(cliente1 -> cliente1.getCpf() == cliente.getCpf()).findFirst();
    if (clienteEncontrado.isPresent()) {
        clienteEncontrado.orElseThrow().setCidade(cliente.getCidade());
        clienteEncontrado.orElseThrow().setNome(cliente.getNome());
        clienteEncontrado.orElseThrow().setEstado(cliente.getCidade());
        clienteEncontrado.orElseThrow().setEnd(cliente.getEnd());
        clienteEncontrado.orElseThrow().setTel(cliente.getTel());
    }

    return cliente;
    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}

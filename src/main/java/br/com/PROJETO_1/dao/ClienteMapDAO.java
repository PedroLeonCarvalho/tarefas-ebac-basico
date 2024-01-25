package br.com.PROJETO_1.dao;

import br.com.PROJETO_1.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements ICLienteDAO {

    public Map<Long, Cliente> map;

    public ClienteMapDAO () { map = new HashMap<>() ;}
    @Override
    public Boolean cadastrar (Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        map.put(cliente.getCpf(), cliente);
        return true;
    }
    @Override
    public Cliente consultar(Long cpf) {
   return this.map.get(cpf);
    }


    @Override
    public void atualizar (Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }
    @Override
    public void excluir(Long cpf) {
     Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }





    @Override
    public Collection<Cliente> buscarTodos() {
        return map.values();
    }}



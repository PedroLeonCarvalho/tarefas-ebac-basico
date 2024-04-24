package br.com.PROJETO_continuacao.tests;

import br.com.PROJETO_continuacao.domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
    boolean excluir (Long cpf) ;

    Cliente atualizar(Cliente cliente);
}



package br.com.modulo_29_projeto.DAO;

import br.com.modulo_29_projeto.Domain.Cliente;
import br.com.modulo_29_projeto.Domain.Produto;

import java.util.List;

public interface IProdutoDAO {

    public Integer cadastrar(Produto produto) throws Exception;

    public Integer atualizar(Produto produto) throws Exception;

    public Produto buscar(String nome) throws Exception;

    public List<Produto> buscarTodos() throws Exception;

    public Integer excluir(Produto produto) throws Exception;
}

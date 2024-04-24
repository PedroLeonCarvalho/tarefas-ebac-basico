package br.com.PROJETO_continuacao.tests;

import br.com.PROJETO_continuacao.dao.ICLienteDAO;
import br.com.PROJETO_continuacao.domain.Cliente;
import br.com.PROJETO_continuacao.domain.ClienteDaoMock;
import br.com.PROJETO_continuacao.service.ClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ClienteTest {

    IClienteService iClienteService;
    IClienteService iClienteServiceMock;
    ClienteDaoMock dao;
    public ClienteTest(IClienteService iClienteService, ICLienteDAO icLienteDAO) {
        this.iClienteService = new ClienteService();
        this.iClienteServiceMock = new ClienteService(dao);

    }
    Cliente cliente = new Cliente();
    @Before
    public void pesquisarCliente() {

        cliente.setNome("João");
        cliente.setCpf(12345678900L);
        cliente.setTel(1234567890L);
        cliente.setEnd("Rua das Flores");
        cliente.setNumero(123);
        cliente.setCidade("Cidade Fictícia");
        cliente.setEstado("Estado Fictício");

    }
        @Test
        public void buscar() {
Cliente clienteConsultado = iClienteServiceMock.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
}
        @Test
    public void salvar() {
        var result =iClienteServiceMock.salvar(cliente);
            Assert.assertTrue(result);
        }

        @Test
    public void excluir () {
       var result = iClienteServiceMock.excluir(cliente.getCpf());
            Assert.assertTrue(result);
        }

        @Test
    public void atualizarDados () {
        iClienteServiceMock.atualizar(cliente);

        }






}


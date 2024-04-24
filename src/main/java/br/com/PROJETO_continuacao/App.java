package br.com.PROJETO_continuacao;

import br.com.PROJETO_continuacao.dao.ClienteMapDAO;
import br.com.PROJETO_continuacao.dao.ICLienteDAO;
import br.com.PROJETO_continuacao.domain.Cliente;

import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class App {

   public static ICLienteDAO cLienteDAO;
    public static void main(String[] args) {

cLienteDAO = new ClienteMapDAO();


    String opcao = JOptionPane.showInputDialog(null,
            "Digite 1 para cadastro, 2 para consulta, 3 para atualizar, 4 para remover e 5 para sair.", "Cadastro", INFORMATION_MESSAGE);

    while (!isOpcaoValida(opcao)) {
        if ("".equals(opcao)) {
            sair() ;}

       opcao = JOptionPane.showInputDialog(null,
              "Opcao invalida Digite 1 para cadastro, 2 para consulta, 3 para atualizar, 4 para remover e 5 para sair.", "Cadastro", INFORMATION_MESSAGE);

    }

    while (isOpcaoValida(opcao)){

        if (isOpcaoSair(opcao)) { sair();}

        else if (isOpcaoCadastrar(opcao)) {
            String dados = JOptionPane.showInputDialog(null,
                    "\"Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado\"", "Cadastro", INFORMATION_MESSAGE);
            cadastrar(dados);

        } else if (isOpcaoConsultar (opcao)) {
          String dados = JOptionPane.showInputDialog(null,
                  "\"Digite o cpf do cliente \"", "Cadastro", INFORMATION_MESSAGE);
            consultar(dados);

        } else if (isOpcaoAtualizar(opcao)) {
           String dados = JOptionPane.showInputDialog(null,
                   "\"Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado\"", "Cadastro", INFORMATION_MESSAGE);
            atualizar(dados);


        } else if (isOpcaoExcluir(opcao)) {
            String cpf = JOptionPane.showInputDialog(null,
                    "\"Digite o cpf a ser excluido", "exclusao", INFORMATION_MESSAGE);
            excluir(cpf);

        }
        opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consulta, 3 para atualizar, 4 para excluir ou 5 para sair",
                "Green dinner", INFORMATION_MESSAGE);

        }
    }

    private static void excluir (String cpf) {
        Long l = Long.parseLong(cpf);
    cLienteDAO.excluir(l);
    }


    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
       Cliente cliente = new Cliente(dadosSeparados[0] ,dadosSeparados[1] ,dadosSeparados[2] ,dadosSeparados[3] ,dadosSeparados[4] ,dadosSeparados[5] ,dadosSeparados[6]);
       cLienteDAO.atualizar(cliente);

    }

    private static boolean isOpcaoAtualizar(String opcao) {
   if("3".equals(opcao)){
   return true;
    } return false ;}


    private static void consultar(String dados) {

        Cliente cliente = cLienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            String mensagem = "Cliente encontrado:\n" +
                    "Nome: " + cliente.getNome() + "\n" +
                    "CPF: " + cliente.getCpf() + "\n" +
                    "Telefone: " + cliente.getTel() + "\n" +
                    "Endereço: " + cliente.getEnd() + "\n" +
                    "Número: " + cliente.getNumero() + "\n" +
                    "Cidade: " + cliente.getCidade() + "\n" +
                    "Estado: " + cliente.getEstado();
            JOptionPane.showMessageDialog(null, mensagem, "Sucesso", INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(null, "Cliente nao encontrado" );

    }

    private static boolean isOpcaoConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isOpcaoExcluir(String opcao) {
    if("4".equals(opcao)){
    return  true;
    } return false; }


    private static void cadastrar(String dados) {
        if (dados != null) {
        String[] dadosSeparados = dados.split(",");
            if (dadosSeparados.length == 7) {
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1],dadosSeparados[2],dadosSeparados[3]
        ,dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = cLienteDAO.cadastrar(cliente);

                if (isCadastrado) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso", INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", INFORMATION_MESSAGE);
                }
            }
    } }



    private static boolean isOpcaoSair(String opcao) {
        return opcao != null && "5".equals(opcao);

    }


    private static boolean isOpcaoCadastrar(String opcao) {
       if ("1".equals(opcao)) {
           return true;
       } return false;

    }


    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair", INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) ||"2".equals(opcao)
                ||"3".equals(opcao) ||"4".equals(opcao) ||"5".equals(opcao) ){
        return true;
        }
         return false;
    }

}


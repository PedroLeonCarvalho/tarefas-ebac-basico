package br.com.heranca;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{

    String cpf;
    LocalDate nascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}

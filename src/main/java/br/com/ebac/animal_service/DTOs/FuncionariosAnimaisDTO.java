package br.com.ebac.animal_service.DTOs;

public class FuncionariosAnimaisDTO {

    private String nomeFuncionario;
    private Long totalAnimaisResgatados;

    public FuncionariosAnimaisDTO() {
    }

    public FuncionariosAnimaisDTO(String nomeFuncionario, Long totalAnimaisResgatados) {
        this.nomeFuncionario = nomeFuncionario;
        this.totalAnimaisResgatados = totalAnimaisResgatados;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Long getTotalAnimaisResgatados() {
        return totalAnimaisResgatados;
    }

    public void setTotalAnimaisResgatados(Long totalAnimaisResgatados) {
        this.totalAnimaisResgatados = totalAnimaisResgatados;
    }
}

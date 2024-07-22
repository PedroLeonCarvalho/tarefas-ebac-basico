package br.com.ebac.animal_service.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column    (nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private int idadeEstimada;

    @Column(nullable = false)
    @Embedded
    private Especie especie;

    @Column    (nullable = false)
    private LocalDate dataEntrada;

    private LocalDate dataAdocao;

    @Column    (nullable = false)
    private String condicoesChegada;

    @Column (nullable = false, name = "cpf_recebedor")
    private String cpfFuncionarioRecebedor;

    @Column    (nullable = false)
    private String nomeRecebedor;

    private LocalDate dataObto;

    @Column    (nullable = false)
    private String porte;

    public int getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(int idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }



    public Long getId() {
        return id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public LocalDate getDataObto() {
        return dataObto;
    }

    public void setDataObto(LocalDate dataObto) {
        this.dataObto = dataObto;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public br.com.ebac.animal_service.entidades.Especie getEspecie() {
        return especie;
    }

    public void setEspecie(br.com.ebac.animal_service.entidades.Especie especie) {
        especie = especie;
    }
}

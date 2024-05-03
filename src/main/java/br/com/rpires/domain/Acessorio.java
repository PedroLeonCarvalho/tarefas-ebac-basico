package br.com.rpires.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Long id;

    private String nomeAcesorio;
    @ManyToMany
    @JoinTable(name= "carro_acessorio")
    @JoinColumn (name = "acessorio_id")
    @JoinColumn(name = "carro_id")
    private List<Carro> carros;

}

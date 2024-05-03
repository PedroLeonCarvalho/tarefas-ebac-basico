package br.com.rpires.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Long id;

    private String modelo;
    @ManyToOne
    @JoinColumn(name= "marca_id")
    private Marca marca;
    @ManyToMany (mappedBy = "carros")
    private List<Acessorio> acessorio;
}

package br.com.rpires.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Long id;
    private String nome;
    @OneToMany (mappedBy = "marca")
    private List<Carro> carro;
}

package com.example.avioes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_fabricante")
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_fabricante")
    private Integer id;

    @Column(name = "nome_fabricante")
    private String nome;

    @Column(name = "pais_fabricante")
    private String pais;

    @OneToMany(mappedBy = "fabricante")
    @JsonManagedReference
    private List<Aviao> avioes;
}

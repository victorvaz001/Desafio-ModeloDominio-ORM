package com.victorvaz.dominioORM.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    public Categoria(){
    }

    public Categoria(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}

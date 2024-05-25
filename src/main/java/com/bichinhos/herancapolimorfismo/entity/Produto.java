package com.bichinhos.herancapolimorfismo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Produto {

    private int id;
    private String nomeProduto;
    private String descricao;
    private Double preco;

    public Produto(int id, String nomeProduto, String descricao, Double preco) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
    }
}

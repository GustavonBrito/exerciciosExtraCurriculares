package com.bichinhos.herancapolimorfismo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class ItemPedido {

    private int id;
    private String produto;
    private int quantidade;
    private Double precoUnitario;
    public ItemPedido(int id, String produto, int quantidade, Double precoUnitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
}

package com.bichinhos.herancapolimorfismo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Cliente {
    @Id
    @GeneratedValue()
    private int id;
    private String nome;
    private String endereco;

    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
}

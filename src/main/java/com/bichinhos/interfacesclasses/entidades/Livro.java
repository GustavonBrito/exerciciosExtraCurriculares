package com.bichinhos.interfacesclasses.entidades;

import com.bichinhos.interfacesclasses.servicos.livro.ICalculavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro implements ICalculavel {

    private String nome;
    private Double precoBase;

    private Double desconto;

    public Livro(String nome, Double precoBase, Double desconto) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    @Override
    public Double calcularPrecoFinal() {
        Double valorfinal = this.precoBase - this.desconto;
        System.out.println("O valor final do livro " + this.nome +" é R$ " + "" + valorfinal);
        return valorfinal;
    }
}

package com.bichinhos.interfacesclasses.entidades;


import com.bichinhos.interfacesclasses.servicos.vendavel.IVendavel;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Celular implements IVendavel {
    private Number id;
    private String modelo;
    private int precoUnitario;
    private int qtdEstoque;

    public Celular(Number id, String modelo, int precoUnitario, int qtdEstoque) {
        this.id = id;
        this.modelo = modelo;
        this.precoUnitario = precoUnitario;
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public int calcularPrecoTotal(int quantidade) {
        int valorFinalProduto = 0;

        if(this.qtdEstoque != 0){
            System.out.println("O modelo de celular " + this.modelo + " está disponivel no valor de R$ " + this.precoUnitario);
            valorFinalProduto =  this.precoUnitario;
        }else{
            System.out.println("Não temos o produto disponivel");
        }
        return valorFinalProduto;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        System.out.println("O valor final com desconto fica em R$ " + (this.precoUnitario - desconto));
        return this.precoUnitario * desconto;
    }
}

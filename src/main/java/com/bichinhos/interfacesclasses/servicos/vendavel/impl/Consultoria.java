package com.bichinhos.interfacesclasses.servicos.vendavel.impl;

import com.bichinhos.interfacesclasses.servicos.vendavel.IVendavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Consultoria implements IVendavel {

    private int precoHora;
    private int horasTrabalho;

    public Consultoria(int precoHora, int horasTrabalho) {
        this.precoHora = precoHora;
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public int calcularPrecoTotal(int quantidade) {
        int precoTotal = this.precoHora * this.horasTrabalho;
        System.out.println("O valor total fica em torno de R$ " + precoTotal);
        return precoTotal;
    }
    // aplica o desconto no preço unitário
    @Override
    public double aplicarDesconto(double desconto) {
        double precoHoraConvertido = this.precoHora;
        double precoPorHoraDescontado = precoHoraConvertido - desconto;
        double valorFinalDescontado = precoPorHoraDescontado * this.horasTrabalho;
        System.out.println("O valor total com desconto fica em torno de R$ " + valorFinalDescontado);
        return valorFinalDescontado;
    }
}

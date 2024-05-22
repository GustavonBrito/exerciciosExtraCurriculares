package com.bichinhos.interfacesclasses.entidades;

import com.bichinhos.interfacesclasses.servicos.calculavel.ICalculavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoFisico implements ICalculavel {
    private Double precoBase;
    private Double custoEnvio;
    private Double taxaImposto;

    public ProdutoFisico(Double precoBase, Double custoEnvio, Double taxaImposto) {
        this.precoBase = precoBase;
        this.custoEnvio = custoEnvio;
        this.taxaImposto = taxaImposto;
    }

    @Override
    public Double calcularPrecoFinal() {
        Double envioComPrecoBase = this.precoBase + this.custoEnvio;
        Double valorTotal =  envioComPrecoBase * this.taxaImposto;
        String valorTotalFormatado = String.format("%.2f", valorTotal);
        System.out.println("O valor final com os impostos é R$" + " " + valorTotalFormatado);
        return valorTotal;
    }
}

package com.bichinhos.interfacesclasses.servicos.calculadorasalaretangular.impl;

import com.bichinhos.interfacesclasses.servicos.calculadorasalaretangular.ICalculoGeometrico;

public class CalculoGeometrico implements ICalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        double areaSala = altura * largura;
        System.out.println("A área da sala é " + "" + areaSala + "m²");
        return areaSala;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetroSala = 2 * (largura * altura);
        System.out.println("O perimetro da sala é " + "" + perimetroSala + "m²");
        return perimetroSala;
    }
}

package com.bichinhos.interfacesclasses.servicos.tabuadamultiplicacao.impl;

import com.bichinhos.interfacesclasses.servicos.tabuadamultiplicacao.ITabuada;

public class Tabuada implements ITabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for(int i = 1; i <= 10; i += 1){
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}

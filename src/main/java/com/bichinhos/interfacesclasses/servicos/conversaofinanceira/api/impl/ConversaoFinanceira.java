package com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.impl;

import com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.IConversaoFinanceira;

public class ConversaoFinanceira implements IConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar, double dolarNaBolsa) {
        String formattedValue = String.format("%.2f", valorDolar * dolarNaBolsa);
        System.out.println("O valor convertido para real é R$ "+""+ formattedValue);
    }
}

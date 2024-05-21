package com.bichinhos.exerciciosextracurriculares.currencyconversion.api.service.impl;

import com.bichinhos.exerciciosextracurriculares.currencyconversion.api.service.IConversaoFinanceira;

public class ConversaoFinanceira implements IConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar, double dolarNaBolsa) {
        String formattedValue = String.format("%.2f", valorDolar * dolarNaBolsa);
        System.out.println("O valor convertido para real é R$ "+""+ formattedValue);
    }
}

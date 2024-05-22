package com.bichinhos.interfacesclasses.servicos.conversortemperatura.impl;

import com.bichinhos.interfacesclasses.servicos.conversortemperatura.IConversorTemperatura;

public class ConversorTemperaturaPadrao implements IConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = 9/5 * (celsius + 32);
        System.out.println("O valor convertido é" + " " + fahrenheit + "°F");
        return fahrenheit;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = 5.0 / 9 * (fahrenheit - 32);
//        String temperaturaFormatada = String.format("%.2f", celsius);
        System.out.println("O valor convertido é" + " " + Math.round(celsius) + "°C");
        return celsius;
    }
}

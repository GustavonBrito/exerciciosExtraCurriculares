package com.bichinhos.interfacesclasses;

import com.bichinhos.interfacesclasses.entidades.Celular;
import com.bichinhos.interfacesclasses.entidades.ProdutoFisico;
import com.bichinhos.interfacesclasses.servicos.calculadorasalaretangular.impl.CalculoGeometrico;
import com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.ApiMoeda;
import com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.dto.MoedaDto;
import com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.impl.ConversaoFinanceira;
import com.bichinhos.interfacesclasses.servicos.conversortemperatura.impl.ConversorTemperaturaPadrao;
import com.bichinhos.interfacesclasses.entidades.Livro;
import com.bichinhos.interfacesclasses.servicos.tabuadamultiplicacao.impl.Tabuada;
import com.bichinhos.interfacesclasses.servicos.vendavel.impl.Consultoria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExerciciosExtraCurricularesApplication {
	public static void main(String[] args) {

		// Conversão Financeira
		System.out.println("Conversão Financeira-----------------------------------------------------------------------------");
		ConversaoFinanceira conversaoFinanceira = new ConversaoFinanceira();
		ApiMoeda moedaApi = new ApiMoeda();
		List<Double> valorMontanteDol = new ArrayList<>();
		double mediaDolares = 0.0;
		try {
			List<MoedaDto> valorDolar = moedaApi.getDolarCurrency();
			for (int i = 0; i < valorDolar.size(); i += 1) {
				valorMontanteDol.add(Double.valueOf(valorDolar.get(i).getHigh()));
			}
			mediaDolares = valorMontanteDol.stream().reduce(0.0, Double::sum) / valorDolar.size();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		conversaoFinanceira.converterDolarParaReal(20,mediaDolares);

		// CalculoGeometrico

		System.out.println("Calculo Geométrico-----------------------------------------------------------------------------");

		CalculoGeometrico calculoGeometrico = new CalculoGeometrico();

		calculoGeometrico.calcularArea(10,10);
		calculoGeometrico.calcularPerimetro(10,10);

		// TabuadaMultiplicacao

		System.out.println("Tabuada Multiplicacao-----------------------------------------------------------------------------");

		Tabuada tabuada = new Tabuada();

		tabuada.mostrarTabuada(3);

		// ConversorTemperatura

		System.out.println("Conversor-----------------------------------------------------------------------------");

		ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

		conversorTemperaturaPadrao.celsiusParaFahrenheit(32.5);
		conversorTemperaturaPadrao.fahrenheitParaCelsius(100);

		// CalculaDescontoLivro

		System.out.println("DescontoLivro-----------------------------------------------------------------------------");

		Livro livro = new Livro("Harry Potter", 1000.00, 300.00);

		livro.calcularPrecoFinal();

		// CalculaPrecoProdutoFisico

		System.out.println("ProdutoFisico-----------------------------------------------------------------------------");

		ProdutoFisico produtoFisico = new ProdutoFisico(10.0, 15.0, 1.10);
		produtoFisico.calcularPrecoFinal();

		// CalculaServiço

		System.out.println("Serviço-----------------------------------------------------------------------------");

		Consultoria consultoria = new Consultoria(500, 8);
		consultoria.calcularPrecoTotal(2);
		consultoria.aplicarDesconto(100);

		// CalculaProduto

		System.out.println("Produto-----------------------------------------------------------------------------");

		Celular celular = new Celular(1,"S23", 2300,1);
		celular.calcularPrecoTotal(1);
		celular.aplicarDesconto(200);
	}
}

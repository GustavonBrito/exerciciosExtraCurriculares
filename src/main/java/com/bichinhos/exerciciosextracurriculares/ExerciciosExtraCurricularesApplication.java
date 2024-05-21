package com.bichinhos.exerciciosextracurriculares;

import com.bichinhos.exerciciosextracurriculares.currencyconversion.api.service.ApiMoeda;
import com.bichinhos.exerciciosextracurriculares.currencyconversion.api.dto.MoedaDto;
import com.bichinhos.exerciciosextracurriculares.currencyconversion.api.service.impl.ConversaoFinanceira;
import java.io.IOException;
import java.util.List;


public class ExerciciosExtraCurricularesApplication {
	public static void main(String[] args) {
		ConversaoFinanceira conversaoFinanceira = new ConversaoFinanceira();
		ApiMoeda moedaApi = new ApiMoeda();
		Float floatValue = null;
		try {
			List<MoedaDto> valorDolar = moedaApi.getDolarCurrency();
			for (int i = 0; i < valorDolar.size(); i += 1) {
				floatValue = Float.valueOf(valorDolar.get(i).getHigh());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		if (floatValue != null){
			conversaoFinanceira.converterDolarParaReal(20,floatValue);
		}

	}
}

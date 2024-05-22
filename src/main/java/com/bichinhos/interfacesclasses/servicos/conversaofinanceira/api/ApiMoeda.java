package com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api;

import com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.dto.MoedaDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ApiMoeda {
    List<MoedaDto> listaDtoMmoeda;
    public List<MoedaDto> getDolarCurrency() throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://economia.awesomeapi.com.br/USD-BRL/5")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            listaDtoMmoeda = mapper.readValue(response.body(), new TypeReference<>(){});

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return listaDtoMmoeda;
    }
}

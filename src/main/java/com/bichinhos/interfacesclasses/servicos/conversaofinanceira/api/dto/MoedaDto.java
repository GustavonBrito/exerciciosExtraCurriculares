package com.bichinhos.interfacesclasses.servicos.conversaofinanceira.api.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoedaDto {
    private String code;
    private String codein;
    private String high;
}

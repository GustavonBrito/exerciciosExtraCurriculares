package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.service.pedido.IPedido;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Pedido implements IPedido {
    @Id
    @GeneratedValue
    private UUID id;
    private String cliente;
    private Date dataPedido;
    private List<String> itens;
    private Double desconto;

    public Pedido(UUID id, String cliente, Date dataPedido, List<String> itens) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.itens = itens;
        this.desconto = 0.0;
    }

    @Override
    public UUID obterId() {
        return null;
    }

    @Override
    public String obterCliente() {
        return null;
    }

    @Override
    public Date obterDataPedido() {
        return null;
    }

    @Override
    public List<String> obterItens() {
        return null;
    }

    @Override
    public Double calcularValorTotal() {
        return null;
    }

    @Override
    public Date aplicarDesconto(double desconto) {
        return null;
    }
}

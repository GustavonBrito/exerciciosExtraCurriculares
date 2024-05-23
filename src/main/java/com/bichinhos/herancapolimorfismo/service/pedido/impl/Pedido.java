package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.service.pedido.IPedido;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Pedido implements IPedido {

    private UUID id;
    private String cliente;
    private Date dataPedido;
    private List<String> item;
    private Double desconto;

    public Pedido(UUID id, String cliente, Date dataPedido, List<String> item) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.item = item;
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

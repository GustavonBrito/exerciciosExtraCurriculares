package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.service.pedido.IPedido;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Pedido implements IPedido {

    private UUID id;

    public Pedido(UUID id) {
        this.id = id;
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

package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PedidoSimples extends Pedido{

    private double freteFixo;

    @Override
    public Double calcularValorTotal() {
        return null;
    }

    public PedidoSimples(double freteFixo, UUID id, String cliente, Date dataPedido, List<String> item) {
        super(id,cliente,dataPedido,item);
        this.freteFixo = freteFixo;
    }
}

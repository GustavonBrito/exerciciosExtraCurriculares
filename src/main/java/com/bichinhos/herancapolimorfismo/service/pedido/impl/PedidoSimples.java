package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PedidoSimples extends Pedido{

    private double freteFixo;

    public PedidoSimples(UUID id, String cliente, Date dataPedido, List<String> itens, double freteFixo) {
        super(id, cliente, dataPedido, itens);
        this.freteFixo = freteFixo;
    }

    @Override
    public Double calcularValorTotal() {
        return null;
    }

}

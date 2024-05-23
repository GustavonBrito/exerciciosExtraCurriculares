package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PedidoExpress extends Pedido{
    private UUID id;
    private Double freteExpresso;

    public PedidoExpress(UUID id, String cliente, Date dataPedido, List<String> itens, UUID id1) {
        super(id, cliente, dataPedido, itens);
        this.id = id1;
    }
}

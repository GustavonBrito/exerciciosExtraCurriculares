package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import java.util.UUID;

public class PedidoSimples extends Pedido{

    private String modo;

    @Override
    public UUID obterId() {
        return super.obterId();
    }

    public PedidoSimples(String modo, UUID id) {
        super(id);
        this.modo = modo;
    }
}

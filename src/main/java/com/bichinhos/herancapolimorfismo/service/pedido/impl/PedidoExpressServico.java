package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class PedidoExpressServico extends PedidoServico {
    private int idPedidoExpress;
    private Double freteExpresso;

    public PedidoExpressServico(Cliente cliente, ItemPedido itemPedido, LocalDate dataPedido, Double desconto, int idPedidoExpress, Double freteExpresso) {
        super(cliente, itemPedido, dataPedido, desconto);
        this.idPedidoExpress = idPedidoExpress;
        this.freteExpresso = freteExpresso;
    }

    @Override
    public int obterId() {
        return super.obterId();
    }

    @Override
    public String obterCliente() {
        return super.obterCliente();
    }

    @Override
    public Date obterDataPedido() {
        return super.obterDataPedido();
    }

    @Override
    public List<String> obterItens() {
        return super.obterItens();
    }

    @Override
    public Double calcularValorTotal() {
        return super.calcularValorTotal();
    }

    @Override
    public Date aplicarDesconto(double desconto) {
        return super.aplicarDesconto(desconto);
    }

    //    @Override
//    public Double calcularValorTotal() {
//        Double valorPedidoComFreteExpress = 0.0;
//        if(getDesconto() != 0){
//            valorPedidoComFreteExpress = getPrecoItens() + this.freteExpresso - getDesconto();
//            return valorPedidoComFreteExpress;
//        }else{
//            return getPrecoItens() + this.freteExpresso;
//        }
//    }
}

package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class PedidoSimplesServico extends PedidoServico {

    private int idPedidoSimples;
    private double freteFixo;

    public PedidoSimplesServico(Cliente cliente, ItemPedido itemPedido, LocalDate dataPedido, Double desconto, int idPedidoSimples, double freteFixo) {
        super(cliente, itemPedido, dataPedido, desconto);
        this.idPedidoSimples = idPedidoSimples;
        this.freteFixo = freteFixo;
    }

    @Override
    public int obterId() {
        System.out.println("O id do pedido simples: ");
        return this.idPedidoSimples;
    }

    @Override
    public String obterCliente() {
        return super.obterCliente();
    }

    @Override
    public LocalDate obterDataPedido() {
        System.out.println("A data do pedido do cliente " + super.getCliente().getNome() + " foi em " +super.getDataPedido());
        return super.getDataPedido();
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
    public LocalDate aplicarDesconto(double desconto) {
        return super.aplicarDesconto(desconto);
    }

    //    @Override
//    public Double calcularValorTotal() {
//        Double valorPedidoComFreteFixo = 0.0;
//        if(getDesconto() != 0){
//            valorPedidoComFreteFixo = getPrecoItens() + this.freteFixo - getDesconto();
//            return valorPedidoComFreteFixo;
//        }else{
//            return getPrecoItens() + this.freteFixo;
//        }
//    }

}

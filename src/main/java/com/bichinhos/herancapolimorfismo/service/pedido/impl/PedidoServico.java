package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.service.pedido.IPedidoServico;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class PedidoServico implements IPedidoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    private Cliente cliente;
    private ItemPedido itemPedido;
    private LocalDate dataPedido;
   private Double desconto;

    public PedidoServico(Cliente cliente, ItemPedido itemPedido, LocalDate dataPedido, Double desconto) {
        this.cliente = cliente;
        this.itemPedido = itemPedido;
        this.dataPedido = dataPedido;
        this.desconto = desconto;
    }

    @Override
    public int obterId() {
        return this.idPedido;
    }

    @Override
    public String obterCliente() {
        System.out.println(this.cliente);
        return null;
    }

    @Override
    public LocalDate obterDataPedido() {
        return this.dataPedido;
    }

    @Override
    public List<String> obterItens() {
        List<String>itens = new ArrayList<>();
        itens.add(this.itemPedido.getProduto());
        for (String item: itens){
            System.out.println(item);
        }
        return null;
    }

    @Override
    public Double calcularValorTotal() {
        return null;
    }

    @Override
    public LocalDate aplicarDesconto(double desconto) {
        return null;
    }

}

package com.bichinhos.herancapolimorfismo.service.pedido.impl;

import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.service.pedido.IPedido;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
public class Pedido implements IPedido  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    private Cliente cliente;
    private ItemPedido itemPedido;
    private LocalDate dataPedido;
   private Double desconto;

    public Pedido(Cliente cliente, ItemPedido itemPedido, LocalDate dataPedido, Double desconto) {
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
        System.out.println(this.cliente);;
        return null;
    }

    @Override
    public Date obterDataPedido() {
        return null;
    }

    @Override
    public List<String> obterItens() {
        List<String>itens = null;
        itens.add(this.itemPedido.getProduto());
        for (int i = 0; i < itens.size(); i++){
            System.out.println(itens.get(i));
        }
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

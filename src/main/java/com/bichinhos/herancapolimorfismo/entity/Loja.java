package com.bichinhos.herancapolimorfismo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Loja {
    private int id;
    private String nome;
    private List<Produto> listaProdutos;

    public Loja(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private void adicionarProduto(Produto produto){
        this.listaProdutos.add(produto);
        System.out.println("O produto" + produto.getNomeProduto() + "foi adicionado na lista de produtos");
    }
    private void removerProduto(Produto produto){
        this.listaProdutos.remove(produto);
        System.out.println("O produto" + produto.getNomeProduto() + "foi removido da lista de produtos");
    }

//    private void criarPedido(Cliente cliente, List<ItemPedido> itens){
//        this.listaProdutos.add(produto);
//        System.out.println("O produto" + produto.getNomeProduto() + "foi adicionado na lista de produtos");
//    }
//
//    private void listarPedidos(){
//        this.listaProdutos.add(produto);
//        System.out.println("O produto" + produto.getNomeProduto() + "foi adicionado na lista de produtos");
//    }
//
//    private void obterPedidoPorId(){
//        this.listaProdutos.add(produto);
//        System.out.println("O produto" + produto.getNomeProduto() + "foi adicionado na lista de produtos");
//    }
//    private void calcularFaturamentoTotal(){
//        this.listaProdutos.add(produto);
//        System.out.println("O produto" + produto.getNomeProduto() + "foi adicionado na lista de produtos");
//    }

}
package com.bichinhos.herancapolimorfismo.service.pedido;


import java.util.Date;
import java.util.List;

public interface IPedidoServico {

    int obterId ();
    String obterCliente ();
    Date obterDataPedido ();
    List<String> obterItens();
    Double calcularValorTotal ();
    Date aplicarDesconto (double desconto);

}
